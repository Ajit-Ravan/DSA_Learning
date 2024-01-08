package Step_04_BinarySearch_Session_03;

import java.util.Scanner;

public class Que_03_FindNthRootOfM {
	static boolean lessThanEqual(double mid, int n, int m) {
		// TODO Auto-generated method stub
		double res = 1;
		for (int i = 1; i <= n; i++) {
			res *= mid;
			if (res > m)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double l = 1, r = m;
		while (r - l > (1e-8)) {
			double mid = (1 + l) / 2;
			if (lessThanEqual(mid, n, m)) {
				l = mid;
			} else {
				r = mid;
			}
		}
		System.out.println(l);
	}

}
