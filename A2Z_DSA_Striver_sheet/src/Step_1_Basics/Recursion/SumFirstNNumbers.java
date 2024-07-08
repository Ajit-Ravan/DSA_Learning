package Step_1_Basics.Recursion;

public class SumFirstNNumbers {
	static int sum = 0;

	public static void printSumOfallN(int N) {

		if (N == 0) {
			return;
		} else {
			printSumOfallN(N - 1);
			sum += N;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printSumOfallN(n);
		System.out.println(sum);

	}

}
