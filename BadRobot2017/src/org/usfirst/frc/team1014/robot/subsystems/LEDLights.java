package org.usfirst.frc.team1014.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;

public class LEDLights 
{
	private static LEDLights instance;
	private DigitalOutput bit1;
	private final int channel = 4;
	
	public LEDLights()
	{
		bit1 = new DigitalOutput(channel); //temporary
	}
	public static LEDLights getInstance()
	{
		if(instance == null)
			instance = new LEDLights();
		return instance;
	}
	
	public enum LEDState
	{
		kRED, kBLUE, kSHOOT, kCLIMB, kGEAR, kDEFAULT, kLOW_BATTERY, kGATHER;
	}
	
	public void setLights(LEDState state)
	{
		switch(state)
		{
			case kRED:
				bit1.pulse(0.00002f); //Red
				break;
			case kBLUE:
				bit1.pulse(0.00004f); //Blue
				break;
			case kSHOOT:
				bit1.pulse(0.00006f); //Green Scroll
				break;
			case kCLIMB:
				bit1.pulse(0.000008f); //Red and orange Scroll
				break;
			case kDEFAULT:
				bit1.pulse(0.00f); //Green
				break;
			case kGEAR:
				bit1.pulse(0.00010f); //Array of colors
				break;
			case kLOW_BATTERY:
				bit1.pulse(0.00012f);
				break;
			case kGATHER:
				bit1.pulse(0.00014f);
				break;
		}
	}
	public void pulse()
	{
		bit1.pulse(4);
	}
}
