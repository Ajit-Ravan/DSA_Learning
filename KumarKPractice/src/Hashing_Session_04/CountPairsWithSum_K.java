package Hashing_Session_04;

import java.util.HashMap;
//
//Input: nums = [1,2,2,1], k = 1
//Output: 4

public class CountPairsWithSum_K {
	 public static int countKDifference(int[] nums, int k) {
	        HashMap<Integer, Integer> f = new HashMap<Integer, Integer>();
	        int res = 0;
	        for (int i : nums) {
	        	System.out.println(res +" "+f.getOrDefault(i-k, 0)+" : "+f.getOrDefault(i+k, 0));
	            res += f.getOrDefault(i - k, 0) + f.getOrDefault(i + k, 0);
	            
	            f.put(i, f.getOrDefault(i, 0) + 1);
	        }
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int [] {1,2,2,1};
		int k=1;
		int ans = countKDifference(nums,k);
		System.out.println(ans);

	}

}
