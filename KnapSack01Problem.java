class KnapSack01Problem {

	public static int findMaxProfit(int[] weight, int[] prices,int n,int capacity) {
		if (n == 0 || capacity == 0) {
			return 0;
		}

		if (weight[n - 1] <= capacity)
		return Math.max(prices[n - 1] + findMaxProfit(weight, prices, n - 1, capacity - weight[n - 1]), findMaxProfit(weight, prices, n - 1, capacity));

		return findMaxProfit(weight, prices, n - 1, capacity);
	}

	public static void main(String[] args) {
		int[] weight = {1, 2, 3, 5};
		int[] prices = {40, 20, 30, 100};
		int n = weight.length;
		int capacity = 7;
		System.out.println(findMaxProfit(weight, prices, n, capacity));
	}
}