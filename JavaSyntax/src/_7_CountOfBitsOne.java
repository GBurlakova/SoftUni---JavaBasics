import java.util.Scanner;

public class _7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String numAsString = scanner.nextLine();
		if (ParseNumbers.tryParseInt(numAsString)) {
			int number = Integer.parseInt(numAsString);
			int bitsCount = Integer.bitCount(number);
			System.out.printf("Bits count in %d is %d.", number, bitsCount);
		} else {
			System.out.println("Please use correct number format.");
		}
	}
}
