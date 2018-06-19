package IntroToJUnitTest;

public class MoreAndMoreMethods {
	public boolean isPrime(int i) {
		boolean answer = false;
		for (int n = 2; n < i; n++) {
			if (i % n == 0) {
				return false;
			} else {
				answer = true;
			}
		}
		return answer;
	}

	public Object multiply(int i, int j) {
		String s;
		return s = i + " x " + j + " = " + i * j;
	}

	public boolean isSquare(int i) {
		boolean answer = false;
		for (int n = 0; n <= i; n++) {
			if (n * n == i) {
				return true;
			} else {
				answer = false;
			}
		}
		return answer;
	}

	public boolean isCube(int i) {
		boolean answer = false;
		for (int n = 0; n <= i; n++) {
			if (n * n * n == i) {
				return true;
			} else {
				answer = false;
			}

		}
		return answer;
	}
}
