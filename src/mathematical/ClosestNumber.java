package mathematical;

import java.util.Scanner;

public class ClosestNumber {
	
	public static int closestNumber(int n, int m) {
		
		int closestFloor = (n/m) * m;
		int closetCeil = (n % m == 0) ? closestFloor : closestFloor + (m*Integer.signum(n));
		
		int distanceFloor = Math.abs(n - closestFloor);
		int distanceCeil = Math.abs(n - closetCeil);
		
		if(distanceFloor < distanceCeil) {
			return distanceFloor;
		}
		else if(distanceCeil < distanceFloor) {
			return distanceCeil;
		}
		else {
			return (Math.abs(closestFloor) > Math.abs(closetCeil)) ? closestFloor : closetCeil;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(closestNumber(n, m));

	}

}
