package Step_1_Basics.Basic_Maths;

public class CountDigits {
	static int evenlyDivides(int N) {
		// code here
		int count = 0;
		int rem = 0, temp = N;
		while (N > 0) {
			rem = N % 10;
			N = N / 10;
			if (rem == 0)
				continue;
			if (temp % rem == 0) {
				count++;

			}

		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 22074;
		System.out.println(evenlyDivides(N));
	}

}
