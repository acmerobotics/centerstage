/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.com.acmerobotics.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.com.acmerobotics.robot.Drive;
import org.firstinspires.ftc.robotcore.external.Telemetry;


/*
 * This file contains an minimal example of a Linear "OpMode". An OpMode is a 'program' that runs in either
 * the autonomous or the teleop period of an FTC match. The names of OpModes appear on the menu
 * of the FTC Driver Station. When a selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a two wheeled robot
 * It includes all the skeletal structure that all linear OpModes contain.
 *
 * Use Android Studio to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this OpMode to the Driver Station OpMode list
 */

@TeleOp(name="Opmode", group="Linear OpMode")

public class BasicOpMode_Linear extends LinearOpMode {



    @Override
    public void runOpMode() {
        DcMotor DcMotorA = hardwareMap.get(DcMotor.class, "m0");
        DcMotor DcMotorB = hardwareMap.get(DcMotor.class, "m1");
        DcMotor DcMotorC = hardwareMap.get(DcMotor.class, "m2");
        DcMotor DcMotorD = hardwareMap.get(DcMotor.class, "m3");
        Drive drive = new Drive();
        DcMotorA.setDirection(DcMotorSimple.Direction.REVERSE);
        DcMotorB.setDirection(DcMotorSimple.Direction.REVERSE);
        //Servo s2 = hardwareMap.get(Servo.class, "S2");
        drive.init(hardwareMap);
        waitForStart();
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            telemetry.addData("m0",DcMotorA.getPower());
//            DcMotorA.setPower(0.3);
            //s2.setPosition(2);
//            if (gamepad1.a){
//                DcMotorA.setPower(.8);
//                DcMotorB.setPower(.5);
//                DcMotorC.setPower(.7);
//                DcMotorD.setPower(-1);
//
//            }



            if (gamepad1.dpad_up){
                DcMotorA.setPower(-0.5);
                DcMotorB.setPower(-0.5);
                DcMotorC.setPower(0.5);
                DcMotorD.setPower(0.5);
                telemetry.addLine("Dpad up Pressed");
            }

            else if (gamepad1.dpad_down){
                DcMotorA.setPower(0.5);
                DcMotorB.setPower(0.5);
                DcMotorC.setPower(-0.5);
                DcMotorD.setPower(-0.5);
                telemetry.addLine("Dpad down Pressed");
            }
            else if (gamepad1.dpad_right){
                DcMotorA.setPower(1);
                DcMotorB.setPower(-1);
                DcMotorC.setPower(1);
                DcMotorD.setPower(-1);
                telemetry.addLine("Dpad right Pressed");
            }
             else if (gamepad1.dpad_left){
                DcMotorA.setPower(-1);
                DcMotorB.setPower(1);
                DcMotorC.setPower(-1);
                DcMotorD.setPower(1);
                telemetry.addLine("Dpad left Pressed");
            }

            else{
                DcMotorA.setPower(0);
                DcMotorB.setPower(0);
                DcMotorC.setPower(0);
                DcMotorD.setPower(0);

            }
            if (gamepad1.left_stick_y != 0){
                DcMotorA.setPower(-gamepad1.left_stick_y);
                DcMotorB.setPower(-gamepad1.left_stick_y);
                DcMotorC.setPower(-gamepad1.left_stick_y);
                DcMotorD.setPower(-gamepad1.left_stick_y);
                //drive.moveForward();

            }
//             else if (gamepad1.left_stick_y == 0) {
//                DcMotorA.setPower(0);
//                DcMotorB.setPower(0);
//                DcMotorC.setPower(0);
//                DcMotorD.setPower(0);
            //}
            else if (gamepad1.right_stick_x != 0){
                DcMotorA.setPower(gamepad1.right_stick_x);
                DcMotorB.setPower(gamepad1.right_stick_x);
                DcMotorC.setPower(-gamepad1.right_stick_x);
                DcMotorD.setPower(-gamepad1.right_stick_x);
            }
            else {
                DcMotorA.setPower(0);
                DcMotorB.setPower(0);
                DcMotorC.setPower(0);
                DcMotorD.setPower(0);
            }

            // Up is Negative, and Down is Positive
            telemetry.addData("Y Sitck Value",gamepad1.left_stick_y);
            telemetry.addData("X Sitck Value",gamepad1.left_stick_x);
            telemetry.addData("Distance Traveled",drive.distanceTraveled());
            telemetry.update();


        }
    }
}
