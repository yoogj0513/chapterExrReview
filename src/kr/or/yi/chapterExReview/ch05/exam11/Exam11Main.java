package kr.or.yi.chapterExReview.ch05.exam11;

import java.util.Arrays;
import java.util.Scanner;

public class Exam11Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오.(숫자 숫자 연산자) >> "); // 9 8 *
		int a = sc.nextInt();
		int b = sc.nextInt();
		String oper = sc.next();
		
		Calc[] calc = {new Mul(), new Add(), new Sub(), new Div()};
		String[] operArr = {"*", "+", "-", "/"};
		
//		switch문 사용 하지 않고 하는 방법
//		binarySearch 사용 조건 - 정렬순으로 되어 있어야 함
//		Arrays.sort(operArr);
//		System.out.println(Arrays.toString(operArr));
//		System.out.println(Arrays.binarySearch(operArr, oper));
		
		int findOper = Arrays.binarySearch(operArr, oper);
		calc[findOper].setValus(a, b);
		
		try {			
			System.out.println(calc[findOper].calculate());
		}catch(ArithmeticException e) {
			System.out.println("계산할 수 없음.");
		}
		
		sc.close();
	}

}
