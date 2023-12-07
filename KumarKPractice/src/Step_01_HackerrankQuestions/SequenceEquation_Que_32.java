package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class SequenceEquation_Que_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0;i<p.length;i++) {
			p[i] =sc.nextInt();
		}
	
		for (int i = 1; i < p.length; i++) {
			int x = 0, y = 0;
			for (int j = 1; j < p.length; j++) {
				if (i == p[j]) {
					x = j;
					System.out.println("1st j "+x);
				}
			}
			for (int j = 1; j < p.length; j++) {
				if (x == p[j]) {
					y = j;
					System.out.println("2nd j "+y);

				}
			}
			System.out.println(y);
		}
	}
}
