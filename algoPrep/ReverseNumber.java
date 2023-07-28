package algoPrep;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		while(n!=0) {
			System.out.print(n%10);
			n/=10;
		}
		
		
	}

}
