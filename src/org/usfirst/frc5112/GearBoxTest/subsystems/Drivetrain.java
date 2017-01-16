package org.usfirst.frc5112.GearBoxTest.subsystems;

import org.usfirst.frc5112.GearBoxTest.Robot;
import org.usfirst.frc5112.GearBoxTest.RobotMap;
import org.usfirst.frc5112.GearBoxTest.commands.OperatorControl;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private final RobotDrive robotDrive = RobotMap.drivetrainRobotDrive41;

	public void initDefaultCommand() {
		setDefaultCommand(new OperatorControl());

	}

	public void forward(double speed) {
		robotDrive.drive(speed, 0);
	}

	public void backwards(double speed) {
		robotDrive.drive(-speed, 0);

	}

	public void forwardTimed(double speed, double time) {
		robotDrive.drive(speed, 0);
		Timer.delay(time);
	}

	public void backwardsTimed(double speed, double time) {
		robotDrive.drive(-speed, 0);
		Timer.delay(time);
	}

	public void stop() {
		robotDrive.drive(0, 0);
	}

	public void operatorControl(Joystick joystick) {
		if (Robot.oi.joystick.getY() > 0.1) {
			robotDrive.arcadeDrive(((joystick.getY() - 0.1) * 10 / 9) * ((joystick.getY() - 0.1) * 10 / 9),
					joystick.getZ());
		} else {
			robotDrive.arcadeDrive(0, joystick.getZ());
		}
	}

}
