package Basic_;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem ;int sum =0 ;
        
        int originalNumber = n;
        while(n>0) {
        	rem = n%10;
        	sum += rem ; 
        	n = n/10;
        }
        System.out.println(sum + " is the sum : ");
        int res = originalNumber % sum ;
        
        if(res ==0 ) {
        	System.out.println("HARSHAD NUMBER : ");
        }
        else {
        	System.out.println("NOT HARSHAD NUMBER : ");
        }
       
	}

}
