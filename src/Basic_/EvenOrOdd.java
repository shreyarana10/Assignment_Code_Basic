package Basic_;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("Even ");
		}else if(number%2!=0){
			System.out.println("Odd");
		}else{
			System.out.println("Invalid");
		}
		

	}

}



/**
 * SAMPLE OUTPUT :
 * 255 
 * ODD
 * 
 * 564
 * EVEN 
 * 
 */