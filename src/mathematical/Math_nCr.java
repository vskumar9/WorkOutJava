package mathematical;

import java.util.Scanner;

public class Math_nCr {
	
	static int nCr1(int n, int r) {
		if(n < r) return 0;
		return factorial(n)/(factorial(r) * factorial(n - r));
	}
	
	static int factorial(int a) {
		int result = 1;
		for(int i = 1; i <= a; i++) {
			result *= i;
		}
		return result;
	}
	
	 static int nCr2(int n, int r)
	    {
	        if(n<r)return 0;
	        if(n-r<r)
	        r=n-r;
	        int []dp=new int[r+1];
	        dp[0]=1;
	        int mod=1000000007;
	        for(int i=1;i<=n;i++){
	            for(int j=Math.min(n,r);j>0;j--){
	                dp[j]=(dp[j]+dp[j-1])%mod;
	            }
	        }
	        return dp[r];
	    }
	 
	 
	 static int nCr3(int n, int r)
	    {
	        // code here
	        int mod = (int)1e9 + 7;
	        if (r > n)
	            return 0;
	        int[] prev = new int[r + 1];
	        int[] curr = new int[r + 1];
	        prev[0] = curr[0] = 1;
	        if (r == n || r == 0) {
	            return 1;
	        }
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= r; j++) {
	                curr[j] = (prev[j - 1] + prev[j]) % mod;
	            }
	            prev = curr.clone();
	        }
	        return prev[r];
	    }
	 static int nCr4(int n, int r)
	    {
	        if(r>n){
	            return 0;
	        }
	        if((n-r)<r){
	            r=n-r;
	        }
	        int dp[]=new int[r+1];
	        int mod=1000000007;
	        dp[0]=1;
	        
	        for(int i=1;i<=n;i++){
	            for(int j=Math.min(i,r);j>0;j--){
	                dp[j]=(dp[j]+dp[j-1])%mod;
	            }
	        }
	        return dp[r];
	    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 'n' value: ");
		int n = sc.nextInt();
		System.out.print("Entet the 'r' value: ");
		int r = sc.nextInt();
		System.out.println(nCr1(n, r));
		
	}

}
