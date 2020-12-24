class QuickSort {
	
	public static int divide(int[] arr, int start, int end) {

		int pivot = arr[end];
		
		int i = start - 1;
		int j = start;

		for (; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;

		return i + 1;

	}

	public static void conquerer(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = divide(arr, start, end);

		conquerer(arr, start, mid - 1);
		conquerer(arr, mid + 1, end);
	}

	public static void main(String[] args) {
		int[] arr = {6, 3, 7, 8, 2};
		conquerer(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
	}
}