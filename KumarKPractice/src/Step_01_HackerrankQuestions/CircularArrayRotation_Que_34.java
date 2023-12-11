package Step_01_HackerrankQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CircularArrayRotation_Que_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Reading inputs
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int q = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int[] queries = new int[q];
		for (int i = 0; i < q; i++) {
			queries[i] = scanner.nextInt();
		}

//        // Perform rotation
//        k = k % n; // To handle cases where k > n, reducing unnecessary rotations
//        int[] rotatedArray = new int[n];
//        System.arraycopy(array, n - k, rotatedArray, 0, k);
//        System.arraycopy(array, 0, rotatedArray, k, n - k);
//
//        // Retrieve elements at specified indices
//        for (int i = 0; i < q; i++) {
//            int query = scanner.nextInt();
//            System.out.println(rotatedArray[query]);
//        }
//
//        scanner.close();

		// 2nd solution
		int er = k%arr.length;
		Map<Integer,Integer> hmap = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {
				hmap.put((i+er)%arr.length, arr[i]);
			}

		List<Integer>list = new ArrayList<>();
		for(Integer r: queries) {
			list.add(hmap.get(r));
			System.out.println(hmap.get(r));
		}


	}

}
