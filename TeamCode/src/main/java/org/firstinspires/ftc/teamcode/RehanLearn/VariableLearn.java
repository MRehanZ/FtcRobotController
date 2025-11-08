package org.firstinspires.ftc.teamcode.RehanLearn;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class VariableLearn extends OpMode {
    @Override
    public void init() {
        int teamNumber = 32086;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Photon Phoenix";
        int motorAngle = 50;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Team Name", teamName);
        telemetry.addData("Motor Angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
