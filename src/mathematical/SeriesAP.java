package mathematical;

import java.util.Scanner;

public class SeriesAP {
	
	public static void nThTerm(int a, int b, int n) {
		int d = b-a;
		System.out.println("nth term: "+(a+((n-1)*d)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st term: ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd term: ");
		int b = sc.nextInt();
		System.out.print("Enter the nth term: ");
		int n = sc.nextInt();
		
		nThTerm(a, b, n);
	}

}
