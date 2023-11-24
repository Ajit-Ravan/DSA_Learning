package Step_0;

import java.util.Scanner;

//..*--   --
//.***-     |  part 1
//*****   --
//.***-    -- |part 2
//..*--    --
public class Lecture_05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = (n / 2) + 1;
		// first part
		for (int i = 0; i < x; i++) {
			for (int j = 1; j <= x - i - 1; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// second part
		for (int i = 1; i <= (n - x); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= n - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
