import java.util.*;
public class SumItUp {
	static class ListComparator<T extends Comparable<T>> implements Comparator<ArrayList<T>> {

		@Override
		public int compare(ArrayList<T> o1, ArrayList<T> o2) {
			for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
			int c = o1.get(i).compareTo(o2.get(i));
			if (c != 0) {
				return c;
			}
			}
			return Integer.compare(o1.size(), o2.size());
		}

	}
	static ArrayList<ArrayList<Integer>> output;
	static void sumItUp(int[] arr, int n, int target, ArrayList<Integer> al, int sum) {
		if (target < sum) return;
		if (target == sum) {
			if (output.contains(new ArrayList<>(al))) {
				return;
			}
			output.add(new ArrayList<>(al));
			return;
		}
		if (n == arr.length) return;
		sumItUp(arr, n + 1, target, al, sum);
		if (arr[n] + sum <= target) {
			al.add(arr[n]);
			sumItUp(arr, n + 1, target, al, sum + arr[n]);
			al.remove(al.indexOf(arr[n]));
		}
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int target = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		output = new ArrayList<>();
		sumItUp(arr, 0, target, al, 0);
		Collections.sort(output, new ListComparator<>());
		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < output.get(i).size(); j++) {
				System.out.print(output.get(i).get(j) + " ");
			}
			System.out.println();
		}
    }
}