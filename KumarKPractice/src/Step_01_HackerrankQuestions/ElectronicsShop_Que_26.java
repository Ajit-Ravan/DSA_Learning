package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop_Que_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] keyboards = new int[n];
		int[] drives = new int[m];
		for (int i = 0; i < n; i++) {
			keyboards[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			drives[i] = sc.nextInt();
		}
		Arrays.sort(keyboards);
        Arrays.sort(drives);
        int maxP = -1;
        for (int i = 0; i < keyboards.length; i++) {
            int keyP =keyboards[i];
            for (int j = 0; j < drives.length; j++) {
                int driveP =drives[j];
                if (keyP+driveP > b) break;
                if ((keyP+driveP) <= b) {
                    maxP = Math.max(maxP,keyP+driveP);
                }
            }
		}
		System.out.println(maxP);

	}

}
