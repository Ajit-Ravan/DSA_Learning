package Step_01_HackerrankQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MissingNumbers_Que_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int m = sc.nextInt();
		List<Integer> brr = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			brr.add(sc.nextInt());
		}
		System.out.println(arr);
		System.out.println(brr);

		// First Method
//		List<Integer> res = new ArrayList<>();
//		Map<Integer, Integer> hmap = new HashMap<>();
//		for (int i = 0; i < brr.size(); i++) {
//			hmap.put(brr.get(i), hmap.getOrDefault(brr.get(i),0)+1);
//			// getOrDefault example. // Check if the given key is present in the Map // IF
//			// yes, its value will be returned
//		}
//		for (int i = 0; i < arr.size(); i++) {
//			if (hmap.containsKey(arr.get(i)) && hmap.get(arr.get(i)) > 0) {
//				hmap.put(arr.get(i), hmap.get(arr.get(i)) - 1);
//			}
//		}
//		for (Integer key : hmap.keySet()) {
//			if (hmap.get(key) > 0) {
//				for (int i = 0; i < hmap.get(key); i++) {
//					res.add(key);
//				}
//			}
//		}
//        for(int i=0;i<res.size();i++){
//            System.out.print(res.get(i)+" ");
//        }

		// Second Method
		Map<Integer, Integer> aMap = new HashMap<>();
		Map<Integer, Integer> bMap = new HashMap<>();
//		for (int i = 0; i < arr.size(); i++) {
//			if (aMap.containsKey(arr.get(i))) {
//				aMap.put(arr.get(i), aMap.get(arr.get(i) + 1));
//			} else {
//				aMap.put(arr.get(i), 1);
//			}
//		}
//		
//
//		for (int i = 0; i < brr.size(); i++) {
//			if (bMap.containsKey(brr.get(i))) {
//				bMap.put(brr.get(i), bMap.get(brr.get(i) + 1));
//			} else {
//				bMap.put(brr.get(i), 1);
//			}
//		}
//		System.out.println(aMap);
//		System.out.println(bMap);
		
		// Populate aMap
		for (int value : arr) {
		    aMap.put(value, aMap.getOrDefault(value, 0) + 1);
		}

		// Populate bMap
		for (int value : brr) {
		    bMap.put(value, bMap.getOrDefault(value, 0) + 1);
		}
		
		List<Integer> list = new ArrayList<>();

		// Compare the maps
		for (int element : bMap.keySet()) {
		    if (aMap.containsKey(element)) {
		        int aValue = aMap.getOrDefault(element, 0);
		        int bValue = bMap.getOrDefault(element, 0);
		        
		        if (bValue > aValue) {
		            for (int i = 0; i < (bValue - aValue); i++) {
		                list.add(element);
		            }
		        }
		    }
		    else {
		    	 list.add(element);
		    }
		}

		Collections.sort(list);
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
		    result[i] = list.get(i);
		}
		System.out.println(Arrays.toString(result));

//
//		List<Integer> list = new ArrayList<Integer>();
//		for (int element : bMap.keySet()) {
//			if (aMap.containsKey(element)) {
//				if (bMap.get(element) > aMap.get(element)) {
//					list.add(element);
//				} else {
//					list.add(element);
//				}
//			}
//
//		}
//		Collections.sort(list);
//		int[] result = new int[list.size()];
//		for (int i = 0; i < result.length; i++) {
//			result[i] = list.get(i);
//		}
//		System.out.println(Arrays.toString(result));
//	}

	}
}
