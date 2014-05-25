import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class SortArrayOfStrings {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] strings;
		try {
			System.out.print("Enter number of strings: ");
			int number = sc.nextInt();
			strings = new String[number];
			for (int i = 0; i < number; i++) {
				strings[i] = sc.next();
			}
		} finally {
			sc.close();
		}
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	
	}
}
