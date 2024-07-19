package mathematical;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfAllPrimeNumbersBetween1AndN {
	
	static long primeSum(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= n; i++) {
			if(isPrime(i)) list.add(list.size(), i);
		}
		long sum = list.stream().reduce(0, (a, b) -> a + b);
		long sum1 = list.stream().mapToInt(Integer :: intValue).sum();
		long sum2 = list.stream().collect(Collectors.summingInt(Integer :: intValue));
		
		return sum;
		
	}
	
	static boolean isPrime(int N) {
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(N % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(primeSum(n));

	}

}
