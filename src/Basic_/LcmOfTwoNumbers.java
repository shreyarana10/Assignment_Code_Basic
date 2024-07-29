package Basic_;

import java.util.Scanner;

public class LcmOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the numbers a and  b  : " );
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd =1;
		
		
		for(int i=1;i<=a  && i<=b ; i++) {
			if(a%i==0  && b%i ==0) {
				gcd =i;
			}
		}
		
		int lcm = (a*b)/gcd;
		
		System.out.println("Lcm of the numbers that you entered : " +  a +" and " + b +" is " +  lcm );
	}

}
/**
 * Enter the numbers a and  b  : 
 * 7
 *21
 *Lcm of the numbers that you entered : 7 and 21 is 21
 */
