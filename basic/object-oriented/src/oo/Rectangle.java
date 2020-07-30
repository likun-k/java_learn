package oo;

public class Rectangle implements Calculate{
	double width;
	double height;
	
	public Rectangle(double width,double height) {
		this.height=height;
		this.width=width;
	}
		
	public double perimeter() {
		return 2*(this.height+this.width);
	}
	
	public double area() {
		return this.height*this.width;
	}
	
	public double show() {
		System.out.println("长方形的周长： "+perimeter());
		System.out.println("长方形的面积： "+area());
		return 0;
	}
}
