package mathematical;

import java.util.Scanner;

public class PairCubeCount {
	
	static int pairCubeCount(int N) {
		int count = 0;
		int maxA = (int) Math.cbrt(N);
		
		for(int i = 1; i <= maxA; i++) {
			int iCube = i * i * i;
			int jCube = N - iCube;
			
			if(jCube >= 0) {
				int j = (int) Math.cbrt(jCube);
				if(j * j * j == jCube) count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int N = sc.nextInt();
		System.out.println(pairCubeCount(N));

	}

}
