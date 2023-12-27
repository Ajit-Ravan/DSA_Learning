package Step_04_Session_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Que_02_SubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 int maxLength = 0;
	        int sum = 0;
	        Map<Integer, Integer> sumIndexMap = new HashMap<>();
	        sumIndexMap.put(0, -1); // Initialize with a sum of 0 at index -1

	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];

	            // If the sum is found in the map, calculate the length of subarray
	            if (sumIndexMap.containsKey(sum)) {
	                maxLength = Math.max(maxLength, i - sumIndexMap.get(sum));
	            } else {
	                sumIndexMap.put(sum, i);
	            }
	        }

	       System.out.println(maxLength);

	}

}
