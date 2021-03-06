package org.usfirst.frc5112.GearBoxTest.commands;

import org.usfirst.frc5112.GearBoxTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class BackwardsTimed extends Command {

	public BackwardsTimed() {
		requires(Robot.drivetrain);
		setTimeout(10);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.backwardsTimed(1, 10);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.drivetrain.stop();

	}

	protected void interrupted() {
		Robot.drivetrain.stop();

	}

}
