package Step_01_HackerrankQuestions;
//INput:

import java.util.ArrayList;

//4
//5 4 3 2
//Output:
//2 3 3 4 4 5
//min diff bet pairs
//(2 3) (3 4) (4 5)

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers_Que_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int s = Math.abs(arr[0]);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[n - 1]) {
				s = Math.abs(arr[i] - arr[i + 1]);
				if (s < min) {
					min = s;
				}
			}
			System.out.println(min + ":this is minimum");
		}
		System.out.println(Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int val = 0;
			if (arr[i] != arr[n - 1]) {
				val = Math.abs(arr[i] - arr[i + 1]);
			} else {
				val = Math.abs(arr[i]);
			}
			System.out.println(val + ":" + min);
			if (val == min) {
				list.add(arr[i]);
				list.add(arr[i + 1]);
			}
		}
		Collections.sort(list);
		System.out.println(list);

	}

}
