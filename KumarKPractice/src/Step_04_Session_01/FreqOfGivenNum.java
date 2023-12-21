package Step_04_Session_01;

import java.util.Scanner;

public class FreqOfGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IF ARRAY IS NOT SORTED 
//		Time Complexity: O(n) 
//		Auxiliary Space: O(1)
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3};
		System.out.println("Enter no. ");
		int k = sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		System.out.println(count);
		
		
		//FOR SORTED ARRAY
		//for a sorted array, we can optimize it to work in O(Log n) using binary search
		
		
	}

}
