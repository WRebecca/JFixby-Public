package com.jfixby.cmns.api.geometry;

import com.jfixby.cmns.api.collections.Collection;
import com.jfixby.cmns.api.collections.EditableCollection;
import com.jfixby.cmns.api.math.Matrix;

public interface GeometryComponent {

	public Float2 newFloat2();

	public Line newLine();

	public Line newLine(Line other);

	public Rectangle newRectangle();

	public Circle newCircle();

	public Circle newCircle(Circle other);

	public CombinedGeometry newCombinedGeometry();

	public Rectangle newRectangle(Rectangle figure);

	public Triangle newTriangle();

	public boolean equalPointCollections(Collection<? extends FixedFloat2> a,
			Collection<? extends FixedFloat2> b);

	public <T extends FixedFloat2> void setPointsCollectionSize(
			EditableCollection<T> a, int size);

	public void copyValues(Collection<? extends FixedFloat2> a,
			EditableCollection<? extends Float2> b);

	public void copyValues(Collection<? extends FixedFloat2> a,
			EditableCollection<? extends Float2> b, int offset);

	public void applyTransformation(Matrix transformation,
			EditableCollection<? extends Float2> points_to_process);

	void applyTransformation(Matrix transformation, Float2 point);

	public Float2 newFloat2(FixedFloat2 dot);

	public boolean isInEpsilonDistance(FixedFloat2 a, FixedFloat2 b);

	public boolean isInEpsilonDistanceOfZero(FixedFloat2 point);

	public CanvasPosition newCanvasPosition();

	public void parametrize(FixedFloat2 a, double progress_from_A_to_B,
			FixedFloat2 b, Float2 result);

	public void parametrize(CanvasPosition a, double progress_from_A_to_B,
			CanvasPosition b, CanvasPosition result);

	public Rectangle newRectangle(double w, double h);

	public double distance(FixedFloat2 a, FixedFloat2 b);

	public Float2 newFloat2(double x, double y);

	public ClosedPolygonalChain newClosedPolygonalChain();

	public Float3 newFloat3();

	public void setupWrapingFrame(
			Collection<? extends FixedFloat2> points_to_wrap,
			Rectangle wrapping_frame);

}