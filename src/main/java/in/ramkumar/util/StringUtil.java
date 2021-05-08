package in.ramkumar.util;

public class StringUtil {

	/**
	 * @param string
	 * @return Returns the length of the given string.
	 */
	public static int getLength(String string) {
		return string.trim().length();
	}

	/**
	 * This method checks the given string with null and empty.
	 * 
	 * @param string
	 * @return Returns true iff the given string is not null and empty.
	 */
	public static boolean checkingForNullAndEmpty(String string) {
		boolean validString = false;
		if (string != null && string.trim() != "") {
			validString = true;
		}
		return validString;
	}

}
