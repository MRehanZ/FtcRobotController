package org.firstinspires.ftc.teamcode.RehanLearn;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocationLearn robotLocationLearn = new RobotLocationLearn(0);


    @Override
    public void init() {
        robotLocationLearn.setAngle(0);
        robotLocationLearn.setX(0);
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            robotLocationLearn.turnRobot(0.1);
        } else if (gamepad1.b) {
            robotLocationLearn.turnRobot((-0.1));
        }

        telemetry.addData("Heading", robotLocationLearn.getHeading());
        telemetry.addData("Angle", robotLocationLearn.getAngle());

        if (gamepad1.dpad_left) {
            robotLocationLearn.changeX(0.1);
        } else if (gamepad1.dpad_right) {
            robotLocationLearn.changeX(-0.1);
        }

        telemetry.addData("X Is", robotLocationLearn.getX());


        if (gamepad1.dpad_up) {
            robotLocationLearn.changeY(-0.1);
        } else if (gamepad1.dpad_down) {
            robotLocationLearn.changeY(0.1);
        }

        telemetry.addData("Y is", robotLocationLearn.getY());
    }
}