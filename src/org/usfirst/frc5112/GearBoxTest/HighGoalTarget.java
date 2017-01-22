package org.usfirst.frc5112.GearBoxTest;


import org.opencv.core.Range;

import com.kylecorry.frc.vision.TargetSpecs;

public class HighGoalTarget implements TargetSpecs {

	@Override
	public Range getHue() {
		return new Range(75, 125);
	}

	@Override
	public Range getSaturation() {
		return new Range(175, 255);
	}

	@Override
	public Range getValue() {
		return new Range(65, 255);
	}

	@Override
	public double getWidth() {
		return 20 / 12.0;
	}

	@Override
	public double getHeight() {
		return 12.0;
	}

	@Override
	public double getArea() {
		return 80 / 12.0;
	}

	@Override
	public int getMinPixelArea() {
		return 400;
	}

}
