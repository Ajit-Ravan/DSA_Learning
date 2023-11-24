package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class Staircase_Que_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = n - i-1; j > 0; j--) {
				System.out.print("_");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
	}

}
