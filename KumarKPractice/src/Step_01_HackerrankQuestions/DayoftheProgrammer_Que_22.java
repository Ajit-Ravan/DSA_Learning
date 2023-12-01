package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class DayoftheProgrammer_Que_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int[] m = { 31, 28, 31, 30, 31, 30, 31, 31 };
		int p = 256, sum = 0, diff = 0;
		if (year == 1918) {
			System.out.println("26.09." + Integer.toString(year));
		}
		if (year <= 1917) {
			if (year % 4 == 0)
				m[1] = 29;
		}
		if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
			m[1] = 29;
		}
		for (int a : m) {
			sum += a;
		}
		diff = p - sum;
		System.out.println(Integer.toString(diff) + "." + "09." + Integer.toString(year));
	}

}
