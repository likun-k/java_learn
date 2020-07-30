package oo;

import java.util.Scanner;

public class Calculate {
	
	private double width;
	private double length;
	private double above,below,bevelEdge,high;
	private double radius;
	
	public String Rectangle;
	public String Trapezoid;
	public String Circle;
	
	public void setLength(double length) {
		this.length=length;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double perimeterRectangle() {
		return(length+width)*2;
	}
	
	public double areaRectangle() {
		return length*width;
	}
	
	public void setAbove(double above) {
		this.above=above;
	}
	
	public void setBelow(double below) {
		this.below=below;
	}
	
	public void setBevelEdge(double bevelEdge) {
		this.bevelEdge=bevelEdge;
	}
	
	public void setHigh(double high) {
		this.high=high;
	}
	
	public double perimeterTrapezoid() {
		return above+below+bevelEdge+high;
	}
	
	public double areaTrapezoid() {
		return ((above+below)*high)/2;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double perimeterCircle() {
		return 2*radius*3.14;
	}
	
	public double areaCircle() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		
			Calculate rec = new Calculate();
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("请输入长方形的长： ");
			int inputlength = scanner.nextInt();
			System.out.println("请输入长方形的宽： ");
			int inputwidth = scanner.nextInt();
			rec.setLength(inputlength);
			rec.setWidth(inputwidth);
			System.out.println("长方形的周长是： "+rec.perimeterRectangle());
			System.out.println("长方形的面积是： "+rec.areaRectangle());
			System.out.println("长方形的周长是： "+rec.perimeterRectangle()+"长方形的面积是： "+rec.areaRectangle());
			
			System.out.println("请输入梯形的上底： ");
			int inputabove = scanner.nextInt();
			System.out.println("请输入梯形的下底： ");
			int inputbelow = scanner.nextInt();
			System.out.println("请输入梯形的斜边： ");
			int inputbevelEdge = scanner.nextInt();
			System.out.println("请输入梯形的高： ");
			int inputhigh = scanner.nextInt();
			rec.setAbove(inputabove);
			rec.setBelow(inputbelow);
			rec.setBevelEdge(inputbevelEdge);
			rec.setHigh(inputhigh);
			System.out.println("梯形的周长是： "+rec.perimeterTrapezoid());
			System.out.println("梯形的面积是： "+rec.areaTrapezoid());
			System.out.println("梯形的周长是： "+rec.perimeterTrapezoid()+"梯形的面积是： "+rec.areaTrapezoid());
			
			System.out.println("请输入圆形的半径： ");
			int inputradius = scanner.nextInt();
			rec.setRadius(inputradius);
			System.out.println("圆形的周长是： "+rec.perimeterCircle());
			System.out.println("圆形的面积是： "+rec.areaCircle());
			System.out.println("圆形的周长是： "+rec.perimeterCircle()+"圆形的面积是： "+rec.areaCircle());
		}
}