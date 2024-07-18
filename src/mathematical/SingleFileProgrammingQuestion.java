package mathematical;

import java.util.Scanner;

public class SingleFileProgrammingQuestion {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] values = input.split(" ");
		
		int N1 = Integer.parseInt(values[0]);
		int N2 = Integer.parseInt(values[1]);
		
		
		
		try {
			System.out.println(N1/N2);			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
