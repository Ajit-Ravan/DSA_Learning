package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CatsAndMouse_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(arr2));
		int x1 = arr1[0];
		int y1 = arr1[1];
		int z1 = arr1[2];
		int x2 = arr2[0];
		int y2 = arr2[1];
		int z2 = arr2[2];
		//for first array arr1
		int distanceAC1 = Math.abs(x1-z1);
		int distanceBC1 = Math.abs(y1-z1);
		//for second array arr2
		int distanceAC2 = Math.abs(x2-z2);
		int distanceBC2 = Math.abs(y2-z2);
		if(distanceAC1==distanceBC1) {
			System.out.println("Mouse C");
		}else if(distanceAC1<distanceBC1) {
			System.out.println("Cat A");
		}else {
			System.out.println("Cat B");
		}
		if(distanceAC2==distanceBC2) {
			System.out.println("Mouse C");
		}else if(distanceAC2<distanceBC2) {
			System.out.println("Cat A");
		}else {
			System.out.println("Cat B");
		}

	}
}
