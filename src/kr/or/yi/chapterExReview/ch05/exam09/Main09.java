package kr.or.yi.chapterExReview.ch05.exam09;

import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택 저장공간의 크기 입력 >> ");
		int capacity = sc.nextInt();
		Stack ss = new StringStack(capacity);
		String res;
		
		for(int i=0; i<capacity+1; i++) {
			System.out.print("문자열 입력 >> ");
			res = sc.next();
			if(res.equals("그만")) {
				break;
			}
			ss.push(res);
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝");
		
		for(int i=ss.length()-1; i>-2; i--) {
			res = ss.pop();
			System.out.print(res==null?"":res + " ");
		}
		
		sc.close();
	}

}
