import java.util.*;
public class FriendsProblem {

	public static long friendsProblem(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return friendsProblem(n - 1) + (n - 1) * friendsProblem(n -2);
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			System.out.println(friendsProblem(n));
			t--;
		}

    }
}