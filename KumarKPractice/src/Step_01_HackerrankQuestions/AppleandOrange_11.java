package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleandOrange_11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int s = Integer.parseInt(firstMultipleInput[0]);

		int t = Integer.parseInt(firstMultipleInput[1]);

		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int applePosition = Integer.parseInt(secondMultipleInput[0]);

		int orangePosition = Integer.parseInt(secondMultipleInput[1]);

		String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int appleLength = Integer.parseInt(thirdMultipleInput[0]);

		int orangeLength = Integer.parseInt(thirdMultipleInput[1]);

		int appleFall = 0, orangeFall = 0;
		int appleCount = 0, orangeCount = 0;

		int[] apple = new int[appleLength];
		int[] orange = new int[orangeLength];
		for (int i = 0; i < apple.length; i++) {
			apple[i] = sc.nextInt();
		}
		for (int i = 0; i < orange.length; i++) {
			orange[i] = sc.nextInt();

		}

		for (int i = 0; i < apple.length; i++) {
			appleFall = apple[i] + applePosition;
			if (appleFall >= s && appleFall <= t) {
				appleCount++;
			}
		}
		for (int i = 0; i < orange.length; i++) {

			orangeFall = orange[i] + orangePosition;
			if (orangeFall >= s && orangeFall <= t) {
				orangeCount++;
			}
		}

		System.out.println(appleCount);
		System.out.println(orangeCount);

	}

}
