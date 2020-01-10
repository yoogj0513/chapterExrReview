package kr.or.yi.chapterExReview.ch05.exam10;

public abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	
	abstract String get(String key);
	
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	
	abstract int length();
}
