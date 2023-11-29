package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class SubarrayDivision_Que_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = 0, d = 0;
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] dm = new int[2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		dm[0] = sc.nextInt();
		dm[1] = sc.nextInt();
		d = dm[0];
		m = dm[1];
		
		int count = 0;
		if (n == m) {
			count++;
		} else {
			for (int i = 0; i <= s.length - m; i++) {
				int sum =0;
				for (int j = i; j < i+m; j++) {
						sum = sum+s[j];
					}
				if(sum == d) {
					count++;
				}
				}
			
		}
		System.out.println(count);

	}

}
