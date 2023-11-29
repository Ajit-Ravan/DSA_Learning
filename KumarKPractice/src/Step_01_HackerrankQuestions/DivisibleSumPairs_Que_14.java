package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class DivisibleSumPairs_Que_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i<j) && (arr[i]+arr[j])%k==0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
