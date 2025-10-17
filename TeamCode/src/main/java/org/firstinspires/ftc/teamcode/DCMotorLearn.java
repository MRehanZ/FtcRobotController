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

    double motorSpeed = 0.5;

    @Override
    public void loop() {
         if (gamepad1.a) {
            bench.setMotorSpeed(motorSpeed);
        } else if (!gamepad1.a) {
            bench.setMotorSpeed(0);
        }

        telemetry.addData("Speed", motorSpeed);

        if (gamepad1.leftBumperWasPressed()) {
            motorSpeed -= 0.1666667;
        } else if (gamepad1.rightBumperWasPressed()) {
            motorSpeed += 0.1666667;
        }

        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}
