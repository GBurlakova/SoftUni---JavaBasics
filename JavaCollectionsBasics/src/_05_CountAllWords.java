import java.util.Scanner;


public class _05_CountAllWords {

	public static void main(String[] args) {
		System.out.println("Please enter text.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] words = text.split("\\W+");
		int wordsCount = words.length;
		System.out.printf("Number of words: %d", wordsCount);
		
	}

}
