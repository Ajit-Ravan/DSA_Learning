package Step_1_Basics.Basic_Maths;

public class SumOfAllDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		long sum = 0L;
		for (int i = 1; i <= n + 1; i++) {
			sum += (n / i) * i;

		}
		System.out.println("sum : " + sum);
	}

}
