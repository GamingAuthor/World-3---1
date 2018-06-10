package IntroToJUnitTest;

public class MoreAndMoreMethods{
	public boolean isPrime(int i) {
		for (int n = 4; n < i; n++) {
			if (i % n == 0) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	public Object multiply(int i, int j) {
		String s;
		return s = i + " x " + j + " = " + i * j;
	}
}
