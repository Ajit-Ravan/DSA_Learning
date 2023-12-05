package Step_01_HackerrankQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cutthesticks_Que_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ans.add(sc.nextInt());
		}
		int totalSticks = ans.size();
		int removedSticks = 0;
		Collections.sort(ans);
		List<Integer> stickPieces = new ArrayList<>();
		while (removedSticks != totalSticks) {
			int val = ans.get(removedSticks);
			stickPieces.add(totalSticks - removedSticks);
			for (int i = removedSticks; i < ans.size(); i++) {
				int num = ans.get(i) - val;
				ans.set(i, num);
				if (ans.get(i) == 0) removedSticks++;
			}

		}
		for(int a:stickPieces) {
			System.out.println(a);
		}

	}

}
