package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalSum_Que_04 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		int[] firstD = new int[n];
		int[] secondD = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if (i == j) {
					firstD[i] = arr[i][j];
				}
				secondD[i] = arr[i][n - (i+1)];
			}
		}

		int sumFirstD = 0, sumSecondD = 0;
		for (int i = 0; i < n; i++) {
			sumFirstD += firstD[i];
			sumSecondD += secondD[i];
		}
		int result = Math.abs(sumFirstD - sumSecondD);
		System.out.println(result);

	}

}
