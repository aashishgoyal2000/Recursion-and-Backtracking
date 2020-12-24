class TilingProblem {

	// tiles 1 x 4 and 4 x 1
	public static int numberOfTiles(int n) {
		if (n == 4) {
			return 2;
		}
		else if (n < 4) {
			return 1;
		}
		return numberOfTiles(n - 1) + numberOfTiles(n - 4);
	}


	public static void main(String[] args) {
		int n = 10;
		System.out.println(numberOfTiles(n));
	}
}