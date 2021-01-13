import java.util.*;
public class FunkyChessBoard {

	// (r-2,c-1), (r-2,c+1), (r-1,c-2), (r-1,c+2), 
	// (r+1,c-2), (r+1,c+2), (r+2,c-1), or (r+2,c+1)

	static int minUnvisited;
    public static void visitBoard(int[][] arr, int r, int c, int unvisited) {
	
    	if (unvisited == 0) {
    		minUnvisited = 0;
    		System.out.println(minUnvisited);
    		System.exit(0);
    	}

    	if (r - 2 >= 0 && c - 1 >= 0 && arr[r - 2][c - 1] == 1) {
    		arr[r - 2][c - 1] = 2;
    		visitBoard(arr, r - 2, c - 1, unvisited - 1);
    		arr[r - 2][c - 1] = 1;
    	}
    	if (r - 2 >= 0 && c + 1 < arr.length && arr[r - 2][c + 1] == 1) {
    		arr[r - 2][c + 1] = 2;
    		visitBoard(arr, r - 2, c + 1, unvisited - 1);
    		arr[r - 2][c + 1] = 1;
    	}
    	if (r - 1 >= 0 && c - 2 >= 0 && arr[r - 1][c - 2] == 1) {
    		arr[r - 1][c - 2] = 2;
    		visitBoard(arr, r - 1, c - 2, unvisited - 1);
    		arr[r - 1][c - 2] = 1;
    	}
    	if (r - 1 >= 0 && c + 2 < arr.length && arr[r - 1][c + 2] == 1) {
    		arr[r - 1][c + 2] = 2;
    		visitBoard(arr, r - 1, c + 2, unvisited - 1);
    		arr[r - 1][c + 2] = 1;
    	}
    	if (r + 1 < arr.length && c - 2 >= 0 && arr[r + 1][c - 2] == 1) {
    		arr[r + 1][c - 2] = 2;
    		visitBoard(arr, r + 1, c - 2, unvisited - 1);
    		arr[r + 1][c - 2] = 1;
    	}
    	if (r + 1 < arr.length && c + 2 < arr.length && arr[r + 1][c + 2] == 1) {
    		arr[r + 1][c + 2] = 2;
    		visitBoard(arr, r + 1, c + 2, unvisited - 1);
    		arr[r + 1][c + 2] = 1;
    	}
    	if (r + 2 < arr.length && c - 1 >= 0 && arr[r + 2][c - 1] == 1) {
    		arr[r + 2][c - 1] = 2;
    		visitBoard(arr, r + 2, c - 1, unvisited - 1);
    		arr[r + 2][c - 1] = 1;
    	}
    	if (r + 2 < arr.length && c + 1 < arr.length && arr[r + 2][c + 1] == 1) {
    		arr[r + 2][c + 1] = 2;
    		visitBoard(arr, r + 2, c + 1, unvisited - 1);
    		arr[r + 2][c + 1] = 1;
    	}

    	if (unvisited < minUnvisited) {
    		minUnvisited = unvisited;
    	}

	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int unvisited = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 1) {
					unvisited++;
				}
			}
		}
		arr[0][0] = 2;
		minUnvisited = unvisited;
		visitBoard(arr, 0, 0, unvisited - 1);
		System.out.println(minUnvisited);

    }
}