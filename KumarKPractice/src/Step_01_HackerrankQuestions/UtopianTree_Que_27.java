package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class UtopianTree_Que_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = Integer.MIN_VALUE;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			len = Math.max(len, arr[i]);
		}
//		System.out.println(len);
		int[] tree = new int[len + 1];
		for (int i = 0; i <= len; i++) {
			if (i % 2 == 0 && i != 0) {
				tree[i] = (tree[i - 1]) + 1;
			} else if (i % 2 != 0) {
				tree[i] = (tree[i - 1]) * 2;
			} else {
				tree[i] = i + 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(tree[arr[i]]);
		}

	}

}
