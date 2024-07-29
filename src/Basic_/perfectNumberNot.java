package Basic_;

import java.util.Scanner;

public class perfectNumberNot {

	public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum =0;
        for(int i=1;i<=n;i++) {
        	if(n%i==0) {
        		System.out.println(i);
        		sum = sum + i;
        	}
        }
        if(sum == n ) {
        	System.out.println("Perfect number : ");
        }else {
        	System.out.println("Not perfect number : ");
        }

	}

}
