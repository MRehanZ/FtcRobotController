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
        motorSpeed = -gamepad1.left_stick_y;
        bench.setMotorSpeed(motorSpeed);
        telemetry.addData("Speed", motorSpeed);
        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
}