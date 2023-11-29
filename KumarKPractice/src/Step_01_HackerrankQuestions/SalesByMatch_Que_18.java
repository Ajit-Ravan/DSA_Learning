package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class SalesByMatch_Que_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] colors = new int[n];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = sc.nextInt();
		}
		int [] visit = new int[colors.length];
		int visited = -1;
		int count =0;
		for(int i=0;i<colors.length;i++) {
			for(int j=0;j<colors.length;j++) {
				if(i!=j&& colors[i]==colors[j]&&visit[i]!=visited && visit[j]!=visited) {
					count++;
					visit[i]=visited;
					visit[j] = visited;
					System.out.println(colors[i]+" "+colors[j]);
				}
			}
		}
		System.out.println(count);
		

	}

}
