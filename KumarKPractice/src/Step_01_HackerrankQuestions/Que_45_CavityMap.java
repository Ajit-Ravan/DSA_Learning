package Step_01_HackerrankQuestions;

import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que_45_CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> grid = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			grid.add(sc.next());
		}
		List<String> ans = new ArrayList<>();
		for (int i = 0; i < grid.size(); i++) {
			if (i == 0 || i == grid.size() - 1) {
				ans.add(grid.get(i));
			} else {
				String s = grid.get(i);
				String str = "";
				for (int j = 0; j < grid.size(); j++) {
					if (j == 0 || j == grid.size() - 1) {
						str = str + s.charAt(j);
//						System.out.println(str);
					} else {
						int topEle = grid.get(i - 1).charAt(j) - '0';
						int bottomEle = grid.get(i + 1).charAt(j) - '0';
						int leftEle = s.charAt(j - 1) - '0';
						int rightEle = s.charAt(j + 1) - '0';
						int ele = s.charAt(j) - '0';
						if (ele > topEle && ele > bottomEle && ele > leftEle && ele > rightEle) {
							str = str + "X";
						} else {
							str = str + s.charAt(j);
						}
					}
				}
				ans.add(str);
			}
		}
		for (String m : ans) {
			System.out.println(m);
		}

	}

}
