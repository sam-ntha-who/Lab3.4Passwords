import java.util.ArrayList;
import java.util.Scanner;

public class PasswordsAndUnitTests {
	static Scanner scnr = new Scanner(System.in);
	static ArrayList<String> goodPasswords = new ArrayList<>();

	public static void main(String[] args) {
		getPassword();
		
	}

// get a password from the user
	public static void getPassword() {
		System.out.println("Please enter a password:");
		String password = scnr.nextLine();
		addPassword(password);
	}

// repeat the process if user wants to	
	public static void nextPassword() {
		String userInput;
		System.out.println("Would you like to try a new password? Y/N:");
		userInput = scnr.nextLine();
		if (userInput.equalsIgnoreCase("Y")) {
			getPassword();
		} else {
			System.out.println("Passwords are: " + goodPasswords);
			System.out.println("Thanks, have a nice day!");
		} 
	}

// pass all the tests and add to the ArrayList
	public static boolean addPassword(String password) {
		if (passInArray(password, goodPasswords) == false) {
			return false;
		} else if (passAdminMod(password) == true) {
			passwordStorage(password);
			return true;
		} else if (passNoSpace(password) == false) {
			return false;
		} else if (passLength(password) == false) {
			return false;
		} else if (passNum(password) == false) {
			return false;
		} else if (passCapVowels(password) == false) {
			return false;
		} else {
			passwordStorage(password);
			nextPassword();
			return true;
		} 
	}

	// no spaces
	public static boolean passNoSpace(String password) {
		if (password.contains(" ")) {
			return false;
		} else {
			return true;
		}
	}

	// contains a number that is not 6 - regex
	public static boolean passNum(String password) {
		if ((password.matches(".*[0-9].*") && (!password.matches(".*6.*")))) {
			return true;
		} else {
			return false;
		}
	}

	// password between 7 & 12 characters
	public static boolean passLength(String password) {
		if (password.length() < 7 || password.length() > 12) {
			return false;
		} else {
			return true;
		}
	}

	// Two capital letter vowels
	public static boolean passCapVowels(String password) {
		// ArrayList<Character> passVowel = new ArrayList<>();
		int numVowels = 0;
		char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'Y' };
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < password.length(); j++) {
				if (vowels[i] == password.charAt(j)) {
					numVowels++;
				}
			}
		}
		if (numVowels >= 2) {
			return true;
		} else {
			return false;
		}

	}

	// Admin or Mod ok!
	public static boolean passAdminMod(String password) {
		if (password.equals("admin") || password.equals("mod")) {
			return true;
		} else {
			return false;
		}
	}

	// is the password already present in the ArrayList?
	public static boolean passInArray(String password, ArrayList<String> goodPasswords) {

		if (goodPasswords.contains(password)) {
			return false;
		} else {
			return true;
		}
	}

// add password to the ArrrayList
	public static ArrayList<String> passwordStorage(String password) {
		goodPasswords.add(password);

		return goodPasswords;

	}
}
