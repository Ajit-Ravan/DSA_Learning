package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
