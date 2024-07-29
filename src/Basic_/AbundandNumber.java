package Basic_;

import java.util.Scanner;

public class AbundandNumber {

	public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        int sum =0;
        
        for(int i=1 ;i<n ; i++) {
        	sum  +=i;
        }
        if(n < sum) {
        	System.out.println("abundant number : ");
        	
        }else {
        	System.out.println("Not an abundant number : ");
        }

	}

}
