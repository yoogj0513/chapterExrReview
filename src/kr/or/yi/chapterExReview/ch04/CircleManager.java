package kr.or.yi.chapterExReview.ch04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CircleManager {

	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		Scanner sc = new Scanner(System.in);
//		System.out.println(Arrays.toString(circles));
		/*
		3 3 5
		2.5 2.7 6
		5 2 4
		*/
		double x;
		double y;
		int radius;
		for(int i=0; i<circles.length; i++) {
			System.out.print("x, y, radius >>");
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			circles[i] = new Circle(x, y, radius);
		}
		System.out.println(Arrays.toString(circles));
		
		int bigCircleIdx = 0;
		for(int i=0; i<circles.length; i++) {
			if(circles[bigCircleIdx].getArea() < circles[i].getArea()) {
				bigCircleIdx = i;
			}
		}
		System.out.println("가장 큰 면적인 원은 : " + circles[bigCircleIdx]);
		
		sc.close();
	}

}
