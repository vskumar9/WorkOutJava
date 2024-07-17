package mathematical;

import java.util.Scanner;

public class Math_nCr {
	
	static int nCr(int n, int r) {
		if(n < r) return 0;
		return factorial(n)/(factorial(r) * factorial(n - r));
	}
	
	static int factorial(int a) {
		int result = 1;
		for(int i = 1; i <= a; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 'n' value: ");
		int n = sc.nextInt();
		System.out.print("Entet the 'r' value: ");
		int r = sc.nextInt();
		System.out.println(nCr(n, r));
		
	}

}
