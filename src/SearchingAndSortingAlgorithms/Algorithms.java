package SearchingAndSortingAlgorithms;

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

	public static List<String> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			Double temp = 0.0;
			if (results.get(i) > results.get(i-1)) {
				temp = results.get(i - 1);
				results.set(i, temp);
				temp = results.get(i);
			}
		}
	}

	// Add other methods here
}