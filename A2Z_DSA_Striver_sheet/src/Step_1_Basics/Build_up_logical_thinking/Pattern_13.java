package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int count = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
