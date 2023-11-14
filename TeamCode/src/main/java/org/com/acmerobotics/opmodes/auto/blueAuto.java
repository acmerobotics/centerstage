package org.com.acmerobotics.opmodes.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.com.acmerobotics.robot.Drive;

@Autonomous(name="blueAuto", group="Robot")
public class blueAuto extends LinearOpMode {
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
        drive.unrotate90Degrees();
        while( opModeIsActive() && (drive.runTime.seconds() < 1)){

        }
        drive.runTime.reset();
        drive.unrotate90Degrees();
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
            //for (int i = 1; i <= 1; i++) {
                //drive.runTime.reset();
                //drive.rotate90Degrees();
            //}
            //for (int i = 1; i <= 2; i++){
               //drive.runTime.reset();
                //drive.moveForwardOneTile();
            //}
        //}
    }
}

