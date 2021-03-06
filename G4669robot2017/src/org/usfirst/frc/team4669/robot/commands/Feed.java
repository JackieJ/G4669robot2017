package org.usfirst.frc.team4669.robot.commands;

import org.usfirst.frc.team4669.robot.Robot;
import org.usfirst.frc.team4669.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Feed extends Command {
	
	private int loops = 0;

    public Feed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.fuelFeeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(++loops >= 10) {
    		
    		loops = 0;
     	}
    	Robot.fuelFeeder.feed();
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (Robot.oi.getRightRawButton(RobotMap.feedButton)) return false;
        else {
        	return true;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
