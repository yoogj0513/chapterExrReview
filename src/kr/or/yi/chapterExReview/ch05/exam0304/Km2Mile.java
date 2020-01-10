package kr.or.yi.chapterExReview.ch05.exam0304;

public class Km2Mile extends Convert {
	public Km2Mile(double ratio) {
		super(ratio);
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

}
