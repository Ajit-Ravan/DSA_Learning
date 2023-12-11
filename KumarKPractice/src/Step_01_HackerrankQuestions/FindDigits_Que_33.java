package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class FindDigits_Que_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while (temp != 0) {
			int rem = temp % 10;
			if (rem != 0 && n % rem == 0) {
				count++;
			}
			temp/=10;
			System.out.println(count);

		}
	}

}
