package org.usfirst.frc5112.GearBoxTest.commands;

import org.usfirst.frc5112.GearBoxTest.Robot;
import org.usfirst.frc5112.GearBoxTest.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class invertMotors extends Command{

	public invertMotors() {

		requires(Robot.drivetrain);

	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.drivetrain.stop();
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        RobotMap.drivetrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);	}

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
