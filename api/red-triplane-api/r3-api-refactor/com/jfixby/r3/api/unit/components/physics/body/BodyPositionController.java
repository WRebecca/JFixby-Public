package com.jfixby.r3.api.unit.components.physics.body;

import com.jfixby.cmns.api.math.Angle;

public interface BodyPositionController extends BodyPosition{
	void setY(final double y);

	void setX(final double x);

	void setVelocity(double vx, double vy);

	void setRotation(Angle angle);

	void setPosition(final double x, final double y);

	
}
