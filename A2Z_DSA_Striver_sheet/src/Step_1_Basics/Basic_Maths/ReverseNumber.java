package Step_1_Basics.Basic_Maths;

public class ReverseNumber {
	public static int reverse(int x) {
		int rem = 0, rev = 0;
		int temp = x;
		int sign = sign = Integer.signum(x);

		int absValue = Math.abs(x);

		while (absValue > 0) {
			rem = absValue % 10;
			absValue = absValue / 10;

			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
				return 0; // Overflow case for positive numbers
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
				return 0; // Overflow case for negative numbers
			}
			rev = (rev * 10) + rem;
		}
		return sign * rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1534236469;
		System.out.println(reverse(x));
	}

}
