package Basic_;

import java.util.Scanner;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the character ");
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        int ascii = (int) ch;
        
        System.out.println(" Ascii number of " +  ch  + " is " +  ascii);

	}

}


/*
 * SAMPLE OUTPUT:
 * 
 * s
 * 115
 * 
 * 
 */