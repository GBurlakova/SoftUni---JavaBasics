import java.util.Scanner;

public class _06_CountSpecifiedWord {
	public static void  main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("PLease enter text.");
		String text = scanner.nextLine();
		System.out.print("Please enter a word to find: ");
		String matcher = scanner.nextLine();
		String[] words = text.split("\\W+");
		int matcherCount = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(matcher)) {
				matcherCount++;
			}
		}
		System.out.printf("The word %s appears %d times in the text.", matcher, matcherCount);
	}
}
