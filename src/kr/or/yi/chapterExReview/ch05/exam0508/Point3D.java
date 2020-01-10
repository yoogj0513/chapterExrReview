package kr.or.yi.chapterExReview.ch05.exam0508;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d, %d)의 점입니다.", getX(), getY(), z);
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
	}
	
	public void move (int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	
}
