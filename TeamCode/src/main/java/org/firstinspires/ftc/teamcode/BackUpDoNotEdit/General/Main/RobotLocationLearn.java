package org.firstinspires.ftc.teamcode.BackUpDoNotEdit.General.Main;

public class RobotLocationLearn {
    double angle;
    double x;
    double y;

    // Constructor Method
    public RobotLocationLearn(double angle) {
        this.angle = angle;
    }

    public double getHeading() {
        // This method normalizes robot heading between -180 and 180
        // This is useful for calculation turn angles especially when crossing the 0, 360 boundary


        double angle = this.angle; // Copy the angle of imu
        while (angle > 180) {
            angle -= 360; // Subtract until in target range
        }
        while (angle <= -180) {
            angle += 360; // Add until in target range
        }
        return angle; // Return normalized value

    }

    public void turnRobot(double angleChange) {
        angle += angleChange;
    }

    public void setAngle (double angle) {
        this.angle = angle;
    }

    public double getAngle () {
        return this.angle;
    }

    public void changeX(double changeAmount) {
        x += changeAmount;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void changeY(double changeAmountY) {
        y += changeAmountY;
    }

    public void setY() {
        this.y = y;
    }

    public double getY() {
        return y;
    }
}
