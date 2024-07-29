package Basic_;

import java.util.Scanner;

public class FriendlyPairOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the first number :  ");
		int n1 , n2;
		int sum1 =0 , sum2=0;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		for(int i=1;i<n1;i++) {
			if(n1%i==0) {
				sum1=sum1+i;
			}
		}
		for(int i=1;i<n2;i++) {
			if(n2%i==0) {
				sum2=sum2+i;
			}
		}

		if(sum1==n1 && sum2== n2) {
			System.out.println("friendly pair ");
		}else {
			System.out.println("Not frinedly pair ");
		}
	}

	}


