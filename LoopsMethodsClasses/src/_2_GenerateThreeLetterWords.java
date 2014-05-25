import java.util.Scanner;


public class _2_GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLetters = scanner.nextLine();
		char[] inputLettArr = inputLetters.toCharArray();
		for (int firstPos = 0; firstPos < inputLetters.length(); firstPos++) {
			for (int secondPos = 0; secondPos < inputLetters.length(); secondPos++) {
				for (int thirdPos = 0; thirdPos < inputLetters.length(); thirdPos++) {
					System.out.print(inputLettArr[firstPos] + "" + 
										inputLettArr[secondPos] + "" + inputLettArr[thirdPos] + " ");
				}
			}
		}

	}

}
