package kr.or.yi.chapterExReview.ch05.exam0304;

public class Won2Dollar extends Convert {
	
	public Won2Dollar(double ratio) {
		super(ratio);
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
