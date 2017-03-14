 package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import com.ctre.CANTalon;

public class ClimbSubsystem {
	
	private CANTalon leftTalon;
	private CANTalon rightTalon;
	
	public ClimbSubsystem(){
		leftTalon = new CANTalon(RobotMap.CLIMB_TALON_LEFT);
		rightTalon = new CANTalon(RobotMap.CLIMB_TALON_RIGHT);
	}
	
	public void climb(double speed){
		leftTalon.set(speed);
		rightTalon.set(-speed);
	}
	
}
