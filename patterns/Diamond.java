package patterns;

import java.util.Scanner;

public class Diamond {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nst = 1;
		int nsp = n/2;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			
			if(n/2>=i) {
				nst+=2;
				nsp--;
			}
			else
			{
				nst-=2;
				nsp++;
			}
			System.out.println();
			
			
			
		}
		
		
		
		
	}

}
