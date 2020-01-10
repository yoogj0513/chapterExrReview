package kr.or.yi.chapterExReview.ch05.exam13;

public class Exam13Main {
	public static void main(String[] args) {
//		Shape dount = new Circle(10);
//		dount.redraw();
//		System.out.println("면적은 " + dount.getArea());
		
		Shape[] list = {new Circle(10), new Oval(20, 30), new Rect(10, 40)};
		for(Shape s : list) {
			s.redraw();
			System.out.printf("면적은 %.1f%n", s.getArea());
		}
	}
}
