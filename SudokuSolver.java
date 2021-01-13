class SudokuSolver {

	public static boolean canPlace(int[][] mat, int i, int j, int number) {
		// row and column
		for (int x = 0; x < mat.length; x++) {
			if (mat[x][j] == number || mat[i][x] ==number) {
				return false;
			}
		}

		// sub matrix

		int rn = (int)Math.sqrt(mat.length);
		int sx = (i / rn) * rn;
		int sy = (j / rn) * rn;	

		for (int x = sx; x < sx + rn; x++) {
			for (int y = sy; y < sy + rn; y++) {
				if (mat[x][y] == number) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean solveSudoku(int[][] mat, int i, int j) {
		// base case
		if (i == mat.length) {
			for (int iRow = 0; iRow < 9; iRow++) {
				for (int jCol = 0; jCol < 9; jCol++) {
					System.out.print(mat[iRow][jCol]);
				}
				System.out.println();
			}
			return true;
		}
		if (j == mat.length) {
			return solveSudoku(mat, i + 1, 0);
		}
		if (mat[i][j] != 0) {
			return solveSudoku(mat, i, j + 1);
		}

		// rec case
		for (int number = 1; number <= mat.length; number++) {
			if (canPlace(mat, i, j, number)) {
				mat[i][j] = number;

				if (solveSudoku(mat, i, j + 1)) {
					return true;
				}
			}
		}

		mat[i][j] = 0;
		return false;

	}

	public static void main(String[] args) {
		int mat[][] = 
					{
						{5, 3, 0, 0, 7, 0, 0, 0, 0},
						{6, 0, 0, 1, 9, 5, 0, 0, 0},
						{0, 9, 8, 0, 0, 0, 0, 6, 0},
						{8, 0, 0, 0, 6, 0, 0, 0, 3}, 
						{4, 0, 0, 8, 0, 3, 0, 0, 1}, 
						{7, 0, 0, 0, 2, 0, 0, 0, 6}, 
						{0, 6, 0, 0, 0, 0, 2, 8, 0},
						{0, 0, 0, 4, 1, 9, 0, 0, 5}, 
						{0, 0, 0, 0, 8, 0, 0, 7, 9} 
					};
		// System.out.println(mat.length);
					solveSudoku(mat, 0, 0);

		// return 0;
	}
}