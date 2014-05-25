import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _03_LargestSequenceOfEqualStrings {

	public static String findWordBiggestCount(TreeMap<String, Integer> treeMap) {
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : treeMap.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry.getKey();
	}
	
	public static void printsStrings(String str, int count) {
		for (int i = 0; i < count; i++) {
			if (i == count - 1) {
				System.out.print(str);
			} else {
				System.out.print(str + " ");
			}
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter words separated by a single space.");
		String wordsString = scanner.nextLine();
		String[] wordsStrings = wordsString.split(" ");
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		for (String wordAsString : wordsStrings) {
			if (words.containsKey(wordAsString)) {
				words.put(wordAsString, words.get(wordAsString) + 1);
			} else {
				words.put(wordAsString, 1);
			}
		}
		String wordBiggestCount = findWordBiggestCount(words);
		printsStrings(wordBiggestCount, words.get(wordBiggestCount));
	}

}
