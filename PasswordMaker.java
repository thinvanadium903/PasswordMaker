public final class PasswordMaker {
	
	private static final char[] key = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
			80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105,
			106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
			48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 33, 35, 36, 37, 38, 63, 64};
	
	private static String buildPassword(int a, int b) {
		String payload = "";
		char c = ' ';
		for (int packets = 0; packets < b; packets++) {
			for (int digits = 0; digits < a; digits++, payload += c) {
				int index = (int) (Math.random() * key.length);
				c = key[index];
			}
			if (packets < b - 1) {
				payload += '-';
			}
		}
		return payload;
	}
		
	public static void main(String[] args) {
		System.out.print(buildPassword(6, 3));
		// sample: wcTD$B-cesRH6-q3RL%H

		System.out.print(buildPassword(5, 2));
		// sample: WR3bC-XwM?N
		
	}
		
}
