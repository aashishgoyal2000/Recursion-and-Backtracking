class TowerOfHanoi {
	
	public static void ShiftTheTower(int n, char src, char helper, char dest) {
		if (n == 0) {
			return;
		}

		ShiftTheTower(n - 1, src, dest, helper);
		System.out.println("Shift Disk from " + src + " to " + dest);
		ShiftTheTower(n - 1, helper, src, dest);
	}

	public static void main(String[] args) {
		int n = 3;
		ShiftTheTower(n, 'A', 'B', 'C');
	}
}