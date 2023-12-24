package Step_04_Session_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//[1 2 2 2 1]
public class Que_01_MaximusDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int imax = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
//					System.out.println(i + "...i");
					if (i < j) {
						imax = j;
					}
				}
			}
//			System.out.println(imax + "...imax");
			if (max < imax - i) {
				max = imax - i;
			}
//			System.out.println(max);
		}
		System.out.println(max);
//		System.out.println(list);
	}

}
