package Step_01_HackerrankQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BetweenTwoSets_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int[] arr2 = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		getTotalX(arr1,arr2);
	}

	static int getGCD(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return getGCD(n2, n1 % n2);
	}

	static int getLCM(int n1, int n2) {
		if (n1 == 0 || n2 == 0)
			return 0;
		else {
			int gcd = getGCD(n1, n2);
			return Math.abs(n1 * n2) / gcd;
		}
	}

	public static int getTotalX(int[] arr1, int[] arr2) {
		int result = 0;

		// Get LCM of all elements of a
		int lcm = arr1[0];
		for (int a : arr1) {
			lcm = getLCM(lcm, a);
		}

		// Get GCD of all elements of b
		int gcd = arr2[0];
		for (int b : arr2) {
			gcd = getGCD(gcd,b );
		}

		// Count multiples of lcm that divide the gcd
		int multiple = 0;
		while (multiple <= gcd) {
			multiple += lcm;

			if (gcd % multiple == 0)
				result++;
		}

		return result;

	}

}
