package Basic_;

import java.util.Scanner;

public class PallindromeOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int rem, rev=0;
		
		int n= number;
		while(number>0) {
			rem = number%10;
			rev=rev*10+rem;
			number /=10;
		}
        
		if(rev==n) {
			System.out.println("Pallindrome ");
		}else {
			System.out.println("Not Pallindrome : ");
		}
	}

}


/* SAMPLE OUTPUT : 
 * Enter the number : 
	343
	Pallindrome 
	
	
	Enter the number : 
	23422
	Not Pallindrome : 

	*/

