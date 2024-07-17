package mathematical;

import java.util.Scanner;

public class GcdOfArray {
	
	static int gcd(int a, int b) {
		if(b == 0)
			return a;
		return gcd(b, a%b);
	}
	
	static int gcdArray(int N, int arr[]) {
		if(N == 1) {
			return arr[0];
		}
		
		int result = arr[0];
		for(int i = 1; i < arr.length; i++) {
			result = gcd(result, arr[i]);
			
			if(result == 1)
				break;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array length: ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(gcdArray(N, arr));

	}

}
