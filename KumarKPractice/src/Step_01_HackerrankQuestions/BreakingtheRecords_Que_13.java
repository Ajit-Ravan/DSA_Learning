package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingtheRecords_Que_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}

		int minCount = 0, maxCount = 0;
		int min = score[0];
		int max = score[0];
		for (int i = 0; i < n; i++) {
			if (score[i] > max) {
				max = score[i];
				maxCount++;
				System.out.println(max + ":max");
			}
			if (score[i] < min) {
				min = score[i];
				minCount++;
				System.out.println(min + ":min");
			}
		}
		System.out.println(maxCount);
		System.out.println(minCount);
		sc.close();

	}

}
