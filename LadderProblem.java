class LadderProblem {

	public static int climbLadder(int ladderSize, int stepSize) {

		if (ladderSize == 0) {
			return 1;
		}
		if (ladderSize < 0) {
			return 0;
		}

		int ans = 0;

		for (int i = 1; i <= stepSize; i++) {
			ans += climbLadder(ladderSize - i, stepSize);
		}	
		return ans;
	}

	public static void main(String[] args) {

		// Find number of ways in which we can climb the ladder provided maximum step size

		int maxStepSize = 3, ladderLength = 4;
		System.out.println(climbLadder(ladderLength, maxStepSize));
	}
}