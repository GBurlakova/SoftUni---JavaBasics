import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstLine = scanner.nextLine();
		String secondLine = scanner.nextLine();
		ArrayList<String> firstList = new ArrayList<>(Arrays.asList(firstLine.split(" ")));
		ArrayList<String> secondList = new ArrayList<>(Arrays.asList(secondLine.split(" ")));
		ArrayList<String> resultList = new ArrayList<>(Arrays.asList(firstLine.split(" ")));
		for (int i = 0; i < secondList.size(); i++) {
			if (firstList.contains(secondList.get(i)) == false) {
				resultList.add(secondList.get(i));
			}
		}
		for (String string : resultList) {
			System.out.print(string + " ");
		}
	}

}
