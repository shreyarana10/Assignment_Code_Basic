package Basic_;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter the character ");
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        
        
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'|| ch =='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U') {
        	System.out.println("Vowels");
        	
        }else if(ch >='a'&& ch<='z'){
        	System.out.println("Consonant");
        }else{
        	System.out.println("InValid ");
        }
        
	}

}
