package kr.or.yi.chapterExReview.ch04;

import java.util.Scanner;

public class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		String kor;
		int findIdx;
		while(true){
			System.out.print("한글 단어?");
			kor = sc.next();
			if(kor.equals("그만")) {
				break;
			}
			findIdx = findKor(kor);
			if(findIdx == -1) {
				System.out.println(kor + "는 저의 사전에 없습니다.");
			} else {
				System.out.println(kor + "은 " + eng[findIdx]);
			}
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}

	private static int findKor(String findEng) {
		for(int i=0; i<Dictionary.kor.length; i++) {
			if(findEng.equals(Dictionary.kor[i])) {
				return i;
			}
		}
		return -1;
	}
}
