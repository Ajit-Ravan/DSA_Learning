package Hashing;

public class PairSumEqualsK_Bruteforce {
	// USING BRUTEFORCE
	// find out the pair from array whose sum == x

	static boolean pairSum(int[] arr1, int x, int n) {

		// traversing till n-1 becase at last index we dont have any element further to
		// make pair
		for (int i = 0; i < n - 1; i++) { //
			for (int j = i + 1; j < n; i++) { // startin j from i+1 to avoide duplicates
				if (arr1[i] + arr1[j] == x) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 0, -1, 2, -3, 1 };
		int x = 0;
		int n = arr1.length;

		if (pairSum(arr1, x, n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
