class MergeSort {

	public static void conquerer(int[] arr, int start, int mid, int end) {

		int[] tempArr = new int[end - start + 1];

		int k = 0, i = start, j = mid + 1;

		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				tempArr[k] =arr[i];
				i++;
			}
			else {
				tempArr[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			tempArr[k] = arr[i];
			i++;
			k++;
		}

		while (j <= end) {
			tempArr[k] = arr[j];
			j++;
			k++;
		}

		for (i = start; i <= end; i++) {
			arr[i] = tempArr[i - start];
		}



	}

	public static void divide(int[] arr, int i, int j) {

		if (i >= j) {
			return;
		}

		int mid = i + (j - i) / 2;

		divide(arr, i, mid);
		divide(arr, mid + 1, j);

		conquerer(arr, i, mid, j);
	}

	public static void main(String[] args) {
		int[] arr = {6, 3, 7, 8, 2};
		divide(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
	}
}