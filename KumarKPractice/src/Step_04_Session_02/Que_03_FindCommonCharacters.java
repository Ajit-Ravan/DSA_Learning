package Step_04_Session_02;

import java.util.ArrayList;
import java.util.List;

public class Que_03_FindCommonCharacters {

	public List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<>();

		int[] minFreq = new int[26];
		for (char c : A[0].toCharArray()) {
			minFreq[c - 'a']++;
		}

		for (int i = 1; i < A.length; i++) {
			int[] freq = new int[26];
			for (char c : A[i].toCharArray()) {
				freq[c - 'a']++;
			}

			for (int j = 0; j < 26; j++) {
				minFreq[j] = Math.min(minFreq[j], freq[j]);
			}
		}

		for (int i = 0; i < 26; i++) {
			while (minFreq[i] > 0) {
				result.add(String.valueOf((char) ('a' + i)));
				minFreq[i]--;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Que_03_FindCommonCharacters solution = new Que_03_FindCommonCharacters();
		String[] words = { "bella", "label", "roller" };
		List<String> commonChars = solution.commonChars(words);
		System.out.println("Common characters: " + commonChars);
	}

}
