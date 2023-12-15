package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int lSum = 0, rSum = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			rSum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			lSum += arr[i];
			if (rSum == lSum) {
				count++;
				break;
			}
//			System.out.println(count);
			rSum = rSum - arr[i];
		}
//		System.out.println(count);
		if (count == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
