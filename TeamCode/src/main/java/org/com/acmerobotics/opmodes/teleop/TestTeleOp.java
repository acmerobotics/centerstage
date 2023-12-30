package org.com.acmerobotics.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp
public class TestTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor DcMotorE = hardwareMap.get(DcMotor.class, "m4");
        DcMotorE.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        DcMotorE.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        double CPR = 537;
//
//        int position = DcMotorE.getCurrentPosition();
//        double revolutions = position/CPR;
//
//        double angle = revolutions * 360;
//        double angleNormalized = angle % 360;
        waitForStart();
        while(opModeIsActive()) {

            //}
//            if (gamepad1.left_trigger == 1){
            telemetry.addLine("L trigger");
            DcMotorE.setTargetPosition(591);
            DcMotorE.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            DcMotorE.setPower(1);


            //}
//            if (DcMotorE.getCurrentPosition() >= -144){
//                DcMotorE.setPower(0);

//            }

            telemetry.update();
            telemetry.addData("Pos", DcMotorE.getCurrentPosition());
            telemetry.addData("target", DcMotorE.getTargetPosition());
        }



    }
}
