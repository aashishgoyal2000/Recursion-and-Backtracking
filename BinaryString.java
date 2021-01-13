import java.util.*;
public class BinaryString {

	public static long countBinaryStrings(int n) {
		long arr[][] = new long[n + 1][2];
		arr[1][0] = 1;
		arr[1][1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i][0] = arr[i - 1][1] + arr[i - 1][0];
			arr[i][1] = arr[i - 1][1];
		}
		return arr[n][0] + arr[n][1];
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			System.out.println(countBinaryStrings(n));
			t--;
		}
    }
}