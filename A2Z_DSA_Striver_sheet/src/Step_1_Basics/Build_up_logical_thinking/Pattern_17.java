package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) {
//			space
			for (int j = n - i - 1; j > 0; j--) {
				System.out.print(" ");
			}

//			chars
			char ch = 'A';
			int breakdown = (2 * i + 1) / 2;
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print(ch);
				if (j <= breakdown)
					ch++;
				else
					ch--;

			}

//			space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
