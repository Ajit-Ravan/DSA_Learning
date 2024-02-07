package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetHashMap {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(2);
		s.add(5);
		s.add(5);

		if (s.contains(2))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		System.out.println("----------------------------------");
		
		Map<Integer, Integer> m= new HashMap<>();
		m.put(2, 3);
		m.put(5, 2);
		if(m.containsKey(2))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		//checking frequncy of 5 
		System.out.println("Frequency of 5 is :"+m.get(5));
		
	}

}
