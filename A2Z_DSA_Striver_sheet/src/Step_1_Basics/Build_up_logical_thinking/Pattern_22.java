package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				int top = i;
				int left = j;
				int right = (2 * n - 2) - j;
				int down = (2 * n - 2) - i;
				System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
			}
			System.out.println();
		}

	}

}
