package Step_04_DynamicProgramming_Session_01;

import java.util.Scanner;

public class DynamicProgrammingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5; // size of an array
		int[] a = { 6, 7, 3, 2, 2 };
		int[] dp = new int[n + 1];// dp array
		int i = 0;
		while (i <= n - 1) {
			if (i == 0) {
				dp[i] = a[i];
			} else {
				dp[i] = dp[i - 1] + a[i];
			}
			i++;
		}
		int q = 4;// number of queries
		int[] w = { 0, 3, 4, 2 }; // array of queries
		i = 0;
		while (i <= q - 1) {
			int query = w[i];
			System.out.println("sum of 0 to " + i + " elements is : " + dp[query]); // answering each query in --> O(1)
			i++;
		}
	}

}
