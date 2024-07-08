package Step_1_Basics.Recursion;

public class PrintNameNtimes {
	public static void printName(int N) {
		// Your code here

		if (N == 0) {
			return;

		} else {
			printName(N - 1);
			System.out.print("GFG ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printName(n);

	}

}
