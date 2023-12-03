package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class HurdleRace_Que24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int [] heights = new int[n];
		for(int i=0;i<n;i++) {
			heights[i]=sc.nextInt();
		}
		int mx=0;
		for(int i=0;i<heights.length;i++){
			mx=Math.max(mx,heights[i]);
		}
 
		if(mx>k){
			System.out.println(mx-k);
		}else{
			System.out.println(0);;
		}

	}

}
