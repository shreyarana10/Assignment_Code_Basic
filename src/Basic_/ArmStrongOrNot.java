package Basic_;

import java.util.Scanner;

public class ArmStrongOrNot {

	public static void main(String[] args) {
	
		 int n, sum = 0, rem, temp1, temp2, length = 0;
	        System.out.println("Enter the Number: ");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();

	        // Calculate the number of digits
	        temp1 = n;
	        while (temp1 != 0) {
	            temp1 /= 10;
	            length++;
	        }

	        // Calculate the sum of the powers of the digits
	        temp2 = n;int arm =0;
	        while(temp2!=0) {
	        	rem = temp2%10;
	        	int mul =1;
	        
	        	for(int i=1;i<=length;i++) {
	        	mul = mul*rem ;
	        	}
	        	arm = arm + mul;
	        	temp2/=10;
	        }
	        if(n==arm) {
	        	System.out.println("Armstrong : ");
	        }else {
	        	System.out.println("Not an armstrong number : ");
	        }
	        sc.close(); // Close the Scanner resource

	}

}

/*
 * 
Enter the Number: 
1634
Armstrong : 


Enter the Number: 
156
Not an armstrong number : 


*/







