package Hashing_Session_01;

import java.util.Scanner;

//Que. Cummulative sum 

//Input:
//3
//1 4 1
//3
//1 1
//1 2
//0 2

public class CommulativeSum_PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] prefixSum = new int[n];
		int sum = 0;
		System.out.println("Enter array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			prefixSum[i] = sum;
		}
		System.out.println("Enter Queries :");
		int Q = sc.nextInt();
		while (Q > 0) {
			System.out.println("Enter l and r :");
			int l = sc.nextInt();
			int r = sc.nextInt();
			int right = prefixSum[r];
			int left = l == 1 ? 0 : prefixSum[l - 1];
			System.out.println("sum :"+ (right - left));
			Q--;
		}

	}

}
