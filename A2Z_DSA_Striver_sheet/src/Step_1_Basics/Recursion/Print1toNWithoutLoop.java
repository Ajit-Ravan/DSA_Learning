package Step_1_Basics.Recursion;

public class Print1toNWithoutLoop {
	static int count = 1;

	public static void printNos(int N) {
		// Your code here

		if (N == 0) {
			return;

		} else {
			printNos(N - 1);
			System.out.print(N + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		printNos(n);

	}

}
