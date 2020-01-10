package kr.or.yi.chapterExReview.ch05.exam0508;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		this(0, 0, "Black");
//		super(0, 0);
//		this.color = "Black";
	}
	
	public ColorPoint(int x, int y) {
		this(x, y, "Black");
//		super(x, y);
//		this.color = "Black";
	}



	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("%s색의 %s입니다.", color, super.toString());
	}
	
}
