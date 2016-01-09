package org.usfirst.frc.team141.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	static CANTalon leftDriveMotor;
	static CANTalon rightDriveMotor;
	static Joystick leftStick;
	static Joystick rightStick;
	
	double leftStickY = 0;
	double rightStickY = 0;
	
	static int caseInt = 0;
	static int caseTwo = 0;
	
    public void robotInit() {
    	rightDriveMotor = new CANTalon(1); //new talon obj for left motor
    	leftDriveMotor = new CANTalon(2); //new talon obj for right motor
    	leftStick = new Joystick(0);
    	rightStick = new Joystick(1);
    	
    	leftDriveMotor.enableControl(); //enables talons
    	rightDriveMotor.enableControl();
    	
        leftDriveMotor.setVoltageRampRate(24);
        rightDriveMotor.setVoltageRampRate(24);
        
        leftDriveMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        rightDriveMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
        
        leftDriveMotor.reverseSensor(true);
        rightDriveMotor.reverseSensor(true);
        
        leftDriveMotor.reverseOutput(true);
        rightDriveMotor.reverseOutput(false);
        
        leftDriveMotor.setPID(1.25, 0.0, 0.0);
        rightDriveMotor.setPID(1.25, 0.0, 0.0);
        
        
    		
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    /**
     * This function is called periodically during operator control
     */
    	Auton auto = new Auton(); //new auton object
    	auto.autonThing(); //run the firstauton method
    	System.out.println("LOOPP!!!");
    }
    public void teleopPeriodic() {
    	leftDriveMotor.enableControl();
    	rightDriveMotor.enableControl();
    	
    	leftDriveMotor.setPID(1.25, 0.0, 0.0);
        rightDriveMotor.setPID(1.25, 0.0, 0.0);
    	
    	if (leftStick.getY() >= -.1 && leftStick.getY() <= .1)
    	{
    		leftStickY = 0;
    	}
    	else
    	{
        leftStickY = leftStick.getY();
    	}
    	
    	
    	if (rightStick.getY() >= -.1 && rightStick.getY() <= .1)
    	{
    		rightStickY = 0;
    	}
    	else
    	{
        rightStickY = rightStick.getY();
    	}
        
        leftDriveMotor.changeControlMode(ControlMode.Speed);
        rightDriveMotor.changeControlMode(ControlMode.Speed);
        
        leftDriveMotor.set(leftStickY * 1000);
        rightDriveMotor.set(rightStickY * 1000);
        
        
        //leftDriveMotor.set(leftStickY);
        //rightDriveMotor.set(rightStickY * -1);
    }
    
    public void disabledPeriodic(){
    	Robot.leftDriveMotor.setPosition(0);
    	Robot.rightDriveMotor.setPosition(0);
    	Robot.leftDriveMotor.set(0);
    	Robot.rightDriveMotor.set(0);
    }
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
