package org.com.acmerobotics.robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Drive {
    HardwareMap hMap = null;
//    public int motorCount = 6;
//    public int wheelCount = 4;
//    public double power = 0.5;
//    public void moveForward(double input){
//        //Motor stuff
//
//    }
    DcMotor DcMotorA = null;
    DcMotor DcMotorB = null;
    DcMotor DcMotorC = null;
    DcMotor DcMotorD = null;
    double forwardSpeed = 0.6;
    double backwardSpeed = 0.5;
    double turnSpeed = 0.4;
    public ElapsedTime runTime = new ElapsedTime();
    public double distanceTraveled(){
        return 0.1;
    }

    public void init(HardwareMap hardwareMap){
        hMap = hardwareMap;

        DcMotorA = hMap.get(DcMotor.class, "m0");
        DcMotorB = hMap.get(DcMotor.class, "m1");
        DcMotorC = hMap.get(DcMotor.class, "m2");
        DcMotorD = hMap.get(DcMotor.class, "m3");
        runTime.reset();
        DcMotorA.setDirection(DcMotorSimple.Direction.REVERSE);
        DcMotorB.setDirection(DcMotorSimple.Direction.REVERSE);
        //Servo gripServo = hardwareMap.get(Servo.class, "S0");
    }
    public void moveForwardOneTile() {
        if (runTime.seconds() < 0.5) {
            DcMotorA.setPower(forwardSpeed);
            DcMotorB.setPower(forwardSpeed);
            DcMotorC.setPower(forwardSpeed);
            DcMotorD.setPower(forwardSpeed);
        }

        if (runTime.seconds() > 0.5) {
            DcMotorA.setPower(0);
            DcMotorB.setPower(0);
            DcMotorC.setPower(0);
            DcMotorD.setPower(0);
        }
    }

    public void moveBackOneTile() {
        if (runTime.seconds() < 0.5) {
            DcMotorA.setPower(-backwardSpeed);
            DcMotorB.setPower(-backwardSpeed);
            DcMotorC.setPower(-backwardSpeed);
            DcMotorD.setPower(-backwardSpeed);
        }

        if (runTime.seconds() > 0.5) {
            DcMotorA.setPower(0);
            DcMotorB.setPower(0);
            DcMotorC.setPower(0);
            DcMotorD.setPower(0);
        }
    }

    public void rotate90Degrees() {
        // Adjust motor powers and duration for a 90-degree turn
        if (runTime.seconds() < 1) {
            DcMotorA.setPower(turnSpeed);
            DcMotorB.setPower(turnSpeed);
            DcMotorC.setPower(-turnSpeed);
            DcMotorD.setPower(-turnSpeed);
        }

        if (runTime.seconds() > 1) {
            DcMotorA.setPower(0);
            DcMotorB.setPower(0);
            DcMotorC.setPower(0);
            DcMotorD.setPower(0);
        }
    }
    public void unrotate90Degrees() {
        // Adjust motor powers and duration for a 90-degree turn
        if (runTime.seconds() < 1) {
            DcMotorA.setPower(-turnSpeed);
            DcMotorB.setPower(-turnSpeed);
            DcMotorC.setPower(turnSpeed);
            DcMotorD.setPower(turnSpeed);
        }

        if (runTime.seconds() > 1) {
            DcMotorA.setPower(0);
            DcMotorB.setPower(0);
            DcMotorC.setPower(0);
            DcMotorD.setPower(0);
        }
    }

    public void strafeRightOneTile() {
        if (runTime.seconds() < 1.0) {
            DcMotorA.setPower(0.5);
            DcMotorB.setPower(-0.5);
            DcMotorC.setPower(0.5);
            DcMotorD.setPower(-0.5);
        }

        if (runTime.seconds() > 1.0) {
            DcMotorA.setPower(0);
            DcMotorB.setPower(0);
            DcMotorC.setPower(0);
            DcMotorD.setPower(0);
        }
    }

    public void strafeLeftOneTile() {
        if (runTime.seconds() < 1.0) {
            DcMotorA.setPower(-0.5);
            DcMotorB.setPower(0.5);
            DcMotorC.setPower(-0.5);
            DcMotorD.setPower(0.5);
        }

        if (runTime.seconds() > 1.0) {
            DcMotorA.setPower(0);
            DcMotorB.setPower(0);
            DcMotorC.setPower(0);
            DcMotorD.setPower(0);
        }
    }



//    public void move2Tiles(){
//
//        if(runTime.seconds() < 1.72){
//            DcMotorA.setPower(forwardSpeed);
//            DcMotorB.setPower(forwardSpeed);
//            DcMotorC.setPower(forwardSpeed);
//            DcMotorD.setPower(forwardSpeed);
//        }
//
//        if (runTime.seconds() > 1.72 ){
//            DcMotorA.setPower(0);
//            DcMotorB.setPower(0);
//            DcMotorC.setPower(0);
//            DcMotorD.setPower(0);
//        }
//
//    }
}


