package Hashing_Session_02;

import java.util.HashMap;

/**
 Que. Max distance between same element
 */
public class MaxDistance_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,1,2,2,2,1};
		HashMap<Integer,Integer>hmap = new HashMap<>();
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				ans=Math.max(ans, i-hmap.get(arr[i]));
			}else {
				hmap.put(arr[i],i);
			}
		}
		System.out.println(ans);
	}

}
