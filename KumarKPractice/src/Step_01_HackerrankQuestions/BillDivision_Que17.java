package Step_01_HackerrankQuestions;

import java.util.Scanner;

public class BillDivision_Que17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int annaNotEaten = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int dividedCost = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[annaNotEaten]) {
				sum += arr[i];
//				System.out.println(sum);
			}

		}
		int res = sum / 2;
        if (dividedCost > res) {
           System.out.println(dividedCost - res);
       }else{
           System.out.println("Bon Appetit");
       }

	}

}
