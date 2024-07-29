package Basic_;

import java.util.Scanner;

public class StrongNumberoRNot {

	public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
         int num = n;
         int sum=0, rem;
         
         
         while(n!=0) {
        	 int fact = 1, i=1;
        	 rem = n%10;
        	 while(i<=rem ) {
        		 fact  = fact*i;
        		 i++;
        	 }
        	 sum = sum + fact;
        	 n = n/10;
         }
         if(sum == num )
        System.out.println("strong numer ");
         else
        	 System.out.println("Not strong ");
         
        

	}

}
