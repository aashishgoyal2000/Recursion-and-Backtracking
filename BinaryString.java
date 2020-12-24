class BinaryString {

	// count binary string of length n, which have no consecutive ones ?
	public static int possibleBinaryStrings(int n) {
		if (n == 2) {
			return 3;
		}
		if (n == 1) {
			return 2;
		}
		if ( n < 1) {
			return 0;
		}
		return possibleBinaryStrings(n - 1) + possibleBinaryStrings(n - 2);
	}


	public static void main(String[] args) {
		
		int n = 3;
		System.out.println(possibleBinaryStrings(n));

	}
}