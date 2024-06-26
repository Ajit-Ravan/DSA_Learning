package Step_04_DynamicProgramming_Session_04;

import java.util.Scanner;

public class Que_A_Frog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] b = new long[n + 1];
		long[] dp = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			b[i] = sc.nextLong();
		}

		dp[1] = 0;
		dp[2] = Math.abs(b[1] - b[2]);
		
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.min(Math.abs(b[i] - b[i - 1]) + dp[i - 1],
							 Math.abs(b[i] - b[i - 2]) + dp[i - 2]);
		}
		System.out.println(dp[n]);

	}

}
