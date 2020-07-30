package oo;

public class Trapezoid implements Calculate{
	double above,below,bevelEdge,high;
	
	public Trapezoid(double above,double below,double bevelEdge,double high) {
		this.above=above;
		this.below=below;
		this.bevelEdge=bevelEdge;
		this.high=high;
	}
	
	public double perimeter() {
		return this.above+this.below+this.bevelEdge*2;
	}
	
	public double area() {
		return (this.above+this.below)*this.high/2;
	}
	
	public double show() {
		System.out.println("梯形的周长： "+perimeter());
		System.out.println("梯形的面积： "+area());
		return 0;
	}
}
