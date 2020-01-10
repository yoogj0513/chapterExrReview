package kr.or.yi.chapterExReview.ch05.exam0102;

public class Main0102 {
	public static void main(String[] args) {		
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
		
		System.out.println();
		
		IPTv iptv = new IPTv("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
