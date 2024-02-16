package Hashing_Session_02;

import java.util.HashMap;
import java.util.Map;
//count pairs with givn sum

public class CountPairsWithGivenSum {
	public static int getPairsCount(int[] arr, int n, int k) {
		Map<Integer, Integer> frequency = new HashMap<>();
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int b = arr[i];
			int a = k - b;
			ans += frequency.getOrDefault(a, 0);
			frequency.put(b, frequency.getOrDefault(b, 0) + 1);
		}

		return ans;
	}

	public static void main(String[] args) {
		// Example usage:
		int[] arr = { 1, 5, 7, 1 };
		int n = arr.length;
		int k = 6;
		int result = getPairsCount(arr, n, k);
		System.out.println("Number of pairs with sum " + k + ": " + result);
	}
}
