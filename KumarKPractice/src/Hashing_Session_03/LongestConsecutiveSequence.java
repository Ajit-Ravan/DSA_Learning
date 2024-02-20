package Hashing_Session_03;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
//	Input: nums = [100,4,200,1,3,2]
//	Output: 4           <-- [1,2,3,4]

	public static void main(String[] args) {

		int[] nums = new int[] {5,6,2,15,3,1,4,12,10,9,8,11,16};
		Map<Integer, Boolean> hmap = new HashMap<>();
		for (int num : nums) {
			hmap.put(num, true);
		}
		int longestSequence = 0;
		Map<Integer, Integer> checkMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!hmap.get(nums[i]))
				continue;
			int num = nums[i];
			int flag = 0;
			while (hmap.containsKey(num)) {
				if (checkMap.containsKey(num)) {
					checkMap.put(nums[i], checkMap.get(num));
					flag = -1;
					break;
				}
				hmap.put(num, false);
				num--;
			}
			if (flag == 0)
				checkMap.put(nums[i], num + 1);
			int sequenceLength = nums[i] + 1 - checkMap.get(nums[i]);
			longestSequence = Math.max(longestSequence, sequenceLength);
		}
		System.out.println(longestSequence);
	}

}
