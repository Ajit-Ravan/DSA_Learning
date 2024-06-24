package Step_1_Basics.Basic_Maths;

public class lcmAndGcd {
	public static Long[] lcmGcd(Long A, Long B) {
		Long small = A > B ? A : B;
		Long lcm = (long) 0, gcd = (long) 0, big = (long) 0;

		for (Long i = 1L; i < small; i++) {
			if ((A * i) % B == 0) {
				lcm = A * i;
				System.out.println("lcm :" + lcm);
				System.out.println("i :" + i);
				break;
			}
		}
		for (Long i = 1L; i < small; i++) {
			if (A % i == 0 && B % i == 0) {
				big = i > big ? i : big;
				System.out.println("big:" + big);
				System.out.println("i :" + i);
			}
		}
		gcd = big;

		Long[] arr = new Long[2];
		arr[0] = lcm;
		arr[1] = gcd;

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long a = 5L, b = 10L;
		Long[] result = lcmGcd(a, b);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
