package org.usfirst.frc5112.GearBoxTest.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ForwardsBakcwardsEtc extends CommandGroup{
	public ForwardsBakcwardsEtc() {
		addSequential(new Forwards());
		setTimeout(5);
		addSequential(new Stop());
		addSequential(new Backwards());
		setTimeout(5);
		addSequential(new Stop());
		addSequential(new Forwards());
		setTimeout(30);
		addSequential(new Stop());
		addSequential(new Backwards());
		setTimeout(30);
		addSequential(new Stop());
		addSequential(new Forwards());
		setTimeout(120);
		addSequential(new Stop());
		addSequential(new Backwards());
		setTimeout(120);
		addSequential(new Stop());
		addSequential(new Forwards());
		setTimeout(300);
		addSequential(new Stop());
		addSequential(new Backwards());
		setTimeout(300);
		addSequential(new Stop());
		addSequential(new Forwards());
		setTimeout(600);
		addSequential(new Stop());
		addSequential(new Backwards());
		setTimeout(600);
		addSequential(new Stop());
		addSequential(new Forwards());
		setTimeout(1800);
		addSequential(new Stop());
		addSequential(new Backwards());
		setTimeout(1800);
		addSequential(new Stop());
		
	}

}
