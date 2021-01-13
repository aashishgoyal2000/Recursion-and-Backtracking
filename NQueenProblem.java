class NQueenProblem {

	public static boolean isSafe(int[][] board, int iQueen, int jQueen) {
		// straight up
		for (int i = iQueen; i >= 0; i--) {
			if (board[i][jQueen] == 1) {
				return false;
			}
		}

		// right diagonal
		int x = iQueen;
		int y = jQueen;
		while (x >= 0 && y >= 0) {
			if (board[x][y] == 1) {
				return false;
			}
			x--;
			y--;
		}

		// left diagonal
		x = iQueen;
		y = jQueen;
		while (x >= 0 && y < board.length) {
			if (board[x][y] == 1) {
				return false;
			}
			x--;
			y++;
		}

		return true;
	}
	
	public static void findPossiblity(int[][] board, int index) {
		
		if (index == board.length) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (board[i][j] == 1) {
						System.out.print("Q");
					}
					else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (isSafe(board, index, i)) {
				board[index][i] = 1;

				findPossiblity(board, index + 1);

				board[index][i] = 0;
			}
		}



	}

	public static void main(String[] args) {
		int n = 6;
		int[][] board = new int[n][n];
		findPossiblity(board, 0);
	}
}