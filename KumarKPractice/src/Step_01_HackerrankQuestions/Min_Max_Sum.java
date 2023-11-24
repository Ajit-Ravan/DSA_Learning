package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Min_Max_Sum {

	public static void main(String args[]) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		;
		int sum = 0;
		List<Integer> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			arr.add(scanner.nextInt());
//			if(arr.add(scanner.nextInt()== (String)" "){
//				break;
//			}
			}

		
		for (int i = 0; i < 5; i++) {
			arr.add(scanner.nextInt());
			if (min > arr.get(i)) {
				min = arr.get(i);
			}
			if (max < arr.get(i)) {
				max = arr.get(i);

			}
			sum += arr.get(i);

		

		int res1 = sum - max;
		int res2 = sum - min;
		System.out.println(res1 + " " + res2);

	}

}
