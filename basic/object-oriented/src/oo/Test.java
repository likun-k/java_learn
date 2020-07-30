package oo;

public class Test {
	public static void main(String[] args) {

		method1(new Circle(5));
		method1(new Rectangle(7,9));
		method1(new Trapezoid(10,15,9,8));
		
	}
	public static void method1(Calculate c) {
		c.show();
	}
}
