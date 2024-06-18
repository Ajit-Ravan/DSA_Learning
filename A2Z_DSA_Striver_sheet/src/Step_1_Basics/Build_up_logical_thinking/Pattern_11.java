package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}

	}

}
