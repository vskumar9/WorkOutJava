package mathematical;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int N) {
		if(N == 1)
			return 1;
		return N * factorial(N-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int N = sc.nextInt();
		
		System.out.println(factorial(N));

	}

}
