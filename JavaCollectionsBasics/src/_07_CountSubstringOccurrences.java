import java.util.Scanner;


public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pease enter text.");
		String input = scanner.nextLine();
		System.out.print("Please enter a word to find: ");
		String WordToFind = scanner.nextLine();
		StringBuilder result = new StringBuilder();
		int wordMathes = 0;
		for (int i = 0; i < input.length(); i++) {
			result.append(input.charAt(i));
			if (result
					.toString()
					.toLowerCase()
					.endsWith(WordToFind)) {
				wordMathes++;
			}
		}
		System.out.printf("%s appears %d times in the text.", WordToFind, wordMathes);
	}

}
