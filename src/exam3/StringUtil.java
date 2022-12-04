package exam3;

public class StringUtil {

	public static int occurencesOf(String text, char c) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(occurencesOf("Foo", 'o'));
		System.out.println(occurencesOf("Boo", 'b'));
	}

}
