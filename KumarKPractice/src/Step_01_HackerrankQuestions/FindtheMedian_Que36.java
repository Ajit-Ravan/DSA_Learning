package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheMedian_Que36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//sorting array
		Arrays.sort(arr);
		int val = n/2;
		int median = arr[val];
		System.out.println(median);
	}

}
