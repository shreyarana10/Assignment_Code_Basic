package Basic_;

import java.util.Scanner;

public class SumOfNumbersInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int First_Number = sc.nextInt();
		System.out.println("Enter second Number : ");
		int Second_Number =sc.nextInt();
		int sum=0;
		
		for(int i=First_Number ; i<=Second_Number; i++) {
			sum += i;
		}
		System.out.println("Sum is : " + sum);

	}

}


/*

Enter first Number : 
12
Enter second Number : 
14
Sum is : 39

*/