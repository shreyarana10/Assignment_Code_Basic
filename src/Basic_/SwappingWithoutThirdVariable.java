package Basic_;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a , b;
		System.out.println("Enter the numbers a and b ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Your Numbers are : "+ "\n a : " + a+"\n b : " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		
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

