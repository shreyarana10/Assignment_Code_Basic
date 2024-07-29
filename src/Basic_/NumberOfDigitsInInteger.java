package Basic_;

import java.util.Scanner;

public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int count =0, rem =0;
		
		while(number > 0) {
			number /=10;
			count++;
		}
		
		System.out.println("Total Digits You Entered : " +  count);
	}
}


/*

Enter the Number : 
32423
Total Digits You Entered : 5

*/