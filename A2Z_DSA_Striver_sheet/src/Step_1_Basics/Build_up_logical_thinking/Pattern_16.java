package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int asciiValue = (int) 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) asciiValue);
			}
			System.out.println();
			asciiValue += 1;
		}
	}

}
