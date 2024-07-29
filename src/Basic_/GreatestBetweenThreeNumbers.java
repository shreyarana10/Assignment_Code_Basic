package Basic_;

import java.util.Scanner;

public class GreatestBetweenThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a , b, c ;
		System.out.println("Enter all three  numbers: a , b , c  ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int GreatestNumber = ((a>b)?(a>c?a:c):(b>c?b:c));
		System.out.println("Greatest of all three is : " + GreatestNumber);

	}

}
/*
Enter all three  numbers: a , b , c  
12
23
45
Greatest of all three is : 45
*/