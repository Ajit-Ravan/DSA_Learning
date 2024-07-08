package Step_1_Basics.Recursion;

public class PrintNto1UsingRecursion {
	public static void printNto1(int N) {
		if (N == 0) {
			return;
		}
		{
			System.out.print(N + " ");
			printNto1(N - 1);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printNto1(n);
	}

}
