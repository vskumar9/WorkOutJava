package mathematical;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JumpingNumbers {
	
	public static long jumpingNumbers(long X) {
		
		long result = 0;
		if(X <= 9)
			return X;
		
		Queue<Long> queue = new LinkedList<>();
		
		for(int i = 1; i <= 9; i++)
			queue.offer((long) i);
		
		while(!queue.isEmpty()) {
			long num = queue.poll();
			if(num <= X ) {
				result = Math.max(result, num);
				long lastDigit = num % 10;
				
				if(lastDigit > 0) {
					long nextNum = num * 10 +(lastDigit - 1);
					if(nextNum <= X) {
						queue.offer(nextNum);
					}
				}
				if(lastDigit <9) {
					long nextNum = num * 10 +(lastDigit + 1);
					if(nextNum <= X) {
						queue.offer(nextNum);
					}
				}
			}
		}	
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		long X = sc.nextLong();
		
		System.out.println(jumpingNumbers(X));

	}

}
