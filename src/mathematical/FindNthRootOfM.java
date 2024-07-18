package mathematical;

import java.util.Scanner;

public class FindNthRootOfM {
	
	static int nThRoot(int n, int m) {
		
		int nThRoot = (int) Math.round(Math.pow(m, 1.0/n));
		System.out.println((Math.pow(m, 1.0/n)));
		
		if(m == Math.pow(nThRoot, n)) return nThRoot;
//		 
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 'n' value: ");
		int n = sc.nextInt();
		System.out.print("Enter the 'm' value: ");
		int m = sc.nextInt();
		
		System.out.println(nThRoot(n, m));
	}

}
