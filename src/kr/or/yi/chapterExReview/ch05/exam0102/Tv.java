package kr.or.yi.chapterExReview.ch05.exam0102;

public class Tv {
	private int size;
	
	public Tv(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printProperty() {
		System.out.printf("%d인치", size);
	}
}
