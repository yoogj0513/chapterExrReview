package kr.or.yi.chapterExReview.ch05.exam0508;

public class PasitivePoint extends Point{

	public PasitivePoint(int x, int y) {
		move(x, y);
	}

	@Override
	protected void move(int x, int y) {
		if(x < 0 || y < 0) {
			return;
		}
		super.move(x, y);
	}
	
}
