package patterns;

import java.util.Scanner;

public class HollowDiamond {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n/2+1;
		int nsp=1;
		
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			
			
			if(n/2>=i) {
				nst--;
				nsp+=2;
			}
			else
			{
				nst++;
				nsp-=2;
			}
			System.out.println();
			
			
			
		}
		
		
		
		
	}

}
