package Step_04_Session_01;

import java.util.Arrays;
import java.util.Scanner;

public class Que_03_CumulativeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter n :");
		int n = sc.nextInt();
		int[] arr = new int[n];
//		System.out.println("Enter array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println("Enter Queries :");
		int q = sc.nextInt();
		int[][] que = new int[q][2];
		int f = 0, t = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < 2; j++) {
				que[i][j] = sc.nextInt();
			}
		}
//		System.out.println(Arrays.deepToString(que));
		for (int i = 0; i < q; i++) {
			int sum = 0;
			f = que[i][0];
			t = que[i][1];
//			System.out.println(f + " " + t);
			for (int k = f; k <= t; k++) {
				sum += arr[k];
			}
					System.out.println(sum);
		}
	}

}
