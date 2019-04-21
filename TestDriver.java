//Sam Schuller UIN:657353888
//IDS 401 Assignment 7
package edu.uic.ids.util;
import java.util.Scanner;
import edu.uic.ids.util.RightTriangle;

public class TestDriver {
	
	   public static void main(String[] args) {
	      
	       System.out.println("Enter the base of the right triangle:");
	       Scanner sc = new Scanner(System.in);
	       double base = sc.nextDouble();
	       
	       System.out.println("Enter the height of the right triangle:");
	       double height = sc.nextDouble();
	       
	      //creates righttriangle object w/ overloaded constructor so we can use its methods
	       RightTriangle righttriangle = new RightTriangle(base, height);
	       
	      //calculates everything
	       righttriangle.computeProperties();
	       
	      //activates the printing of the tostring method for righttriangle
	       System.out.println(righttriangle.toString());
	       
	       sc.close();
	   }
}
	