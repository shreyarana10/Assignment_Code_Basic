package Basic_;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int sum = 0, rem;
		while(number >0) {
			rem =number%10;
			sum = sum + rem;
			number /= 10;
		}
        System.out.println( "The  sum  is : "+ sum );
	}

}

/*

Enter the Number : 
123123
The  sum  is : 12

*/