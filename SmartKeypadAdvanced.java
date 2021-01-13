import java.util.*;
public class SmartKeypadAdvanced {
	static String searchIn [] = {
            "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
    };
	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
	static ArrayList<String> al;
	public static void smartness(int n, String out, char[] number) {
		if (n == number.length) {
			al.add(out);
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

		al = new ArrayList<String>();

		smartness(0, "", number);
		
		for(String str : searchIn) {
			for (String temp : al) {
				if (str.contains(temp)) {
					System.out.println(str);
					break;
				}
			}
		}

    }
}