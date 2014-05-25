import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter count of numbers: ");
			int numbersCount = scanner.nextInt();
			scanner.nextLine();
			int[] numbers = new int[numbersCount];
			
			for (int i = 0; i < numbersCount; i++) {
				numbers[i] = scanner.nextInt();
				scanner.nextLine();
			}
			Arrays.sort(numbers);
			for (int number : numbers) {
				System.out.print(number + " ");
			}
		} catch (InputMismatchException e) {
			System.err.println("Plese use correct input format.");
		}
		
	}

}
