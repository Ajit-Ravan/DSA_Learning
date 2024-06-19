package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int space = 0;
//		first half
		for (int i = 0; i < n; i++) {
//			stars
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
//			spaces
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
//			stars
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			space += 2;
			System.out.println();
		}

		// second half
		space = 8;
		for (int i = 1; i <= n; i++) {
//			stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
//			spaces
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
//			stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			space -= 2;
			System.out.println();

		}
	}

}
