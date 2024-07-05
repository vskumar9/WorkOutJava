package mathematical;

import java.util.Scanner;

public class SumOfDigitIsPallindromeOrNot {
	
	static int sumOfDigitIsPallindromeOrNot(int n) {
		
		int m = 0;
		
		while(n > 0) {
			int remainder = n % 10;
			m += remainder;
			n /= 10;
		}
		
		int o = 0;
		n = m;
		int pos = 1;
		while(n > 0) {
			int remainder = n % 10;
			o = (o * pos) + remainder;
			n /= 10;
			pos *= 10;
		}
		
		System.out.println(o+" "+m);
		
		if(o == m) {
			return 1;
		}
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println(sumOfDigitIsPallindromeOrNot(n));
		
	}

}
