package Basic_;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		
		int fact =1;
		
		while(number!=0) {
			fact =fact*number;
			number--;
		}
		System.out.println("Factorial of a Number  is : "+fact);

	}

}


/*
 
Enter the Number : 
5
Factorial of a Number  is : 120

*/