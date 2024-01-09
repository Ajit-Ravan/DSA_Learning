package Step_04_Recursion;

import java.util.Scanner;

public class SumOfAllNoUsingRecursion {
	public static int f(int val) {
		if(val == 0) {
			return 0;  //now the process starts of sending answers upwards
		}
		return val+f(val-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(f(n));

	}

}
