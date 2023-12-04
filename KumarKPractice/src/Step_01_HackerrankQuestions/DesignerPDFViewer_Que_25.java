package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DesignerPDFViewer_Que_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] alph = new int[26];
		char[] alphaArr = new char[alph.length];
		for (int i = 0; i < alph.length; i++) {
			alph[i] = sc.nextInt();
			alphaArr[i] = (char) (i + 97);

		}
		String str = sc.next();
		int n = str.length();
		int max = Integer.MIN_VALUE;
		int[] count = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < alphaArr.length; j++) {
				if (str.charAt(i) == alphaArr[j]) {
					System.out.println(str.charAt(i)+" "+alphaArr[j]);
					count[i] = alph[j];
					if (count[i] > max) {
						max = count[i];
					}
				}
			}
		}
		int result = max * n;
		System.out.println(Arrays.toString(alph));
		System.out.println(Arrays.toString(alphaArr));
		System.out.println(Arrays.toString(count));
		System.out.println("Result :" + result);

	}

}
