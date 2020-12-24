class RecursiveBubleSort {
	
	public static void recursiveBubble(int[] a, int n) {
		
		if (n <= 1) {
			return;
		}
		int i = 0;
		while (i < n && i + 1 < n) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			i++;
		}
		recursiveBubble(a, n - 1);
	}


	public static void moreRecursive(int[] arr, int j, int n) {
		if (n <= 1) {
			return;
		}

		if (j == n - 1) {
			moreRecursive(arr, 0, n - 1);
			return;
		}

		// if (j < n && j + 1 < n) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			moreRecursive(arr, j + 1, n);
		// }

	}


	public static void main(String[] args) {
		int[] arr = {6, 3, 7, 8, 2};
		moreRecursive(arr, 0, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
		
	}	
}