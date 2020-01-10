package kr.or.yi.chapterExReview.ch05.exam12;

public class ShapeMgn {
	private Shape start;
	private Shape end;

	public Shape getStart() {
		return start;
	}

	public Shape getEnd() {
		return end;
	}

	public void setStart(Shape start) {
		this.start = start;
	}

	public void setEnd(Shape end) {
		this.end = end;
	}
	
	public boolean isEmpty() {
		return start == end && start == null;
	}
}
