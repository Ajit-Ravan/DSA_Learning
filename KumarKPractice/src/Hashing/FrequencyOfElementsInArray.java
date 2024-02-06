package Hashing;

import java.util.Arrays;

public class FrequencyOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 3, 4, 1, 4, 4, 4, 4 };
		int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x = arr[i];
			b[x] = b[x] + 1;
		}
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				System.out.println("Number : " + i + "  Count :" + b[i]);
			}
		}
	}

}
