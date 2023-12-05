package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class ViralAdvertising_Que_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = 5, s = 0, i = 0, sum = 0;
		while (i < m) {
			s = (n / 2);
			sum = sum + s;
			n = s * 3;
			i++;
		}
		System.out.println(sum);

	}

}
