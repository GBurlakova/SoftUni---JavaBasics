public class ParseNumbers {
	
	public static Boolean tryParseInt(String numAsString){
		try {
			Integer.parseInt(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static Boolean tryParseFloatingPoint(String numAsString){
		try {
			Float.parseFloat(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static Boolean tryParseDouble(String numAsString){
		try {
			Double.parseDouble(numAsString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
