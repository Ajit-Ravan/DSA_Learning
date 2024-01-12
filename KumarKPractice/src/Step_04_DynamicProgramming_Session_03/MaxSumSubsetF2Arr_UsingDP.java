package Step_04_DynamicProgramming_Session_03;

import java.util.Scanner;

public class MaxSumSubsetF2Arr_UsingDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] a = new int[n+1];
		int [] b = new int[n+1];
		int [] dp = new int[n+1];

		for(int i=1;i<=n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=1;i<=n;i++){
			b[i] = sc.nextInt();
		}

		dp[1]= Math.max(a[1],b[1]);
		dp[2]= Math.max(a[1],Math.max(a[2],b[2]));

		for(int i=3;i<=n;i++){
		  int x = dp[i-1];
		  int y = a[i]+dp[i-2];
		  int z = b[i]+dp[i-2];
		  dp[i] = Math.max(x,Math.max(y,z));
		}

		System.out.println("ans : "+dp[n]);

	}

}
