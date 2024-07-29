package Basic_;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int count=0;
		
		for(int div=2;div*div<=number;div++) {
			if(number%div==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("Prime Number : ");
		}else {
			System.out.println("Not Prime Number :");
		}

	}

}
