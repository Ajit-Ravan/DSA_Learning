package Step_01_HackerrankQuestions;
//4 2
//0 -1 2 1
//NO

import java.util.Scanner;

public class AngryProfessor_Que_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr=new int[n];
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<=0) {
				count++;
			}
		}
		if(count<k) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
