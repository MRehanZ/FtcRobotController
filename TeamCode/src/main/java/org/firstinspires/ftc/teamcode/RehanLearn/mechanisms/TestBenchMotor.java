package org.firstinspires.ftc.teamcode.RehanLearn.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBenchMotor {
    private DcMotor flywheelMotor;
    private double ticksPerRev;

    public void init(HardwareMap hwMap) {
        flywheelMotor = hwMap.get(DcMotor.class, "Flywheel");
        flywheelMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = flywheelMotor.getMotorType().getTicksPerRev();
        flywheelMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        flywheelMotor.setDirection(DcMotorSimple.Direction.REVERSE);

    }



    public void setMotorSpeed(double speed) {
        flywheelMotor.setPower(speed);
    }

    public double getMotorRevs() {
        return flywheelMotor.getCurrentPosition() / ticksPerRev;
    }
}