package kr.or.yi.chapterExReview.ch05.exam11;

class Add extends Calc{
	@Override
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc{
	@Override
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc{
	@Override
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc{
	@Override
	public int calculate() {
		return a / b;
	}
}

public abstract class Calc {
	protected int a;
	protected int b;

	public void setValus(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public abstract int calculate();
}