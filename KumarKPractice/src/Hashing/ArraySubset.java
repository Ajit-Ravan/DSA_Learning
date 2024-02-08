package Hashing;

import java.util.HashSet;
import java.util.Set;

public class ArraySubset {
	// check if the given array is subset of another array or not

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 6, 7, 3, 2 };
		int[] arr2 = { 2, 3 };
		int n1 = arr1.length, n2 = arr2.length;

		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < n1; i++) {
			s.add(arr1[i]);
		}

		for (int i = 0; i < n2; i++) {
			if (!s.contains(arr2[i])) {
				System.out.println("arr2 is not subset of arr1");
				return;
			}
		}
		System.out.println("arr2 is a subset of arr1");

	}

}
