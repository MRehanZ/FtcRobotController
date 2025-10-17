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

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;

        bench.setMotorSpeed(-motorSpeed);

        telemetry.addData("Speed", motorSpeed);

        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}
