package org.usfirst.frc5112.GearBoxTest.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ForwardsBakcwardsEtc extends CommandGroup{
	public ForwardsBakcwardsEtc() {
		addSequential(new Forwards(), 5);
		addSequential(new Stop());
		addSequential(new Backwards(), 5);
		addSequential(new Stop());
		addSequential(new Forwards(), 10);
		addSequential(new Stop());
		addSequential(new Backwards(), 10);
		addSequential(new Stop());
		addSequential(new Forwards(), 30);
		addSequential(new Stop());
		addSequential(new Backwards(), 30);
		addSequential(new Stop());
		addSequential(new Forwards(), 60);
		addSequential(new Stop());
		addSequential(new Backwards(), 60);
		addSequential(new Stop());
		addSequential(new Forwards(), 300);
		addSequential(new Stop());
		addSequential(new Backwards(), 300);
		addSequential(new Stop());
		addSequential(new Forwards(), 1800);
		addSequential(new Stop());
		addSequential(new Backwards(), 1800);
		addSequential(new Stop());
		
	}

}
