package org.usfirst.frc.team4959.robot.commands.Elevator;

import org.usfirst.frc.team4959.robot.Robot;
import org.usfirst.frc.team4959.robot.util.States;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EnableRevSoftLimit extends Command {

    public EnableRevSoftLimit() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		Robot.elevator.talon.configReverseSoftLimitEnable(true, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	States.elevatorRevSoftLimitState = States.ElevatorRevSoftLimitStates.enabled;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
