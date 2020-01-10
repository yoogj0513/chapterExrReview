package kr.or.yi.chapterExReview.ch05.exam0102;

public class IPTv extends ColorTv{
	private String ipAddr;

	public IPTv(String ipAddr, int size, int color) {
		super(size, color);
		this.ipAddr = ipAddr;
	}

	@Override
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 ", ipAddr);
		super.printProperty();
	}
	
	
}
