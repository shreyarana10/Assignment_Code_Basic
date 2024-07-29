package Basic_;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int rem=1, rev=0;
		while(number>0) {
			rem = number%10;
			rev = rev*10 +rem;
			number /=10;
			
		}
		System.out.println("Reverse of Number is : " +  rev );

	}

}

/*
 
Enter the Number : 
123


Reverse of Number is : 321

 */
