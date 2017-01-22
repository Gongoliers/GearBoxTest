package org.usfirst.frc5112.GearBoxTest.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.GearBoxTest.Robot;

public class Forwards extends Command {

	public Forwards() {

		requires(Robot.drivetrain);

	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.forward(.25);
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
