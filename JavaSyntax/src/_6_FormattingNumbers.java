import java.text.DecimalFormat;
import java.util.Scanner;

public class _6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String intNumString = scanner.nextLine();
		System.out.print("Enter a floating-point number: ");
		String firstFloatNumString = scanner.nextLine();
		System.out.print("Enter a floateing-point number: ");
		String secondFloatNumString = scanner.nextLine();
		System.out.println(PrintString.newStringFromChars(50, '-'));
		if (ParseNumbers.tryParseInt(intNumString) && 
			ParseNumbers.tryParseDouble(firstFloatNumString) &&
			ParseNumbers.tryParseDouble(secondFloatNumString)) {
			int intNum = Integer.parseInt(intNumString);
			double firstFPNUm = Double.parseDouble(firstFloatNumString);
			double secondFPNUm = Double.parseDouble(secondFloatNumString);
			String hexNum = Integer.toHexString(intNum);
			String binNum = Integer.toBinaryString(intNum);
			System.out.print("|");
			System.out.print(String.format("%-10s", hexNum.toUpperCase()));
			System.out.print("|");
			System.out.print(String.format("%10s", binNum).replace(' ', '0'));
			System.out.print("|");
			System.out.printf("%10.2f", firstFPNUm);
			System.out.print("|");
			System.out.printf("%-10.3f", secondFPNUm);
			System.out.print("|");
		} else {
			System.out.println("PLease use correct number format.");
		}
	}

}
