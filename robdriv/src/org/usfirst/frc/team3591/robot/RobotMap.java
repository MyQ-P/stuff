package org.usfirst.frc.team3591.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int FRONT_LEFT_TALON_ID = 11;
	public static final int BACK_LEFT_TALON_ID = 12;
	public static final int FRONT_RIGHT_TALON_ID = 21;
	public static final int BACK_RIGHT_TALON_ID = 22;
	
	public static final int DRIVE_STICK = 0;
	public static final int SHOOT_STICK = 1;
	
}
