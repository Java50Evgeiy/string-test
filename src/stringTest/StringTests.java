package stringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		
		  String str = "Hello world!";
		   char exepted1 = 'H';
		   char exepted2 = ' ';
		   char exepted3 = '!';
		       
		   char actual1 = str.charAt(0);
		   char actual2 = str.charAt(5);
		   char actual3 = str.charAt(str.length()-1);
		   
		   assertEquals (exepted1,actual1);
		   assertEquals (exepted2,actual2);
		   assertEquals (exepted3,actual3);
		
		    }

		

	@Test
	void testCompareTo() {
		String myStr1 = "BackEnd";
		String myStr2 = "BackEnd";
		String myStr3 = "ManInBlack";
		
		assertTrue(myStr1.compareTo(myStr2)==0);
		assertTrue(myStr2.compareTo(myStr3)<0);
		assertTrue(myStr3.compareTo(myStr1)>0);
				
	}

	@Test
	void testCompareToIgnoreCase() {
		String myStr1 = "REDBULL";
		String myStr2 = "redBull";
		String myStr3 = "Fitnessqqq";
		
	assertTrue (myStr1.compareToIgnoreCase(myStr2)==0);
	assertTrue (myStr2.compareToIgnoreCase(myStr3)>0);
	assertTrue (myStr3.compareToIgnoreCase(myStr1)<0);
	}

	@Test
	void testConcat() {
		String Name = "Iron";
		String LastName = "Man";
		String exepted = "Iron Man";
		
		String actual = Name.concat(" ").concat(LastName);
		assertEquals(exepted,actual);
	}

	@Test
	void testStartsWith() {
		String myStr = "Ferrari";
		assertTrue(myStr.startsWith("Ferrari"));
		assertFalse(myStr.startsWith("rrari"));
	}

	@Test
	void testEndWith() {
		String myStr = "Ferrari";
		assertTrue(myStr.endsWith("i"));
		assertFalse(myStr.endsWith("Fer"));
	}

	@Test
	void testContains() {
		String myStr = "Volvo";
		assertTrue(myStr.contains("Vol"));
		assertTrue(myStr.contains("lv"));
		assertFalse(myStr.contains("Volwo"));
	}

}
