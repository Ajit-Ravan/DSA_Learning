package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class FindDigits_Que_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int r = 0;
			while (num != 0) {
				r = num % 10;
				if (r == 0) {
					count--;
					break;
				}
				if (num % r == 0)
					count++;
				num = num / 10;
			}
			System.out.println(count);
		}

	}

}
