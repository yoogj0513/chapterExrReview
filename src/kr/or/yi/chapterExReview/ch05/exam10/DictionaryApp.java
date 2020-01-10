package kr.or.yi.chapterExReview.ch05.exam10;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		System.out.println(dic.get("황기태"));
		System.out.println(dic.get("이상원")); 
		dic.put("유경진", "자바스크립트");
		System.out.println(dic.get("유경진"));
		dic.put("유경진", "C++");
		System.out.println(dic.get("유경진"));
		
		dic.delete("황기태");
		System.out.println("황기대의 값은 " + dic.get("황기태"));
		
	}

}
