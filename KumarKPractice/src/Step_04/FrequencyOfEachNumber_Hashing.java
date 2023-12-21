package Step_04;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfEachNumber_Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BRUTEFORCE SOLUTION
//		int[] a = {1, 3, 3, 4, 1, 4, 4, 4, 4};
//        int n = a.length;
// 
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Queries  :");
//        int q = scanner.nextInt();
// 
//        for (int l = 0; l < q; l++) {
//        	System.out.println("Enter no. and get freq: ");
//            int qry = scanner.nextInt();
//            int frq = 0;
// 
//            for (int j = 0; j < n; j++) {
//                if (a[j] == qry) {
//                    frq++;
//                }
//            }
// 
//            System.out.print(qry + " : number occurs :");
//            System.out.print(frq + " ");
//            System.out.println("-> times in the array given");
//        }

		// USING HASHING METHOD
		int[] arr = { 1, 3, 3, 4, 1, 4, 4, 4, 4 };
		int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x = arr[i];
			b[x] = b[x] + 1;
		}
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				System.out.println("Number : " + i + "  Count :" + b[i]);
			}
		}
		// the indexes in above array b means the actual numbers in the array and value
		// means the counts
		// like , i =0 so count in arr = 0, i = 1 count in arr = 2 , i =3 count in arr =
		// 2 and so on,

	}

}
