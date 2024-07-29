package Basic_;

import java.util.Scanner;

public class GcdOfTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the numbers a and  b  : " );
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd =1;
		
		for(int i=1;i<=a && i<=b ; i++) {
			
			if(a%i==0 && b %i==0) {
				gcd = i;
			}
			
		}
		
		System.out.println("Gcd of Two Numbers You Entered : " + gcd);

	}

}

                       /*
                           Enter the numbers a and  b  : 
                           
                           20
                           28
                           
                           Gcd of Two Numbers You Entered : 4
                                                             */
                                                                 
 
