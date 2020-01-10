package kr.or.yi.chapterExReview.ch05.exam13;

public class Oval implements Shape {
	private int width;
	private int height;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("%dx%d에 내접하는 타원입니다.", width, height);
	}

	@Override
	public double getArea() {
		return Shape.PI * width * height;
	}

}
