import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter numbers separated by a single space.");
		String input = scanner.nextLine();
		String[] numbers = input.split(" ");
		System.out.print(numbers[0] + " ");
		ArrayList<String> longestSequence = new ArrayList<String>();
		ArrayList<String> currentLongestSequence = new ArrayList<String>();
		currentLongestSequence.add(numbers[0]);
		boolean isNewLine = false;
		for (int i = 1; i < numbers.length; i++) {
			if (Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i - 1])) {
				isNewLine = false;
				System.out.print(numbers[i] + " ");
				currentLongestSequence.add(numbers[i]);
			} else {
				System.out.println();
				System.out.print(numbers[i] + " ");
				isNewLine = true;
			}
			
			if (isNewLine || i == numbers.length - 1) {
				if (currentLongestSequence.size() > longestSequence.size()) {
					longestSequence.clear();
					longestSequence.addAll(currentLongestSequence);
				}
				currentLongestSequence.clear();
				currentLongestSequence.add(numbers[i]);
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (String string : longestSequence) {
			System.out.print(string + " ");
		}
	}

}
