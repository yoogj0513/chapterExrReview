package kr.or.yi.chapterExReview.ch04;

public class Circle {
	private double x;
	private double y;
	private int radius;
	
	public Circle() {
	}

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public String toString() {
		return String.format("[x=%s, y=%s, radius=%s, getArea()=%.2f]", x, y, radius, getArea());
	}
	
	
}
