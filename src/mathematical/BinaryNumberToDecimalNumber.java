package mathematical;

import java.util.Scanner;

public class BinaryNumberToDecimalNumber {
	
	static int binary_to_decimal(String str) {
		
		int decimal = 0, pow = str.length()-1;
		String[] binary = str.split("");
		for(String i : binary) {
			decimal += Integer.valueOf(i) * Math.pow(2, pow);
			pow--;
		}
		
		return decimal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the binary number: ");
		String str = sc.next();
		
		System.out.println(binary_to_decimal(str));

	}

}
