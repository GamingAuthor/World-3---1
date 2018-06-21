package SearchingAndSortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int crack = 0;
		for (int n = 0; n < eggs.size(); n++) {
			if (eggs.get(n) == "cracked") {
				crack = n;
				n = eggs.size();
			}
		}
		return crack;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int n = 0; n < oysters.size(); n++) {
			if (oysters.get(n) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for (int n = 0; n < peeps.size(); n += 1) {
			if (peeps.get(n) > tallest) {
				tallest = peeps.get(n);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String biggest = words.get(0);
		for (int n = 0; n < words.size(); n += 1) {
			if (words.get(n).length() > biggest.length()) {
				biggest = words.get(n);
			}
		}
		return biggest;
	}

	public static boolean containsSOS(List<String> message1) {
		if (message1.toString().contains("... --- ...")) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Double> sortScores(List<Double> results) {
		Double temp = 0.0;
		System.out.println(results);
		for (int i = 0; i < results.size() - 1; i++) {
			for (int n = i + 1; n < results.size(); n++) {
				if (results.get(i) > results.get(n)) {
					temp = results.get(i);
					results.set(i, results.get(n));
					results.set(n, temp);
				}
			}
		}
		return results;

	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String temp = "";
		for (int i = 0; i < unsortedSequences.size() - 1; i++) {
			for (int n = i + 1; n < unsortedSequences.size(); n++) {
				if (unsortedSequences.get(i).length() > unsortedSequences.get(n).length()) {
					temp = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(n));
					unsortedSequences.set(n, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		String temp = "";
		int order = 0;
		for(int i = 0; i<words.size()-1;i++) {
			for(int n = i + 1; n<words.size();n++) {
				order = words.get(i).compareTo(words.get(n));
				if(order>0) {
					temp = words.get(i);
					words.set(i, words.get(n));
					words.set(n, temp);
				}
			}
		}	
		System.out.println(words);
	return words;
}

// Add other methods here
}