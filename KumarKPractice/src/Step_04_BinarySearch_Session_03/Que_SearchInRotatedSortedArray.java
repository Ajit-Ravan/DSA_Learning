package Step_04_BinarySearch_Session_03;

import java.util.Scanner;

public class Que_SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// SOLUTION USING BINARY SEARCH \\ TIME COMPLEXITY : O(log2(N)) //Space
		// Complexity : O(1)

		int target = sc.nextInt();
		int ans = -1;
		int left = 0, right = arr.length;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target)
				ans = mid;
			if (arr[mid] >= arr[0]) {
				if (target > arr[mid] || target < arr[0]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {
				if (target < arr[mid] || target > arr[n - 1]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
		}
		System.out.println(ans);
	}

}
