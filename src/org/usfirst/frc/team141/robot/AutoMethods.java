package org.usfirst.frc.team141.robot;

import org.usfirst.frc.team141.robot.Conversions;

public class AutoMethods {
	
	Conversions convert = new Conversions();

	public void moveFwd(double inch){
		Robot.leftDriveMotor.set(convert.inchToEncoder(inch));
        Robot.rightDriveMotor.set(convert.inchToEncoder(inch));
	}
	
	public void moveBck(double inch){
		Robot.leftDriveMotor.set(convert.inchToEncoder(inch * -1 ));
        Robot.rightDriveMotor.set(convert.inchToEncoder(inch * -1 ));
	}
	
	public void rotateBot(double degree){
		Robot.leftDriveMotor.set(convert.inchToEncoder(degree * .402) );
        Robot.rightDriveMotor.set(convert.inchToEncoder(degree * -.402) );
	}
	
	public void zeroEnc(){
		Robot.leftDriveMotor.setPosition(0);
		Robot.rightDriveMotor.setPosition(0);
		Robot.leftDriveMotor.set(0);
		Robot.rightDriveMotor.set(0);
	}
	
}
