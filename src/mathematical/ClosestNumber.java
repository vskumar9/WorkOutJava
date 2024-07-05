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

	public static int closestNumber_2(int N, int M) {
		if (N % M == 0) {
	        return N;
	        }
		int Y=N+1;
		int X=N-1;
	      
	     while(true) {
	    	 
	       if(X%M==0) {
	    	   return X;
	       }
	       else if(Y%M==0) {
	    	   return Y;
	       }
	       else {
	    	   X--;
	           Y++;
	       }
	     }
	}
	
	public static int closestNumber_3(int N, int M) {
		int quotient = N / M;
        
        int n1 = M * quotient;
        int n2 = (N * M > 0) ? M * (quotient + 1) : M * (quotient - 1);
        
//        System.out.println(quotient+" "+n1+" "+n2);
        
        if (Math.abs(N - n1) < Math.abs(N - n2)) 
        {
            return n1;
        } 
        else if (Math.abs(N - n1) > Math.abs(N - n2))
        {
            return n2;
        }
        else
        {
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(closestNumber_3(n, m));

	}

}
