package kr.or.yi.chapterExReview.ch05.exam13;

public class Rect implements Shape {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("%dx%d크기의 사각형입니다.", width, height);
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
