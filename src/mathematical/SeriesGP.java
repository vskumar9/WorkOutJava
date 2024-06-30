package mathematical;

import java.util.Scanner;

public class SeriesGP {
	
	public static int Nth_term(int a, int r, int n)
    {
        // code here
        long rToThePower = modularExponentiation(r, n - 1, 1000000007);
        long result = (a * rToThePower) % 1000000007;
        return (int) result;
    }
    private static long modularExponentiation(int base, int exp, int mod) {
        long result = 1;
        long baseMod = base % mod;
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result = (result * baseMod) % mod;
            }
            baseMod = (baseMod * baseMod) % mod;
            exp = exp / 2;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 'a' value: ");
		int a = sc.nextInt();
		System.out.print("Enter the 'r' value: ");
		int r = sc.nextInt();
		System.out.print("Enter the 'n' value: ");
		int n = sc.nextInt();
		System.out.println(Nth_term(a, r, n));

	}

}
