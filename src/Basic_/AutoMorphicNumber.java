package Basic_;

import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(isAutomorphic(n)) {
        	System.out.println("Number is Automorphic number : ");
        }
        else {
        	System.out.println("Not automorphic : ");
        }
        
       
	}
	static boolean isAutomorphic(int N) {
		 
		int sq= N*N;
		
		while(N>0) {
			if(N%10 != sq%10) {
				return false;
			}
			N = N/10;
			sq = sq/10;
			
		}
		return true ;

	}

}
