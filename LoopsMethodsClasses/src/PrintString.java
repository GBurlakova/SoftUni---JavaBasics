public class PrintString {
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
