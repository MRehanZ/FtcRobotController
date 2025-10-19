package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchMotor;

@TeleOp
public class FlywheelCode extends OpMode {
    TestBenchMotor bench = new TestBenchMotor();
    double motorSpeed;
    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            bench.setMotorSpeed(1.0);
        } else if (gamepad1.b) {
            bench.setMotorSpeed(0.75);
        } else if (gamepad1.y) {
            bench.setMotorSpeed(0.5);
        } else if (gamepad1.x) {
            bench.setMotorSpeed(0.25);
        } else {
            bench.setMotorSpeed(0);
        }
        telemetry.addData("Speed", motorSpeed);
        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}