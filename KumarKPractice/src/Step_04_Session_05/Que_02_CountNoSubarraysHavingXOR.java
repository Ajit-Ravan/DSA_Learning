package Step_04_Session_05;

import java.util.Scanner;

public class Que_02_CountNoSubarraysHavingXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int xor = 0;
			for (int j = i; j < arr.length; j++) {
				xor ^= arr[j];
				if (xor == k) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
