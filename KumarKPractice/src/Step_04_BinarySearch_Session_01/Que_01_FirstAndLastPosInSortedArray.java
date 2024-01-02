package Step_04_BinarySearch_Session_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Que_01_FirstAndLastPosInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int first = -1, last = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				if (first == -1) {
					first = i;
				}
				last = i;
			}
		}
		int[] r = new int[] { first, last };
		System.out.println(Arrays.toString(r));
	}

}
