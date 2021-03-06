import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PasswordsAndUnitTestsTest {


	@Test
	void AddPasswordtest() {
		String password = "b3EpbOop";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.addPassword(password);
		assertEquals(expected, actual);
	}
	
	@Test
	void AddPassword2test() {
		String password = "admin";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.addPassword(password);
		assertEquals(expected, actual);
	}
	@Test
	void AddPassword3test() {
		String password = "beepboop";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.addPassword(password);
		assertEquals(expected, actual);
	}
	@Test
	void AddPassword4test() {
		String password = "boop";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.addPassword(password);
		assertEquals(expected, actual);
	}
	@Test
	void AddPassword5test() {
		String password = "b36EpbOop";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.addPassword(password);
		assertEquals(expected, actual);
	}
	@Test
	void passSpacetest() {
		String password = "beep boop";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.passNoSpace(password);
		assertEquals(expected, actual);
	}
	@Test
	void passSpace2test() {
		String password = "beepboop";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passNoSpace(password);
		assertEquals(expected, actual);
	}
	@Test
	void passLengthtest() {
		String password = "beepboop";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passLength(password);
		assertEquals(expected, actual);
	}
	@Test
	void passLength2test() {
		String password = "beep";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.passLength(password);
		assertEquals(expected, actual);
	}
	@Test
	void passNumtest() {
		String password = "beepboop7";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passNum(password);
		assertEquals(expected, actual);
	}
	@Test
	void passNum2test() {
		String password = "beepboop6";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.passNum(password);
		assertEquals(expected, actual);
	}
	@Test
	void passAdminModtest() {
		String password = "beep";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.passAdminMod(password);
		assertEquals(expected, actual);
	}
	@Test
	void passAdminMod2test() {
		String password = "admin";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passAdminMod(password);
		assertEquals(expected, actual);
	}
	@Test
	void passAdminMod3test() {
		String password = "mod";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passAdminMod(password);
		assertEquals(expected, actual);
	}
	@Test
	void passCapVowelstest() {
		String password = "beepbOOp";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passCapVowels(password);
		assertEquals(expected, actual);
	}
	@Test
	void passCapVowels2test() {
		String password = "beepbOop";
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.passCapVowels(password);
		assertEquals(expected, actual);
	}
	@Test
	void passCapVowels3test() {
		String password = "beepbOopY";
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passCapVowels(password);
		assertEquals(expected, actual);
	}
	@Test
	void passInArraytest() {
		String password = "b3EpbOop";
		ArrayList<String> goodPasswords = new ArrayList <> ();
		goodPasswords.add("hAmbUrg3r");
		goodPasswords.add("sqUiggy7");
		boolean expected = true;
		boolean actual = PasswordsAndUnitTests.passInArray(password, goodPasswords);
		assertEquals(expected, actual);
	}
	@Test
	void passInArray2test() {
		String password = "hAmbUrg3r";
		ArrayList<String> goodPasswords = new ArrayList <> ();
		goodPasswords.add("hAmbUrg3r");
		goodPasswords.add("sqUiggy7");
		boolean expected = false;
		boolean actual = PasswordsAndUnitTests.passInArray(password, goodPasswords);
		assertEquals(expected, actual);
	}
	@Test 
	// expected int = 3 because tests are adding their own items to the ArrayList
	// trying to figure it out. Also the ArrayList printed to the console has 4 elements
	// as this item isn't added to the list until after this test runs! gee whiz.
	void passwordStoragetest() {
		String password = "hAmbUrg4r";
		int expected = 3;
		int actual = PasswordsAndUnitTests.passwordStorage(password).size();
		assertEquals(expected, actual);
	}
	@Test
	void passwordStorage2test() {
		String password = "hAmbUrg3r";
		ArrayList<String> expected = new ArrayList<>();
		expected.add("hAmbUrg3r");
		ArrayList<String> actual = PasswordsAndUnitTests.passwordStorage(password);
		assertEquals(expected, actual);
	}
	
}

