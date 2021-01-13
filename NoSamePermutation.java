import java.util.*;

class NoSamePermutation {
	static Set<String> set;

	public static void findPermutation(int n, int[] arr, String out) {
		if (n == arr.length) {
			set.add(out);
			return;
		}
		for (int i = n; i < arr.length; i++) {
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;

			findPermutation(n + 1, arr, out + arr[n] + " ");

			temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}

	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		set = new TreeSet<>();
		findPermutation(0, arr, "");
		for (String str : set) {
			System.out.println(str);
		}
    }
}