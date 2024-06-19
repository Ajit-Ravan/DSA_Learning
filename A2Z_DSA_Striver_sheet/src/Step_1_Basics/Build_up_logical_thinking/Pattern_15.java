package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

}
