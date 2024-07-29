package Basic_;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		System.out.println("Enter the radius : " );
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		
		double pi = 3.14;
		
		double area = pi*radius*radius;
		
		
		System.out.println("Area of circle : " +  area );

	}

}
/**
 * 
 * Enter the radius : 
 * 2
 * 
 * Area of circle : 12.56
 * 
 * */
