package Step_01_HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] s = str.split(":");
//		System.out.println(Arrays.toString(s));
		// storing hour minute and sec in seperate variables
		String hr = "", min = "", secR;
		hr = s[0];
		min = s[1];
		secR = s[2];
		int conTime = 12;
//		seperating the secR 45PM to 45 PM
		String sec = secR.substring(0, 2);
//		System.out.println(sec);
		String ampmstr = secR.substring(2);
//		System.out.println(ampmstr);

		// converting hr and min in the integer
		int hrF = Integer.parseInt(hr);
		int hour = 0;
		if (ampmstr.equals("PM") && hrF<12) {
			hour = hrF + conTime;
			String finalHour = String.valueOf(hour);

			System.out.println(finalHour + ":" + min + ":" + sec);
		}else if(hrF == 12 && ampmstr.equals("AM")) {
			String zero= "00";
			System.out.println(zero + ":" + min + ":" + sec);
		}
		else {
			System.out.println(hr + ":" + min + ":" + sec);
		}

	}

}
