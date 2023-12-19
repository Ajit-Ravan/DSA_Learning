package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_Part1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[arr.length - 1];
//		System.out.println(temp);
		for (int i = arr.length - 2; i >= 0; i--) {
			
			if (temp < arr[i]) {
				arr[i + 1] = arr[i];
			} else if (temp > arr[i] && temp <= arr[i + 1]) {
				arr[i + 1] = temp;
			} else {
				break;
			}

			for (int e : arr) {
				System.out.print(e + " ");
			}
			System.out.println();

		}
		
		if (arr[0] == arr[1]) {
			arr[0] = temp;
			for (int e : arr) {
				System.out.print(e + " ");
			}
		}
	}
}
