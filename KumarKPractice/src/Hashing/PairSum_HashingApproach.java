package Hashing;

import java.util.HashSet;

public class PairSum_HashingApproach {
	// HASHING APPROACH
	// find out the pair from array whose sum == x

	public static int pairSum(int[] arr, int x, int n) {
		// TODO Auto-generated method stub
		HashSet<Integer> pairSet = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int temp = x - arr[i]; // calculating diff.for current element
			// check if element already in the set
			if (pairSet.contains(temp)) {
				return 0;
			}
			pairSet.add(arr[i]); // every element will be inserted if we didn't find ans using current element
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, -1, 1, 3 };
		int x = -2;
		int n = arr.length;
		if (pairSum(arr, x, n) == -1) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}

	}

}
