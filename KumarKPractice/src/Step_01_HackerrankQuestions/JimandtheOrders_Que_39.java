package Step_01_HackerrankQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JimandtheOrders_Que_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(sc.nextInt(), sc.nextInt());	
		}
		System.out.println(map);
		int sum = 0;
		Map<Integer, Integer> additionCusto = new HashMap<>();

	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k =entry.getKey();
            int value= entry.getValue();
            additionCusto.put((k+value), value);
			System.out.println(k+":"+value);
        }
	    System.out.println(additionCusto);
		

	}

}
