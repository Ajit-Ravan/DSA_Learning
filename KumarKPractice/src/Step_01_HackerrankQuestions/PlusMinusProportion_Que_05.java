package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinusProportion_Que_05 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		double positive=0,negative=0,zero=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0) {
				positive++;
			}else if(arr[i]<0) {
				negative++;
			}else {
				zero++;
			}
		}
		

		
		System.out.println(positive/n);
		System.out.println(negative/n);
		System.out.println(zero/n);

	}

}
