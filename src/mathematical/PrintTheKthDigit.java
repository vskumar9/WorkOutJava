package mathematical;

import java.util.Scanner;

public class PrintTheKthDigit {
	
	static long kthDigit(int A, int B, int K) {
		
		long C = (long) Math.pow(A, B);
		
		long L = 0;
		
		for (int i = 0; i < K; i++) {
			L = C % 10;
			C /= 10;
		}
				
		return L;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A, B, K;
		
		System.out.print("Enter the 'A' value: ");
		A = sc.nextInt();
		System.out.print("Enter the 'B' value: ");
		B = sc.nextInt();
		System.out.print("Enter the 'K' value: ");
		K = sc.nextInt();
		
		System.out.println(kthDigit(A, B, K));

	}

}
