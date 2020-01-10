package kr.or.yi.chapterExReview.ch05.exam0102;

public class ColorTv extends Tv {
	private int color;
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	@Override
	public void printProperty() {
		super.printProperty();
		System.out.printf(" %d 컬러", color);
	}
}
