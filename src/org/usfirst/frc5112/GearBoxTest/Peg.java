package org.usfirst.frc5112.GearBoxTest;
import com.kylecorry.frc.vision.TargetGroupSpecs;

public class Peg implements TargetGroupSpecs{

	@Override
	public double getTargetWidthRatio() {
		return 2 / 10.0;
	}

	@Override
	public double getTargetHeightRatio() {
		return 1;
	}

	@Override
	public Alignment getAlignment() {
		return Alignment.TOP;
	}

	@Override
	public double getGroupWidth() {
		return 10.25 / 12.0;
	}

	@Override
	public double getGroupHeight() {
		return 5.0 / 12.0;
	}

}
