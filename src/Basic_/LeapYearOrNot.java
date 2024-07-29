package Basic_;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter the Year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Leap Year : ");
				}else{
					System.out.println("Not Leap Year : ");
				}
			}
			else {
				System.out.println("Leap Year :");
			}
		}
		else {
			System.out.println("Not Leap Year : ");
		}

	}

}
