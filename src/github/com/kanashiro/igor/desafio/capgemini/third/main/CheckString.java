package github.com.kanashiro.igor.desafio.capgemini.third.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckString {

	/**
	 * This method takes all possible substrings from the string input, 
	 * and then checks to see which pairs of substrings form an anagram
	 * 
	 * @param word
	 * @return
	 */
	public int makeTest(String word) {

		String stringWithouSpacesAndLowerCase = word.replace(" ", "").toLowerCase();
		
		List<String> subStrings = new ArrayList<String>();
		List<String> anagrams = new ArrayList<String>();
		char[] nextSubString = null;
		char[] currentSubString = null;
		int count = 0;

		for (int i = 0; i <= stringWithouSpacesAndLowerCase.length(); i++) {

			for (int y = i + 1; y <= stringWithouSpacesAndLowerCase.length(); y++) {

				subStrings.add(stringWithouSpacesAndLowerCase.substring(i, y));
			}
		}

		for (int i = 0; i < subStrings.size(); i++) {

			for (int y = i + 1; y < subStrings.size(); y++) {

				if (subStrings.get(i).length() == subStrings.get(y).length()) {

					nextSubString = subStrings.get(y).toCharArray();
					Arrays.sort(nextSubString);
					currentSubString = subStrings.get(i).toCharArray();
					Arrays.sort(currentSubString);

					if (Arrays.equals(nextSubString, currentSubString)) {
						count++;
						anagrams.add(subStrings.get(i));
						anagrams.add(subStrings.get(y));
					}
				}
			}
		}

		return count;
	}

}
