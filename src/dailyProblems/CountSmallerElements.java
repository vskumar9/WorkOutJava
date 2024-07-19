package dailyProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSmallerElements {
	
	static int[] constructLowerArray1(int[] arr) {
		
		int[] couuntElement = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = i; j < arr.length; j++) {	
				if(arr[i] > arr[j]) count++;
			}
			couuntElement[i] = count;
		}
		
		return couuntElement;
	}
	
	static int[] constructLowerArray2(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = n - 1; i >= 0; i--) {
			if(list.isEmpty() || list.get(list.size() - 1) < arr[i]) {
				result[i] = list.size();
				list.add(arr[i]);
			}
			else {
				int index = -1;
				int low = 0, high = list.size() - 1;
				while(low <= high) {
					int mid = low + (high - low) / 2;
					if(arr[i] > list.get(mid)) {
						index = mid;
						low = mid + 1;
					}
					else {
						high = mid - 1;
					}
				}
				result[i] = index + 1;
				list.add(index + 1, arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] values = str.split(" ");
		int[] arr = new int[values.length];
		for(int i = 0; i < values.length; i++) {
			arr[i] = Integer.parseInt(values[i]);
		}
		int[] val = constructLowerArray1(arr);
		for(int i : val) {
			System.out.print(i + " ");
		}
	}

}
