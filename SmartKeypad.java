import java.util.*;
public class SmartKeypad {
    
	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

	public static void smartness(int n, String out, char[] number) {
		if (n == number.length) {
			System.out.println(out);
			return;
		}

		int button = Integer.valueOf(number[n] + "");
		String keypad = table[button];
		
		for (int i = 0; i < keypad.length(); i++) {
			smartness(n + 1, out + keypad.charAt(i), number);
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char number[] = n.toCharArray();
		smartness(0, "", number);
		

    }
}