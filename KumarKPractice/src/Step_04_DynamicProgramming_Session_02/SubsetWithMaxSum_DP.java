package Step_04_DynamicProgramming_Session_02;

import java.util.Scanner;

public class SubsetWithMaxSum_DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1]; // using 1-based indexing
		int i = 1;
		while (i <= n) {
			a[i] = sc.nextInt();
			i++;
		}
		// calculate subset with maximum sum such that no two elements are adjacent
		// step 1 : declare dp array
		int[] dp = new int[n + 1];
		int l = 0;
		dp[1] = Math.max(a[1], l);
		dp[2] = Math.max(a[1], Math.max(a[2], l));
		// we calculated the formula : dp[i] = Math.max(dp[i-1],a[i]+dp[i-2])
		i = 3;
		while (i <= n) {
			dp[i] = Math.max(dp[i - 1], a[i] + dp[i - 2]);
			i++;
		}
		System.out.println(dp[n]);
	}

}
