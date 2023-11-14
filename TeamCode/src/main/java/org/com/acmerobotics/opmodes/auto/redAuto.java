package org.com.acmerobotics.opmodes.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.com.acmerobotics.robot.Drive;

@Autonomous(name="redAuto", group="Robot")
public class redAuto extends LinearOpMode {
    @Override

    public void runOpMode(){
        Drive drive = new Drive();

        waitForStart();
        drive.init(hardwareMap);
        //while(opModeIsActive()){
        drive.moveForwardOneTile();
        while( opModeIsActive() && (drive.runTime.seconds() < 0.5)){

        }
        drive.runTime.reset();
        drive.moveForwardOneTile();
        while( opModeIsActive() && (drive.runTime.seconds() < 0.5)){

        }
        drive.rotate90Degrees();
        while( opModeIsActive() && (drive.runTime.seconds() < 1)){

        }
        drive.runTime.reset();
        drive.rotate90Degrees();
        while( opModeIsActive() && (drive.runTime.seconds() < 1)){

        }
        drive.moveForwardOneTile();
        while( opModeIsActive() && (drive.runTime.seconds() < 0.5)){

        }
        drive.runTime.reset();
        drive.moveForwardOneTile();
        while( opModeIsActive() && (drive.runTime.seconds() < 0.5)){

        }
        drive.moveForwardOneTile();
        while( opModeIsActive() && (drive.runTime.seconds() < 0.5)){

        }
        drive.runTime.reset();
        drive.moveForwardOneTile();
        while( opModeIsActive() && (drive.runTime.seconds() < 0.5)){

        }
    }
}

