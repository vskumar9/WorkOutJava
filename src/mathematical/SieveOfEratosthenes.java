package mathematical;

import java.util.ArrayList;
import java.util.Scanner;

public class SieveOfEratosthenes {
	
    static ArrayList<Integer> sieveOfEratosthenes(int N){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 2; i <= N; i++) {
    		if(isPrime(i)) list.add(list.size(), i);
    	}
    	return list;
    }
    
    static boolean isPrime(int N) {
    	if(N <= 1) return false;
    	for(int i = 2; i <= Math.sqrt(N); i++) {
    		if(N % i == 0) return false;
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int N = sc.nextInt();
		
		ArrayList<Integer> arr = sieveOfEratosthenes(N);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
