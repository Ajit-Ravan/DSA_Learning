package Step_04_Session_01;

import java.util.Arrays;
import java.util.Scanner;

public class Que_02_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		 int [] res= new int[2];
         for(int i=0; i<n ; i++){
             for (int j =i+1; j<n; j++ ){
               if(arr[i] + arr[j] == target){
                      res[0]=i;
                      res[1]=j;
               }
             }
         }
      System.out.println(Arrays.toString(res));
	}

}
