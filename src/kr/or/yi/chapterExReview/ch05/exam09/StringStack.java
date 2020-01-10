package kr.or.yi.chapterExReview.ch05.exam09;

public class StringStack implements Stack {
	private int capacity; // 저장용량
	private int length; // 저장된 아이템의 갯수
	private String[] strArr;
	
	public StringStack(int capacity) {
		this.capacity = capacity;
		this.strArr = new String[capacity];
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public int capacity() {
		return capacity;
	}

	@Override
	public String pop() {
		if(length == 0) {
			System.out.println("스택이 가득차서 푸시 불가!");
			return null;
		}
		return this.strArr[--length];
	}

	@Override
	public boolean push(String val) {
		if(capacity == length) {
			System.out.println("스택이 가득차서 푸시 불가!");
			return false;
		}
		this.strArr[length++] = val;
		return true;
	}

}
