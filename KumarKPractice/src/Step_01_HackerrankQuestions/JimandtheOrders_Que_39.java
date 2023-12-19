package Step_01_HackerrankQuestions;

import java.util.Collection;
import java.util.Scanner;



public class JimandtheOrders_Que_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<n;i++) {
//			map.put(sc.nextInt(), sc.nextInt());	
//		}
		int [][] arr = new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

//        MultiValuedMap<Integer, Integer> additionCusto = new ArrayListValuedHashMap<>();

	
		int [] s = new int[n];
		for(int i=0;i<n;i++) {
			int sum =0;
			for(int j=0;j<2;j++) {
				if(j!=2-1) {
				sum = arr[i][j]+arr[i][j+1];
				}
			}
			s[i]=sum;
			additionCusto.put(sum, i+1);
			
		}
		Collection<Integer> values = additionCusto.values();
       
        for (Integer value : values) {
            System.out.print(value+" ");
        }

		
		

	}

}
