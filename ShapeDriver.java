// Sam Schuller UIN:657353888
// Assignment5


package edu.uic.ids.console;
import edu.uic.ids.console.Shape;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class ShapeDriver {
	char shape;
	double length, width, area, perimeter, radius;
	final double pi = Math.PI;
	Scanner sc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int user;
		int tot =0, counter=0;
		System.out.println("Enter total number of shapes:");
        user = sc.nextInt();
        ArrayList<Shape> store = new ArrayList<Shape>();
        //array list now active to be added to
        char choice = 'y';
        //loop creates indicated shape and adds its value to the array
        while((user>=0)&&((choice=='y'))){

              Shape shape = new Shape();
              System.out.println("Enter type of shape (S for square, R for rectange and C for circle:");
              shape.setShape(sc.next().charAt(0));

              switch (shape.getShape()){
              case 'R':
              case 'r':
            	  	System.out.println("Enter the Rectangle's Width:");
            	  	shape.setWidth(sc.nextDouble());
                    System.out.println("Enter the Rectangle's Length:");
                    shape.setLength(sc.nextDouble());


                    shape.computeShape();
                    System.out.println("Shape type "+shape.getShape()+" length "+shape.getLength()+" width "+shape.getWidth()+" Radius "+shape.getRadius()+" the area is "+ shape.getArea()+" and the perimeter is "+shape.getPerimeter());
                    user--;
                    tot++;
                    store.add(shape);
                    break;
              case 's':
              case 'S':
                    System.out.println("Enter Square Length & Width:");
                    shape.setLength(sc.nextDouble());

                    shape.computeShape();
                    System.out.println("Shape type "+shape.getShape()+" length "+shape.getLength()+" width "+shape.getWidth()+" Radius "+shape.getRadius()+" the area is "+ shape.getArea()+" and the perimeter is "+shape.getPerimeter());
                    user--;
                    tot++;
                    store.add(shape);
                    break;

              case 'c':
              case 'C':
                    System.out.println("Enter the Circle's radius:");
                    shape.setRadius(sc.nextDouble());  

                    shape.computeShape();
                    System.out.println("Shape type "+shape.getShape()+" length "+shape.getLength()+" width "+shape.getWidth()+" Radius "+shape.getRadius()+" the area is "+ shape.getArea()+" and the perimeter is "+shape.getPerimeter());

                    
                    
                    user--;
                    tot++;
                    store.add(shape);
                    break;

              default:
                    System.out.println("That shapes not an option: "+shape.getShape());
              }
              System.out.println(" ");
              System.out.println("Do you wish to continue (y/n)?");
              choice = sc.next().charAt(0);            
        }

        System.out.println("Number of shapes calculated  is "+tot);
        
       
        for(Shape s:store){
              System.out.println(counter++ +"\t"+ s.getShape()+ "\t"+s.getLength()+"\t"+s.getWidth()+"\t"+s.getRadius()+"\t"+s.getArea()+"\t"+s.getPerimeter());
        }
        System.out.println(""+store);
        System.out.println("Enter the name of the file you would like to export to: ");
        String fileName = sc.next();
        File csvFile = new File(fileName);
        try (PrintWriter csvWriter = new PrintWriter(new FileWriter("csvFile.csv"));)
        {
          for(Shape s:store){
            csvWriter.println(store);
          }
        } catch (IOException e) {
            //Handle exception
            e.printStackTrace();
        }
        System.out.println("\t\tComplete");

  }
}


