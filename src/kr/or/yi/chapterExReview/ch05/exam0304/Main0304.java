package kr.or.yi.chapterExReview.ch05.exam0304;

import java.util.Scanner;

public class Main0304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Won2Dollar toDollar = new Won2Dollar(1200);
//		System.out.println(toDollar);
//		toDollar.run(sc);
		
		Convert toMile = new Km2Mile(1.6);
		toMile.run(sc);
		
		sc.close();
	}

}
