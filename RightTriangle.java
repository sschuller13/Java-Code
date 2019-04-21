//Sam Schuller UIN:657353888
//IDS 401 Assignment 7
package edu.uic.ids.util;

public class RightTriangle implements Shape{
	private double hypotenuse, perimeter,area, base, height;
	//original constructor
	 public RightTriangle() {
		base=0;
		height=0;
	 }
	 //overloaded constructor
	 public RightTriangle(double base, double height) {
	       super();
	       this.base = base;
	       this.height = height;
	   }
	 @Override
	   public double getArea() {
	       // TODO Auto-generated method stub
	       return this.area;
	   }
	   @Override
	   public double getPerimeter() {
	       // TODO Auto-generated method stub
	       return this.perimeter;
	   }
	   @Override
	   public double getBase() {
	       // TODO Auto-generated method stub
	       return this.base;
	   }
	   @Override
	   public double getHeight() {
	       // TODO Auto-generated method stub
	       return this.height;
	   }
	   @Override
	   public double getHypotenuse() {
	       // TODO Auto-generated method stub
	       return this.hypotenuse;
	   }
	   @Override
	   //all calculations
	   public void computeProperties() {
	       // TODO Auto-generated method stub
	       area = .5*base*height;
	       hypotenuse = Math.sqrt(base*base + height*height);
	       perimeter = base+height+hypotenuse;
	   }
	   @Override
	   //Line printed with values
	   public String toString() {
	       return "This Right Triangle has a base = " + base + ", a height = " + height +  ", a hypotenponuse = " + hypotenuse
	               + " units, a perimeter of " + perimeter + " units, and an area of " + area + " square units.";
	   }
}
