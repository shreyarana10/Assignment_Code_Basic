package Basic_;

import java.util.Scanner;

public class SumOf_N_NaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int sum = 0, rem;
		
		for(int i=1;i<=number;i++) {
			sum+= i;
		}
        System.out.println("Sum of N Natural Number : " +  sum);
	}

}

/*
 
Enter the Number : 
12
Sum of N Natural Number : 78

*/