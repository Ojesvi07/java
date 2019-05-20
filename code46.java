
//to remove all special characters from a given string 
import java.util.*;

class code46 {
	public static void main(String arg[]) {
		Scanner ob = new Scanner(System.in);

		System.out.println("Enter the string:");

		StringBuffer s1 = new StringBuffer(ob.nextLine());

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				count++;
			}

			if (s1.charAt(i) >= 33 && s1.charAt(i) <= 64) {

				if (s1.charAt(i - 1) != ' ') {
					s1.replace(i, i + 1, " ");
				} else {
					s1.deleteCharAt(i);
					i--;

				}

			}

		}

		for (int i = 0; i < s1.length(); i++) {
			if (i + 1 < s1.length()) {

				if (s1.charAt(i) == ' ' && s1.charAt(i + 1) == ' ') {
					s1.deleteCharAt(i + 1);
					i--;

				}
			}
		}

		String s = s1.toString();
		String ss = s.trim();

		if (count > 0) {

			String m[] = ss.split(" ");
			for (int i = 0; i < m.length; i++)

			{

				System.out.println(m[i]);
			}
		}

		else {
			System.out.print("\nNo word present in string");

		}
	}
}
