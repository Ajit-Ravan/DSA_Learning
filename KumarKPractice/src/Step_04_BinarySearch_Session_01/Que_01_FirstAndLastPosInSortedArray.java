package Step_04_BinarySearch_Session_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Que_01_FirstAndLastPosInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
		
		//BRUTEFORCE METHOD
//		int first = -1, last = -1;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == k) {
//				if (first == -1) {
//					first = i;
//				}
//				last = i;
//			}
//		}
//		int[] r = new int[] { first, last };
//		System.out.println(Arrays.toString(r));
		
		//USING BINARY SEARCH SOLUTION    TIME COMPLEXITY = O(log2(N))
		
		public static int first(int[] arr,int k){
			int i=0;
			int j=arr.length-1;
			int ans=-1;
			while(i<=j){
				int mid=(i+j)/2;
				if(arr[mid]==k){
					ans=mid;
					j=mid-1;
				}
				else if(arr[mid]>k){
					j=mid-1;
				}
				else{
					i=mid+1;
				}
			}
			return ans;
	 
		}
	 
		public static int last(int[] arr,int k){
			int i=0;
			int j=arr.length-1;
			int ans=-1;
			while(i<=j){
				int mid=(i+j)/2;
				if(arr[mid]==k){
					ans=mid;
					i=mid+1;
				}
				else if(arr[mid]>k){
					j=mid-1;
				}
				else{
					i=mid+1;
				}
			}
			return ans;
	 
		}
	}


