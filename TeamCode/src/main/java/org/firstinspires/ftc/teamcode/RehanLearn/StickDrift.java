package org.firstinspires.ftc.teamcode.RehanLearn;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class StickDrift extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);
    }
}
