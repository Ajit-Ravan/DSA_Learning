package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class CountingValleys_Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level = 0;
		int valleys = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				level++;
			} else if (s.charAt(i) == 'D') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}
		System.out.println(valleys);

	}

}
