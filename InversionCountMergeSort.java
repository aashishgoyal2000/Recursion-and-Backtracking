class InversionCountMergeSort {

	public static int conquerer(int[] arr, int start, int mid, int end) {
		int[] tempArr = new int[end - start + 1];

		int i = start, j = mid + 1, k = 0;

		int cnt = 0;

		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				tempArr[k] = arr[i];
				i++;
			}
			else {
				tempArr[k] = arr[j];
				j++;
				cnt += mid - i + 1;
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

		return cnt;
	}

	public static int divide (int[] arr, int start, int end) {
		if (start >= end) {
			return 0;
		}

		int mid = start + (end - start) / 2;

		return divide(arr, start, mid) + divide(arr, mid + 1, end) + conquerer(arr, start, mid, end);
	}

	public static void main(String[] args) {
		int[] arr = {6, 3, 7, 8, 2};
		int out = divide(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}

		System.out.println("\n" + out + "\n");

	}
}