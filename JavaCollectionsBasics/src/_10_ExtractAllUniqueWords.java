import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter text.");
		String input = scanner.nextLine();
		input = input.toLowerCase();
		TreeSet<String> uniqueWordSet = new TreeSet<>(Arrays.asList(input.split("\\W+")));
		for (String word : uniqueWordSet) {
			System.out.print(word.toLowerCase() + " ");
		}

	}

}
