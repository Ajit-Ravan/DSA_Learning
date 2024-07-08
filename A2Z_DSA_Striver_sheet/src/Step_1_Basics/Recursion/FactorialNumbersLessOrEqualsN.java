package Step_1_Basics.Recursion;

import java.util.ArrayList;

public class FactorialNumbersLessOrEqualsN {
	public static ArrayList<Long> factorialNumbers(int N) {
		long fact = 1;

		ArrayList<Long> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			fact = fact * i;
			if (fact > N) {
				break;
			}
			list.add(fact);

		}
		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(factorialNumbers(n));

	}

}
