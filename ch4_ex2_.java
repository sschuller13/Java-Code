package edu.uic.ids.console;
import java.util.Scanner;
import java.text.NumberFormat;
/* Sam Schuller UIN: 657353888
 * 2/4/19 Rectangle Class IDS 401
 */
public class ch4_ex2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();
        Rectangle object = new Rectangle();
       
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
        	object.getLength();
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());
            object.setLength(length);

            object.getWidth();
            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());
            object.setWidth(width);         
            
            object.getArea(width, length);
            object.getPerimeter(width, length);
            
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}
		
	


