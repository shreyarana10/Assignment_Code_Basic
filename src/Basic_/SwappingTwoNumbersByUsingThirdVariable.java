package Basic_;

import java.util.Scanner;

public class SwappingTwoNumbersByUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b, c;
		System.out.println("Enter a: ");
		a=sc.nextInt();
		System.out.println("Enter b: ");
		b=sc.nextInt();
        
		System.out.println("Your Numbers are : "+ "\n a : " + a+"\n b : " + b);
		c=a;
		a=b;
		b=c;
		
		
		System.out.println("After Swapping : ");
		System.out.println(" a : " +a + "\n b : "+ b );
		

	}

}

/**
* SAMPLE OUTPUT :
*
*Enter a: 
*12
*Enter b: 
*34
*
*Your Numbers are :
* a : 12
* b : 34
* 
*After Swapping : 
*a : 34
*b : 12
*/