package Step_01_HackerrankQuestions;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MigratoryBirds_Que_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int type = -1;
		Map<Integer, Integer> treemap = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (treemap.containsKey(arr[i])) {
				int val = treemap.get(arr[i]);
				treemap.put(arr[i], val + 1);
			} else {
				treemap.put(arr[i], 1);
			}
		}
		int maxCount = Integer.MIN_VALUE;
		for (Integer key : treemap.keySet()) {
			if (treemap.get(key) > maxCount) {
				maxCount = treemap.get(key);
				type = key;
			}
		}
		System.out.println(type);

	}

}
