package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchMotor;

@TeleOp
public class DCMotorLearn extends OpMode {
    TestBenchMotor bench = new TestBenchMotor();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    int motorSpeed = 3000;

    @Override
    public void loop() {
         if (gamepad1.a) {
            bench.setMotorSpeed(motorSpeed);
        }

        if (gamepad1.left_bumper) {
            motorSpeed -= 1000;
        } else if (gamepad1.right_bumper) {
            motorSpeed += 1000;
        }

        if (gamepad1.dpad_left) {
            bench.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        } else if (gamepad1.dpad_right) {
            bench.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}
