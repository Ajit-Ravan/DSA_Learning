package Step_1_Basics.Build_up_logical_thinking;

public class Pattern_12 {
//	Numbers space NUmbers
//	 1        6     1
//	 2        4     2
//	 3        2     3  
//	 4        0     4        so we created formula : space = 2*(n-1) , where n =5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int space = 2 * (n - 1);
		for (int i = 1; i <= n; i++) {
//			Numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
//			Space
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

//			Numbers
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
			space -= 2;
		}

	}

}
