package org.firstinspires.ftc.teamcode.RehanLearn;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class IfLearn extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        /*
        boolean aButton = gamepad1.a;

        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        }
        else {
            telemetry.addData("A Button", "NOT Pressed");
        }
        telemetry.addData("A Button State", aButton);
        */
        double leftY = gamepad1.left_stick_y;
        boolean a = gamepad1.a;

        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Sitck", "In Dead Zone");
        }
        if (!a) {
            telemetry.addData("Speed", "Normal(0.5)");
        }
        else {
            telemetry.addData("Speed", "TURBO!!!");
        }
        /*
        if (leftY < 0) {
            telemetry.addData("Left Stick", "Is Negative");
        } else if (leftY > 0.5) {
            telemetry.addData("Left Stick", "Greater than 50%");
        } else if (leftY > 0) {
            telemetry.addData("Left Stick", "Is Greater Than 0");
        } else {
            telemetry.addData("Left Stick", "Is 0");
        }
         */
        telemetry.addData("Left Stick Value", leftY);
}

}
