package org.usfirst.frc5112.GearBoxTest.commands;

import org.usfirst.frc5112.GearBoxTest.Robot;
import org.usfirst.frc5112.GearBoxTest.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class defaultMotorDirection extends Command {

	public defaultMotorDirection() {

		requires(Robot.drivetrain);

	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.stop();
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.drivetrain.stop();
	}

	protected void interrupted() {
		end();

	}

}
