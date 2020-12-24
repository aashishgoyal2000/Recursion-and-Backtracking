import java.util.Scanner;

class GenerateStrings {

	public static void generateStrings(String in, int index, String out) {
		if (in.length() == index) {
			System.out.println(out);
			return;
		}

		int digit1 = Integer.parseInt(in.charAt(index) + "") - 1;
		
		if (digit1 != -1) {
			// one digit at a time
			char forDigit1 = (char)(digit1 + 'A');
			generateStrings(in, index + 1, out + forDigit1 + "");
		}

		if (index + 1 <= in.length() - 1) {
			int digit2 = Integer.parseInt(in.charAt(index) + "") * 10 + Integer.parseInt(in.charAt(index + 1) + "") - 1;

			if (digit2 < 26) {
				char forDigit2 = (char)(digit2 + 'A');	
				generateStrings(in, index + 2, out + forDigit2 + "");
			}
		}

		// two digits at a time
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in = sc.next();

		generateStrings(in, 0, "");
	}
}