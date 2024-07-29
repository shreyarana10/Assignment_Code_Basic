package Basic_;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number a and b : ");
		int a , b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int GreatestNumber  = (a>b)?a:b;
		System.out.println("Greatest Between Two Numbers: " + "\n" + GreatestNumber  );

	}

}

     /*
			Enter the Number a and b : 
			12
			23
			Greatest Between Two Numbers: 
			23
			
			       
			       */
			
