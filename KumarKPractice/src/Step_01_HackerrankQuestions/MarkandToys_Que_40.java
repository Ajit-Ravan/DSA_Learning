package Step_01_HackerrankQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarkandToys_Que_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer>prices = new ArrayList<>();
		for( int i =0;i<n;i++) {
			prices.add(sc.nextInt());
		}
		Collections.sort(prices);
//		System.out.println(prices);
		int sum=0;
	    int count=0;
	    for(int i=0;i<prices.size();i++){
	        if(sum+prices.get(i)<=k){
	            sum+=prices.get(i);
	            count++;
	        }
	    }
	    System.out.println(count);
	}

}
