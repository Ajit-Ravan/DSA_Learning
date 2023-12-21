package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_RunningTimeOfAlgorithms_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OUR CODE FAILED 3 TEST CASESE
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int s =0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (i != arr.length - 1) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					int r = arr[i];
					count++;
					for (int j = i - 1; j >= 0; j--) {
						if (r < arr[j]) {
							int temp2 = arr[j + 1];
							arr[j + 1] = arr[j];
							arr[j] = temp;
							count++;
						} else if (r > arr[j] && r <= arr[j + 1]) {
							int temp3 = arr[j + 1];
							arr[j + 1] = r;
							r = temp3;
							count++;
						} else {
							break;
						}
					}
				}			
//				for (int e : arr) {
//					System.out.print(e + " ");
//				}
//				System.out.println(); 	
				
				
			}
			s += count;
		}
		System.out.println(s);
		
		//SOLUTION CODE
		
//		int count =0;
//		for(int i=0;i<arr.size();i++) {
//			int j=i;
//			while(j>=0 && arr.get(j)>arr.get(j+1)) {
//				int num = arr.get(j);
//				arr.set(j,arr.get(j+1));
//				arr.set(j+1,num);
//				count++;
//				j--;
//			}
//		}
//		return count;

	}

}
