package org.usfirst.frc.team141.robot;

public class Conversions {
	
	public double encoderTicks;
	
	public double inchToEncoder(double inches)
	{
		encoderTicks = ((inches * 1733) / 25.13) * -1;
		return encoderTicks;
	}
}
