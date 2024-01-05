package Step_04_BinarySearch_Session_03;

import java.util.Scanner;
//Input
//15
//3 3 5 5 6 6 8 8 9 10 10 11 11 12 12 14 14
//Output - 9

public class Que_02_SingleNonDuplicateInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		// solution from kumarK video
//		int left =0,right=n-1;
//		while(left<right) {
//			int mid = (left+right)/2;
//			if((mid%2 == 1 && nums[mid]==nums[mid-1]) || (mid%2 ==0 && nums[mid]==nums[mid+1])) {
//				left = mid+1;
//			}else {
//				right = mid-1;
//			}
//		}
//		System.out.println(nums[left]);
		

		// FINAL SOLUTION WHICH COVERS ALL THE SCENARIOS ON LEETCODE
		
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (mid % 2 == 1) {
				mid--;
			}
			if (nums[mid] != nums[mid + 1]) {
				right = mid;
			} else {
				left = mid + 2;
			}
		}
		System.out.println(nums[left]);

	}

}
