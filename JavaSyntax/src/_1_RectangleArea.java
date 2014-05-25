import java.util.Scanner;

public class _1_RectangleArea {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			try {
				System.out.print("Plese enter two inntegers as sides of the rectangle: ");
				String input = sc.nextLine();
				System.out.println(newStringFromChars(60, '-'));
				String[] sides = input.split(" ");
				int firstSide = Integer.parseInt(sides[0]);
				int secondSide = Integer.parseInt(sides[1]);
				int area = firstSide * secondSide;
				System.out.printf("The area of the rectangle is: %d.", area);
				break;
			} catch (NumberFormatException e) {
				System.out.println("You have entered some symbols as input. Please enter only integers.");
				System.out.println();
				continue;
			}
		}
	}
	public static String newStringFromChars(int length, char charToFill) {
	    char[] array = new char[length];
	    int pos = 0;
	    while (pos < length) {
	        array[pos] = charToFill;
	        pos++;
	    }
	    return new String(array);
	}
}
