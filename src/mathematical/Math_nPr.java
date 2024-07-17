package mathematical;

import java.util.Scanner;

public class Math_nPr {
	
	static long nPr(long n, long r) {
		return factorial(n)/factorial(n - r);
	}
	static long factorial(long a) {
		long result = 1;
		for(int i = 1; i <= a; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 'n' value: ");
		long n = sc.nextLong();
		System.out.print("Enter the 'r' value: ");
		long r = sc.nextLong();
		
		System.out.println(nPr(n, r));

	}

}
