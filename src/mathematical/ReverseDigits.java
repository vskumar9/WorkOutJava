package mathematical;

import java.util.Scanner;

public class ReverseDigits {
	
	static long reverseDigits(long n) {
		long o = 0;
		long m = n;
		int pos = 10;
		while(n > 0) {
			long remainder = n % 10;
			o = (o * pos) + remainder;
			n /= 10;
		}
		
//		System.out.println(o+" "+m);
		return o;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		long n = sc.nextLong();
		
		System.out.println(reverseDigits(n));

	}

}
