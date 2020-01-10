package kr.or.yi.chapterExReview.ch04;

import java.util.Arrays;

public class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int [] temp = new int[a.length + b.length];
//		System.out.println(Arrays.toString(temp));
//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(a, 0, temp, 0, a.length);
//		System.out.println(Arrays.toString(temp));
		System.arraycopy(b, 0, temp, a.length, b.length);
//		System.out.println(Arrays.toString(temp));
		return temp;
	}
	
	public static void print(int[] a) {
		System.out.print("[");
		for(int e : a) {
			System.out.print(e + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int[] array1 = {1, 5, 7, 9};
		ArrayUtil.print(array1);
		int[] array2 = {3, 6, -1, 100, 77};
		ArrayUtil.print(array2);
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
