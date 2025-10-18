package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchDistance;

@TeleOp
public class DistanceLearn extends OpMode {
    TestBenchDistance bench = new TestBenchDistance();


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {

        telemetry.addData("Distance", bench.getDistance());


    }
}
