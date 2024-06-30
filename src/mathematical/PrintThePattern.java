package mathematical;

import java.util.Scanner;

public class PrintThePattern {
	
	public static void pattern(int n) {
		
		for(int i = n; i > 0; i--) {
			for(int j = n; j > 0; j--) {
				for(int k = 0; k < i; k++)
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		pattern(n);


	}

}



/*

You are given a number n. You need to print the pattern for the given value of n.

For n = 2 the pattern will be 
2 2 1 1
2 1

For n = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

*/
