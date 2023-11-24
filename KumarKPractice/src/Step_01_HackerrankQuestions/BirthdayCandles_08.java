package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandles_08 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}

		Collections.sort(arr);
		System.out.println(arr);
		int count = 0;

		for (int i = arr.size() - 1; i >= 0; i--) {
			if (arr.get(arr.size() - 1) == arr.get(i)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
