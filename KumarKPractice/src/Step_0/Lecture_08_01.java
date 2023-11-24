package Step_0;

//N=3

//1=1
//1+2=3
//1+2+3=6
public class Lecture_08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		for (int i = 0; i < n; i++) {
			int sum = 0;

			// left side part
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
				if (j < i + 1) {
					System.out.print("+");
				}
				sum += j;
			}

			// from = to right
			System.out.print("=");
			System.out.print(sum);
			System.out.println();

		}

	}

}
