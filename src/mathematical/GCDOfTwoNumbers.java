package mathematical;

import java.util.Scanner;

public class GCDOfTwoNumbers {
	
	static int gcd(int a, int b) {
		if(b == 0)
			return a;
		System.out.println(a%b);
		return gcd(a, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 'a' value: ");
		int a = sc.nextInt();
		System.out.print("Enter the 'b' value: ");
		int b = sc.nextInt();
		
		System.out.println(gcd(a, b));
		
		
	}

}
