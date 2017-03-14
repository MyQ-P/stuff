package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    // Put methods for controlling this 
	private CANTalon frontLeftTalon;
	private CANTalon backLeftTalon;
	private CANTalon frontRightTalon;
	private CANTalon backRightTalon;
	
	private RobotDrive robotDrive;
	
	public DriveSubsystem() {
		System.out.println("Drivesubsystem const");
		frontLeftTalon = new CANTalon(RobotMap.FRONT_LEFT_TALON_ID);
		backLeftTalon = new CANTalon(RobotMap.BACK_LEFT_TALON_ID);
		frontRightTalon = new CANTalon(RobotMap.FRONT_RIGHT_TALON_ID);
		backRightTalon = new CANTalon(RobotMap.BACK_RIGHT_TALON_ID);
		System.out.println("talons const");
		robotDrive = new RobotDrive(frontLeftTalon,backLeftTalon,frontRightTalon,backRightTalon);
		System.out.println("robotdrive const");
		
		frontLeftTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		backLeftTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		frontRightTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		backRightTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
		
		frontLeftTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		backLeftTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		frontRightTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
		backRightTalon.setPID(.5, 0, .1, .1, 1000, 2, 0);
	}
	
	public void drive() {
		System.out.println("hi");
		robotDrive.mecanumDrive_Cartesian(0,0,0,0);
	}
	
	public void drive(double x,double y,double z){
		System.out.println("drive + " +x+y+z);
		robotDrive.mecanumDrive_Cartesian(x, y, z, 0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

