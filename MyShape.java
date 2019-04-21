//this is the super class
public abstract class MyShape {
	int height;
	int width;
	
	public static void main(String[] args) throws Exception
	{	//before we put in the exception checker, an error will appear if the two numbers arent the same, because of exception not handled
		int width =5; int height =5;
		MyShape s = new MySquare(height,width);
		System.out.println("Square Area: "+s.getArea());
		MyShape t = new MyTriangle(height,width);
		System.out.println("Triangle Area: " + t.getArea());
		MyShape c = new MyCircle(height,width);
		System.out.println("Circle Area: " + c.getArea());
	}
MyShape(int height, int width)
{
	this.height = height;
	this.width = width;
}
	double getArea() {
		return 0.0;
	}
}

class MyCircle extends MyShape {
	double radius;
	double diameter;
	MyCircle(int height, int width)throws Exception
	{
		super(height,width);
		this.height = height;
		this.width = width;
		this.radius = height / 2.0;
		this.diameter = (double)(height);
		if (height != width) throw new Exception();
		
		
	}
	double getArea() {
		return Math.PI*radius;
	}
}
class MySquare extends MyShape{
	
	MySquare(int height, int width)throws Exception{
		super(height,width);
		if(height!= width) throw new Exception();
		this.height = height;
		this.width = width;
	}
	double getArea() {
		return height*width;
	}
}

class MyTriangle extends MyShape{
	MyTriangle(int height, int width){
		super(height,width);
		this.height = height;
		this.width = width;
	}
	double getArea() {
		return (.5*width)*height;
	}
}