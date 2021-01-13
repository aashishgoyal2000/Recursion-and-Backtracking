import java.util.Scanner;

class Permutation {

	public static void permute(char[] in, int i) {

		if (i == in.length) {
			System.out.println(in);
			return;
		}

		for (int j = i; j < in.length; j++) {
			
			char temp = in[i];
			in[i] = in[j];
			in[j] = temp;
			
			permute(in, i + 1);

			temp = in[i];
			in[i] = in[j];
			in[j] = temp;
		
		}

	}


	public static void main(String[] args) {
		String in;
		Scanner sc = new Scanner (System.in);
		in = sc.next();

		permute(in.toCharArray(), 0);
	}
}