package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MinOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,1,4,3,1};
		int n = arr.length;
		
		Map<Integer,Integer> umap = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(umap.containsKey(arr[i])) {
				umap.put(arr[i], umap.get(arr[i])+1);
			}else {
				umap.put(arr[i],i);
			}
		}
		
		int maxFreqOfElement = 0;
		for(Map.Entry<Integer,Integer> entry : umap.entrySet()) {
			int freq = entry.getValue();
			if(freq>maxFreqOfElement) {
				maxFreqOfElement = freq;
			}
			
		}
		System.out.println("The minimum operations required to make array equal is : "+(n-maxFreqOfElement));

	}

}
