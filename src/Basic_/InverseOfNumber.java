package Basic_;

import java.util.Scanner;

public class InverseOfNumber {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int inv = 0;
        int op = 1;

        // To keep track of the length of the number
        int length = (int) Math.log10(n) + 1;

        // Array to store the result
        int[] result = new int[length + 1];  // +1 because positions are 1-based

        while (n != 0) {
            int od = n % 10;  // Original digit
            result[od] = op;  // Place position in result array

            n = n / 10;  // Remove the last digit
            op++;  // Move to the next position
        }

        // Construct the inverse number from result array
        for (int i = 1; i < result.length; i++) {
            inv = inv * 10 + result[i];
        }

        System.out.println("Inverse of the number: " + inv);
    }
}

















//package pep;
//
//import java.util.Scanner;
//
//public class InverseOfNumber {
//
//	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
//		int n= sc.nextInt();
//		int inv = 0;
//		int op=1;
//		
//		while( n!=0) {
//			int od = n%10;
//			int id = op;
//			int ip =od;
//			
//			inv = inv + id *(int)Math.pow(10, ip,-1);
//			
//			
//			n = n/10;
//			op++;
//
//		}
//
//	}
//
//}
