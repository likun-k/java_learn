package oo;

public class Circle implements Calculate{
	double r;
	public Circle(double r) {
		this.r=r;
	}
	
	public double perimeter() {
		return 2*3.14*this.r;
	}
	
	public double area() {
		return 3.14*this.r*this.r;
	}
	
	public double show() {
		System.out.println("圆的周长： "+perimeter());
		System.out.println("圆的面积： "+area());
		return 0;
	}
}
