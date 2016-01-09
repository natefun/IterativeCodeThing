package org.usfirst.frc.team141.robot;

import org.usfirst.frc.team141.robot.Conversions;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.CANTalon.ControlMode;
//import edu.wpi.first.wpilibj.SolenoidBase;
import edu.wpi.first.wpilibj.Solenoid;

public class AutoMethods {
	
	Conversions convert = new Conversions();
	Solenoid solenoid0 = new Solenoid(0);
	Solenoid solenoid1 = new Solenoid(1);
	Solenoid solenoid2 = new Solenoid(2);
	Solenoid solenoid3 = new Solenoid(3);

	public void driveTo(double inch){
		inch = convert.inchToEncoder(inch);

        
        
	}
	public void moveFwd(double inch){
		Robot.leftDriveMotor.set(convert.inchToEncoder(inch));
        Robot.rightDriveMotor.set(convert.inchToEncoder(inch));
        Timer.delay(0.01);
	}
	
	public void moveBck(double inch){
		Robot.leftDriveMotor.set(convert.inchToEncoder(inch * -1 ));
        Robot.rightDriveMotor.set(convert.inchToEncoder(inch * -1 ));
        Timer.delay(0.01);
	}
	
	public void rotateBot(double degree){
		Robot.leftDriveMotor.set(convert.inchToEncoder(degree * .402) );
        Robot.rightDriveMotor.set(convert.inchToEncoder(degree * -.402) );
        Timer.delay(0.01);
	}
	
	public void zeroEnc(){
		Robot.leftDriveMotor.setPosition(0);
		Robot.rightDriveMotor.setPosition(0);
		Robot.leftDriveMotor.set(0);
		Robot.rightDriveMotor.set(0);
		Timer.delay(0.01);
	}
	
	public void fireSolenoid(int solenoid){
		switch(solenoid){
			case 0:
				solenoid0.set(true);
				break;
			case 1:
				solenoid1.set(true);
				break;
			case 2:
				solenoid2.set(true);
				break;
			case 3:
				solenoid3.set(true);
				break;
		}
	}
	
	public void retractSolenoid(int solenoid){
		switch(solenoid){
			case 0:
				solenoid0.set(false);
				break;
			case 1:
				solenoid1.set(false);
				break;
			case 2:
				solenoid2.set(false);
				break;
			case 3:
				solenoid3.set(false);
				break;
		}
	}
	
}
