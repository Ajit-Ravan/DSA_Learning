package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] res = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			for (int j = 0; j < 3; j++) {
				if (arr[i] >= 38 && (arr[i] + j) % 5 == 0) {
					res[i] = arr[i] + j;

				} else if (res[i] < 40) {
					res[i] = arr[i];
				}
			}
		}

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

}
