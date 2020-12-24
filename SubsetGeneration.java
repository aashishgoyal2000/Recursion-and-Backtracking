class SubsetGeneration {

	// Given a string containing n characters find out the all subsets of that strings.
	public static void generateSubsequence(String in, String out, int i) { //, int j) {
		if (i == in.length()) {
			System.out.println(out);
			return;
		}

		// exclude the char
		generateSubsequence(in, out, i + 1);

		// include the char
		out += in.charAt(i) + "";
		generateSubsequence(in, out, i + 1);
	}


	public static void main(String[] args) {
		generateSubsequence("abc", "", 0);
	}
}