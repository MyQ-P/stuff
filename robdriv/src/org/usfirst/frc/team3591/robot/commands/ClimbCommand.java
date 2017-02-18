package org.usfirst.frc.team3591.robot.commands;

import org.usfirst.frc.team3591.robot.OI;
import org.usfirst.frc.team3591.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbCommand extends Command {
	
	double speed;
	
    public ClimbCommand(double speed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.speed = speed;
    	System.out.println("Climb command constructor");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("command init");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climbSubsystem.climb(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climbSubsystem.climb(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.climbSubsystem.climb(0);
    }
}
