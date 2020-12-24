class GenerateBalancedBrackets {
	
	// Generate balanced brackets using n pairs of round brackets.

	public static void generateBrackets(String out, int n, int open, int close) {

		if (out.length() == n * 2) {
			System.out.println(out);
			return;
		}

		if (open < n) {
			generateBrackets(out + '(', n, open + 1, close);
		}

		if (close < open) {
			generateBrackets(out + ')', n, open, close + 1);
		}

	}

	public static void main(String[] args) {
		generateBrackets("", 5, 0, 0);
		// System.out.println(generateBrackets(n, 0, 0));

	}
}