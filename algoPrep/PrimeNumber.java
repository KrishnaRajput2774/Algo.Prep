package algoPrep;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        
        for(int i=2;i<=Math.sqrt(n);i++) {
        	
        	if(n%i==0) {
        		System.out.println("Not Prime");
        		c++;
        		break;
        	}
        }
        if(c==0) {
        	System.out.println("is Prime");
        }
    
			
	}

}
