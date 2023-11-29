package Step_01_HackerrankQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class NumberLineJump_12 {

	public static void main(String[] args) throws IOException {
		boolean temp = true;
		int count1 = 0, count2 = 0;// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values:");
		String input = sc.nextLine();
		String[] inValues = input.split(" ");
		int x1 = Integer.parseInt(inValues[0]);
		int v1 = Integer.parseInt(inValues[1]);
		int x2 = Integer.parseInt(inValues[2]);
		int v2 = Integer.parseInt(inValues[3]);

		int gap = Math.abs(x2 - x1);
		while (x1 != x2) {
			x1 = x1 + v1;
			x2 = x2 + v2;
			int newgap = Math.abs(x2 - x1);
			if (v2 > v1) {
				System.out.println("NO");
				break;
			} else if (newgap >= gap) {
				System.out.println("NO");
				break;
			} else if (x1 == x2) {
				System.out.println("YES");
				break;
			}

		}

	}

}
