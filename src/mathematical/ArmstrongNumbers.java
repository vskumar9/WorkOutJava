package mathematical;

import java.util.Scanner;

public class ArmstrongNumbers {
	
	static String armstrongNumbers(int n) {
		int m = 0;
		int o = n;
		
		while(n > 0) {
			int remainder = n % 10;
			m += Math.pow(remainder, 3);
			n /= 10;
		}
		
		if(m == o)
			return "true";
		else
			return "false";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int n = sc.nextInt();
		
		System.out.println(armstrongNumbers(n));

	}

}
