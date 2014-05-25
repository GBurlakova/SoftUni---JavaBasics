import java.util.Scanner;


public class _5_DecimalToHexadecimal {
	public static Boolean tryParse(String numAsString){
		try {
			Integer.parseInt(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String numberAsString = scanner.nextLine();
		if (tryParse(numberAsString)) {
			int number = Integer.parseInt(numberAsString);
			String hexNum = Integer.toHexString(number).toUpperCase();
			System.out.println(hexNum);
		} else {
			System.out.println("Please enter a number.");
		}
		
	}
}
