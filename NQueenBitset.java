import java.util.BitSet;
class NQueenBitset {


	public static BitSet col, leftDiag, rightDiag;

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
			if (col.get(i) == false && leftDiag.get(index + i) == false && rightDiag.get(index - i + board.length - 1) == false) {
				
				col.flip(i);
				leftDiag.flip(index + i);
				rightDiag.flip(index - i + board.length - 1);
				
				board[index][i] = 1;
				
				findPossiblity(board, index + 1);
				
				board[index][i] = 0;
				
				col.flip(i);
				leftDiag.flip(index + i);
				rightDiag.flip(index - i + board.length - 1);
				
			}
		}
	}

	public static void main(String[] args) {
		int n = 4;
		int[][] board = new int[n][n];
		col = new BitSet(n);
		leftDiag = new BitSet(n);
		rightDiag = new BitSet(n);
		findPossiblity(board, 0);
	}
}