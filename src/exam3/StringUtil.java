package exam3;

public class StringUtil {

	public static int occurencesOf(String text, char c) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			char d = text.charAt(i);
			if (d == c)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(occurencesOf("Foo", 'o'));
		System.out.println(occurencesOf("Boo", 'b'));
	}

}
