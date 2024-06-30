package mathematical;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void table(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d ",n*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		table(n);
	}
}

/*

Create the multiplication table of a given number N and return the table as an array.


Example 1:

Input:
N = 9

Output:
9 18 27 36 45 54 63 72 81 90

*/