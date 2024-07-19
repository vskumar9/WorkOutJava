package mathematical;

import java.util.Scanner;

public class PrimeNumber {
	
	static int isPrime1(int N) {
		if(N <= 1) return 0;
		for(int i = 2; i <= N/2; i++) {
			if(N % i == 0) return 0;
		}
		return 1;
	}
	
	static int isPrime2(int N) {
		if(N <= 1) return 0;
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(N % i == 0) return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int N = sc.nextInt();
		System.out.print(isPrime1(N));
		

	}

}
