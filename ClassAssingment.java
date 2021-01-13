import java.util.*;
public class ClassAssingment {

	public static int classAssingment(int n, int[][] arr) {
		if (n == 1) {
			return arr[1][0] + arr[1][1];
		}
		if (arr[n][0] != 0) {
			return arr[n][0] + arr[n][1];
		}
		classAssingment(n - 1, arr);
		arr[n][0] = arr[n - 1][0] + arr[n - 1][1];
		arr[n][1] = arr[n - 1][0];
		return arr[n][0] + arr[n][1];
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n + 1][2];
			arr[1][1] = 1;
			arr[1][0] = 1;
			System.out.println("#" + i + " : " + classAssingment(n, arr));
			// t--;
		}

    }
}