package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class BeautifulDaysattheMovies_Que_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int res = 0, count = 0;
		for (int i = n; i <= m; i++) {
			int number = i, reversed = 0;

			while (number != 0) {
				int digit = number % 10;
				reversed = reversed * 10 + digit;
				number /= 10;
			}
			res = Math.abs(i - reversed);
			if (res % d == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
