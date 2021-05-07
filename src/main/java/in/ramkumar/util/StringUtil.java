package in.ramkumar.util;

public class StringUtil {
	
	/**
	 * This method returns the length of the given string.
	 * @param string
	 * @return
	 */
	public static int getLength(String string) {
		return string.trim().length();
	}
	
	/**
	 * This method checks the given string with null and empty.
	 * @param string
	 * @return REturns true iff the given string is not null and empty.
	 */
	public static boolean checkingForNullAndEmpty(String string) {
		boolean validString = false;
		if (string != null && string.trim() != "") {
			validString = true;
		}
		return validString;
	}

}
