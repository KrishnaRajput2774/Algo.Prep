
package algoPrep;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.print("Factors of "+n+": ");
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
