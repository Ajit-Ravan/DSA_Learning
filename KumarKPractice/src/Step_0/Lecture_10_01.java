package Step_0;

//N=5

//13579
//3579 1    part1 and part 2 seperated by space
//579 13
//79 135
//9 1357
public class Lecture_10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x = 2*n-1;
		
		//part 1
		for(int i=1;i<=x;i=i+2) {
			for(int j=i;j<=x;j=j+2) {
				System.out.print(j+" ");
			}
			
			//part 2
			for(int j=1;j<i;j=j+2) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
