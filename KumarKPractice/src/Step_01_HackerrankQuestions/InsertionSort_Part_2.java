package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					int r = arr[i];
					for (int j = i - 1; j >= 0; j--) {
						if (r < arr[j]) {
							int temp2 = arr[j + 1];
							arr[j + 1] = arr[j];
							arr[j] = temp;
						} else if (r > arr[j] && r <= arr[j + 1]) {
							int temp3 = arr[j + 1];
							arr[j + 1] = r;
							r = temp3;
						} else {
							break;
						}
					}
				}
				for (int e : arr) {
					System.out.print(e + " ");
				}
				System.out.println();
			}
			

		}

	}

}
