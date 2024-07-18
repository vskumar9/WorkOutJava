package dailyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LongestAlternatingSubsequence {

	public static void main(String[] args) throws IOException {
		
//        int[] arr1 = {1, 5, 4};
//        System.out.println("Longest Good Sequence Length: " + longestAlternatingSequence(arr1));  // Output: 3
//        
//        int[] arr2 = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
//        System.out.println("Longest Good Sequence Length: " + longestAlternatingSequence(arr2));  // Output: 7
//        
//        int[] arr3 = {3, 4, 9, 6, 5, 2, 5};
//        System.out.println("Longest Good Sequence Length: " + longestAlternatingSequence(arr3));  // Output: 4
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int[] num = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            System.out.println(longestAlternatingSequence(num));
		}
		
    }

    public static int longestAlternatingSequence(int[] arr) {
        if (arr.length == 0) return 0;

        int up = 1;
        int down = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                up = down + 1;
            } else if (arr[i] < arr[i - 1]) {
                down = up + 1;
            }
        }

        return Math.max(up, down);
    }

}
