import java.util.Scanner;


public class _1_SymmetricNumbersInRange {

	public static String getFirstHalf(String str, int endLoop){
		String firstHalfString = "";
		for (int i = 0; i < endLoop; i++) {
			firstHalfString = firstHalfString + str.charAt(i);
		}
		return firstHalfString;
	}
	
	public static String getSecondHalf(String str, int endLoop){
		String secondHalfString = "";
		if (str.length() % 2 == 0) {
			endLoop--;
		}
		for (int i = str.length() - 1; i > endLoop; i--) {
			secondHalfString = secondHalfString + str.charAt(i);
		}
		return secondHalfString;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int start;
        int end;
        while (true) {
			System.out.print("Enter start of the range: ");
			String startStr = scanner.nextLine();
			System.out.print("Enter end of the range: ");
			String endStr = scanner.nextLine();
			System.out.println(PrintString.newStringFromChars(55, '*'));
			if (ParseNumbers.tryParseInt(startStr) &&
				ParseNumbers.tryParseInt(endStr)) {
				start = Integer.parseInt(startStr);
				end = Integer.parseInt(endStr);
			} else {
				System.out.println("Please use correct number format.");
				System.out.println(PrintString.newStringFromChars(55, '-'));
				continue;
			}
			
			if (end < start || start < 0 || end < 0) {
				System.out.println("Please enter correct range - positive " +  System.lineSeparator() + 
						"numbers smaller and end bigger than start.");
				System.out.println(PrintString.newStringFromChars(55, '-'));
				continue;
			}
			
			break;
		}
        for(int i = start; i <= end; i++){
        	String numberString = i + "";
        	int halfSymbols = numberString.length() / 2;
        	String firstHalf = getFirstHalf(numberString, halfSymbols);
        	String secondtHalf = getSecondHalf(numberString, halfSymbols);
        	if (firstHalf.equals(secondtHalf)) {
				System.out.print(numberString + " ");
			}
        }
        System.out.println();
	}

}
