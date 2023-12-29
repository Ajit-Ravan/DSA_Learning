package Step_04_Session_05;

import java.util.HashMap;
import java.util.Scanner;

public class Que_01_SubarraysHavingSumEqualToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> sumFreq = new HashMap<>();
		sumFreq.put(0, 1);
		int count = 0, cumulativeSum = 0;

		for (int num : arr) {
			cumulativeSum += num;
			count += sumFreq.getOrDefault(cumulativeSum - k, 0);
			sumFreq.put(cumulativeSum, sumFreq.getOrDefault(cumulativeSum, 0) + 1);
		}

		System.out.println(count);
	}

}
