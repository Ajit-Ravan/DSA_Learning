package Step_1_Basics.Basic_Maths;

public class Palindrome {
	public static boolean reverse(int x) {
		int rem = 0, rev = 0;
		int temp = x;
		boolean result = false;
		int sign = sign = Integer.signum(x);

		int absValue = Math.abs(x);

		while (absValue > 0) {
			rem = absValue % 10;
			absValue = absValue / 10;
			rev = (rev * 10) + rem;
		}
		if (temp == rev) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -121;
		System.out.println(reverse(x));
	}

}
