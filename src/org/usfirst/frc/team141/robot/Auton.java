package org.usfirst.frc.team141.robot;

import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import org.usfirst.frc.team141.robot.Robot;
import org.usfirst.frc.team141.robot.AutoMethods;
import edu.wpi.first.wpilibj.Timer;

public class Auton {
	
    //int caseInt = 0;
    Conversions convert;
    AutoMethods auto;
	
	public Auton() {
		//Auton Init
		
    	convert = new Conversions();
    	auto = new AutoMethods();

//    	auto.zeroEnc();
    	
    	Robot.leftDriveMotor.changeControlMode(ControlMode.Position);
        Robot.rightDriveMotor.changeControlMode(ControlMode.Position);
        
        Robot.leftDriveMotor.enableBrakeMode(true);
        Robot.rightDriveMotor.enableBrakeMode(true);
        
        Robot.leftDriveMotor.setPID(0.7, 0.0, 0.0);
        Robot.rightDriveMotor.setPID(0.7, 0.0, 0.0);
	}

	public void killPosLoop(){
		
	}
	
	public void autonThing(){
		switch(Robot.caseInt){
			case 0:
				System.out.println("I got to case 0!");
				auto.moveFwd(75);
//				if((Robot.leftDriveMotor.getClosedLoopError() * -1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				//auto.rotateBot(90);
				System.out.println(Robot.leftDriveMotor.getEncPosition() + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * -1) <= 15){
					Robot.caseInt = 0;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * -1) > 145){
						Robot.caseInt = 0;
						}
					else {
						Robot.caseInt = 1;
					}
				}
				break;
			
			case 1:
				System.out.println("I got to case 1!");
				auto.zeroEnc();
				if (Robot.leftDriveMotor.getEncPosition()== 0 && (Robot.leftDriveMotor.getClosedLoopError() * -1) == 0){
					Robot.caseInt = 2;
				}
				else {
					Robot.caseInt = 1;
				}
				break;
				
			case 2:
				System.out.println("I got to case 2!");
				//auto.moveFwd(12);
				auto.rotateBot(44.68);
//				if((Robot.leftDriveMotor.getClosedLoopError() * -1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				Timer.delay(0.01);
				System.out.println(Robot.leftDriveMotor.getEncPosition() + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * -1) <= 15){
					Robot.caseInt = 2;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * -1) > 190){
						Robot.caseInt = 2;
					}
					else {
						Robot.caseInt = 3;
					}
				}

				break;
			case 3:
				System.out.println("I got to case 3!");
				auto.zeroEnc();
				if (Robot.leftDriveMotor.getEncPosition()== 0 && (Robot.leftDriveMotor.getClosedLoopError() * -1) == 0){
					Robot.caseInt = 4;
				}
				else {
					Robot.caseInt = 3;
				}
				break;
			case 4:
				System.out.println("I got to case 4!");
				auto.moveFwd(44);
//				if((Robot.leftDriveMotor.getClosedLoopError() * -1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				System.out.println(Robot.leftDriveMotor.getEncPosition() + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * -1) <= 15){
					Robot.caseInt = 4;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * -1) > 145){
						Robot.caseInt = 4;
					}
					else {
						Robot.caseInt = 5;
					}
				}
				break;
			case 5:
				System.out.println("I got to case 5!");
				auto.zeroEnc();
				if (Robot.leftDriveMotor.getEncPosition()== 0 && (Robot.leftDriveMotor.getClosedLoopError() * -1) == 0){
					Robot.caseInt = 6;
				}
				else {
					Robot.caseInt = 5;
				}
				break;
			case 6:
				System.out.println("I got to case 6!");
				auto.rotateBot(-51);
//				if((Robot.leftDriveMotor.getClosedLoopError() * 1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				System.out.println((Robot.leftDriveMotor.getEncPosition() * -1) + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * 1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * 1) <= 15){
					Robot.caseInt = 6;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * 1) < 190){
						Robot.caseInt = 7;
					}
					else {
						Robot.caseInt = 6;
					}
				}

				break;
			case 7:
				System.out.println("I got to case 7!");
				auto.zeroEnc();
				if (Robot.leftDriveMotor.getEncPosition()== 0 && (Robot.leftDriveMotor.getClosedLoopError() * -1) == 0){
					Robot.caseInt = 8;
				}
				else {
					Robot.caseInt = 7;
				}
				break;
			case 8:
				System.out.println("I got to case 8!");
				auto.moveFwd(30.25);
				Timer.delay(0.01);
//				if((Robot.leftDriveMotor.getClosedLoopError() * -1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				System.out.println((Robot.leftDriveMotor.getEncPosition() * 1) + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * -1) <= 15){
					Robot.caseInt = 8;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * -1) < 145){
						Robot.caseInt = 9;
					}
					else {
						Robot.caseInt = 8;
					}
				}

				break;
			case 9:
				System.out.println("I got to case 9!");
				auto.zeroEnc();
				if (Robot.leftDriveMotor.getEncPosition()== 0 && (Robot.leftDriveMotor.getClosedLoopError() * -1) == 0){
					Robot.caseInt = 10;
				}
				else {
					Robot.caseInt = 9;
				}
				break;
			case 10:
				System.out.println("I got to case 10!");
				auto.rotateBot(-90);
				Timer.delay(0.01);
//				if((Robot.leftDriveMotor.getClosedLoopError() * 1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				System.out.println(Robot.leftDriveMotor.getEncPosition() + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * 1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * 1) <= 15){
					Robot.caseInt = 10;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * 1) > 185){
						Robot.caseInt = 10;
					}
					else {
						Robot.caseInt = 11;
					}
				}
				
				break;
			case 11:
				System.out.println("I got to case 11!");
				auto.zeroEnc();
				if (Robot.leftDriveMotor.getEncPosition()== 0 && (Robot.leftDriveMotor.getClosedLoopError() * -1) == 0){
					Robot.caseInt = 12;
				}
				else {
					Robot.caseInt = 11;
				}
				break;
			case 12:
				System.out.println("I got to case 12!");
				auto.moveFwd(32);
				Timer.delay(0.01);
//				if((Robot.leftDriveMotor.getClosedLoopError() * -1) < 145){
//					Robot.caseInt = 0;
//					break;
//				}
				System.out.println(Robot.leftDriveMotor.getEncPosition() + " Position");
				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + " Error");
				if((Robot.leftDriveMotor.getClosedLoopError() * -1) <= 15){
					Robot.caseInt = 12;
					break;
				}
				else{
					if ((Robot.leftDriveMotor.getClosedLoopError() * -1) > 145){
						Robot.caseInt = 12;
					}
					else {
						Robot.caseInt = 13;
					}
				}
				
				break;
			case 13:
				System.out.println("I got to case 13!");
				Robot.caseInt = 13;
//				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + "error before");
//				System.out.println(Robot.leftDriveMotor.getEncPosition() + "pos before");
				auto.zeroEnc();
//				System.out.println((Robot.leftDriveMotor.getClosedLoopError() * -1) + "error after");
//				System.out.println(Robot.leftDriveMotor.getEncPosition() + "pos after");
				break;
		}

	}
	
	public void firstAuton() {
		
		
        
//        //Where the auton actually starts
//        switch (Robot.caseInt) {
//        	case 0:
//        		System.out.println("I got to case 0!");
//        		
//        		Robot.leftDriveMotor.set(convert.inchToEncoder(5)); //-1733
//                Robot.rightDriveMotor.set(convert.inchToEncoder(5));
//                if ((Robot.leftDriveMotor.getEncPosition()) == convert.inchToEncoder(5))
//                {
//                	Robot.caseInt = 2;
//                	break;
//                }
//                else {
//                Robot.caseInt = 0;
//            	break;
//                }
//                Robot.caseInt = 2;
//                break;
//        	case 1:
//        		System.out.println("I got to case 1!");
//        		
//        		Robot.leftDriveMotor.set(convert.inchToEncoder(-5)); //-1733
//                Robot.rightDriveMotor.set(convert.inchToEncoder(-5));
//                Robot.caseInt = 2;
//                break;
//        	case 2:
//        		System.out.println("I got to case 2!");
//        		//NOTHING!!
//        		break;
//        }
//        
//    	Robot.leftDriveMotor.disableControl();
//    	Robot.rightDriveMotor.disableControl();
	}
	
}
