package edu.uic.ids.console;

public class Practice_forTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 *  Prints out even numbers 2-10
	 */
	int a=1;
	while(a>=1 && a<10) {
		a+=1;
		if(a%2==0) {
			System.out.println(""+a);
		}
	}
	int max = 50;
	int add =0;
	for(int s =0;s<=max;s+=1) {
		add+= s;
	}
	System.out.println(""+add);
	/*Adding up odd numbers 1-25
	 * 
	 */
	int sum = 0;
	int c = 25;
	for(int b=1 ;b<=c;b+=2) {
		sum+=b;
		System.out.println(""+sum);
	}
	
}
}
