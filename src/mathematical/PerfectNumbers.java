package mathematical;

import java.util.Scanner;

public class PerfectNumbers {
	
	static int isPerfectNumber(long N) {
		
		if(N == 1) return 1;
		
		long n = N/2;
		long value = 0;
		
		
		for(int i = 1; i <= n; i++) {
			if(N % i == 0) value += i;
		}
		
		if(value == N) return 1;
		
		return 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long N = sc.nextLong();
		System.out.println(isPerfectNumber(N));
	}

}
