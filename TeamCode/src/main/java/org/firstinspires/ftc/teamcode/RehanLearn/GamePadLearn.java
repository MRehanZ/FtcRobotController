package org.firstinspires.ftc.teamcode.RehanLearn;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadLearn extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double leftSpeedForward = -gamepad1.left_stick_y / 2;
        double rightSpeedForward = -gamepad1.right_stick_y / 2;
        telemetry.addData("Left x", gamepad1.left_stick_x);
        telemetry.addData("Left y", leftSpeedForward);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("Right x", gamepad1.right_stick_x);
        telemetry.addData("Right y", rightSpeedForward);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("Difference x", gamepad1.left_stick_x - gamepad1.right_stick_x);
        telemetry.addData("Sum triggers", gamepad1.left_trigger + gamepad1.right_trigger);
    }
}
