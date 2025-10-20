package org.firstinspires.ftc.teamcode.BackUpDoNotEdit;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchTouchSensor;

@Disabled
@TeleOp
public class TouchSensorLearn extends OpMode {
    TestBenchTouchSensor bench = new TestBenchTouchSensor();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchSensorState = "Not Pressed";
        if (bench.isTouchSensorPressed()) {
            touchSensorState = "Pressed!";
        }
        telemetry.addData("Touck Sensor State", touchSensorState);
    }
}
