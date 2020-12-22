package by.epam.module04.simple_class.task1;

public class Test1 {

	int a;
	int b;

	public Test1(int a, int b) {

		this.a = a;
		this.b = b;
	}
	
	public void print() {
        System.out.println("a=" + a + ",  b=" + b);
    }

	public int getA() {

		return a;
	}

	public int getB() {

		return b;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int max() {

		if (a > b) {
			return a;
		}
		return b;
	}

	public int getSum() {
		return a + b;
	}
}
