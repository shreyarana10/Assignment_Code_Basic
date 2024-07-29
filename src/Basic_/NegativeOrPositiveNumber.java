package Basic_;

import java.util.Scanner;

public class NegativeOrPositiveNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number >0)
		{
			System.out.println("Positive Number ");
		}else if(number<0){
			System.out.println("Negative Number : ");
		}else{
			System.out.println("Invalid !! ");
		}

	}

}
/**
 * SAMPLE OUTPUT :
 * 
 * 44
 * Positive  
 * 
 * -1
 * Negative 
 * 
 * 0
 * Invalid 
 * 
 */