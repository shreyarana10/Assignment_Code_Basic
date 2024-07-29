package Basic_;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int sum=0;
		int a=0;int b=1;
		System.out.print(a+ " " + b);
		for(int i=1;i<number;i++) {
			
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+ sum);
		}

	}

}
