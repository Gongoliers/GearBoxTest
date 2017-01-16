package org.usfirst.frc5112.GearBoxTest.commands;

import org.usfirst.frc5112.GearBoxTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command{

	public Stop() {

		requires(Robot.drivetrain);

	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.stop();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.drivetrain.stop();

	}

	protected void interrupted() {
		Robot.drivetrain.stop();

	}
	

}
