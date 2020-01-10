package kr.or.yi.chapterExReview.ch05.exam0508;

public class Main0508 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		System.out.println(cp+"입니다.");
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint);
		
		ColorPoint cp2 = new ColorPoint(10, 10);
		cp2.setXY(5, 5);
		cp2.setColor("red");
		System.out.println(cp2.toString()+ "입니다.");
		
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p);
		
		p.moveUp();
		System.out.println(p + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p + "입니다.");
		
		
	}

	
}
