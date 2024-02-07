package Hashing;

import java.util.HashMap;

public class FrequencyOfElement_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int[] a = { 1, 3, 3, 4, 1, 4, 4, 4, 4 };
		HashMap<Integer, Integer> b = new HashMap<>();
		int i = 0;
		while (i < n) {
			int x = a[i];
			b.put(x, b.getOrDefault(x, 0) + 1);
			i++;
		}
		// above loop taking O(N) time
		// all freq. have been calculated in advanced now

		int[] queries = { 3, 4, 1 };
		int q = 3;
		int j = 0;
		while (j < q) {
			int x = queries[j];
			System.out.print(b.getOrDefault(x, 0) + " ");
			j++;
		}

		// above for loop taking O(q) time
		// so total time = O(N+Q)

	}

}
