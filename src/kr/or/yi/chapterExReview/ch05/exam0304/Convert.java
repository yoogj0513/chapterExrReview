package kr.or.yi.chapterExReview.ch05.exam0304;

import java.util.Scanner;

public abstract class Convert {
	protected double ratio;
	
	public Convert(double ratio) {
		this.ratio = ratio;
	}
	
	protected double convert(double src) {
		return src/ratio;
	}
	
	protected abstract String getSrcString();
	protected abstract String getDestString();
	
	public void run(Scanner sc) {
		System.out.printf("%s을 %s로 바꿉니다.%n", getSrcString(), getDestString());
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double var = sc.nextDouble();
		double res = convert(var);
		System.out.printf("변환 결과 : %.1f %s입니다.", res, getDestString());
	}
	
	@Override
	public String toString() {
		return String.format("Convert [ratio=%s]", ratio);
	}
	
	
	
}
