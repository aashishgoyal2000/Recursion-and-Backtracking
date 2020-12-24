import java.util.Scanner;
class PhoneKeypadProblem {

	static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "wxyz"};
	
	public static void possibleStrings(String in, int index, String out) {

		if (in.length() == index) {
			System.out.println(out);
			return;
		}

		int digit = Integer.parseInt(in.charAt(index) + "");

		if (digit == 0 || digit == 1) {
			possibleStrings(in, index + 1, out);
		}

		for (int i = 0; i < keypad[digit].length(); i++) {
			possibleStrings(in, index + 1, out + keypad[digit].charAt(i));
		}

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String in = sc.next();
		possibleStrings(in, 0, "");
	}
}