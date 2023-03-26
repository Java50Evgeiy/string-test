package stringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		
		 assertEquals('J',"Java".charAt(0));
		 assertEquals('a',"Java".charAt(3));
		
		   
		
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
	assertEquals(0,"Hello".compareToIgnoreCase("hello"));
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
		assertTrue(myStr.startsWith(""));
	}

	@Test
	void testEndWith() {
		String myStr = "Ferrari";
		assertTrue(myStr.endsWith("i"));
		assertFalse(myStr.endsWith("Fer"));
		assertTrue(myStr.endsWith(""));
	}

	@Test
	void testContains() {
		String myStr = "Volvo";
		assertTrue(myStr.contains("Vol"));
		assertTrue(myStr.contains("lv"));
		assertFalse(myStr.contains("Volwo"));
	}
	@Test
	void testLastIndexOf() {
		assertEquals (0,"lacoste".lastIndexOf("l"));
		assertEquals (2,"lacoste".lastIndexOf("c",5));
		assertEquals (5,"lacoste".lastIndexOf("t",6));
		
	}
	@Test
	void testIndexOf() {
		assertEquals (0,"chanel".indexOf("cha"));
		assertEquals (-1,"chanel".indexOf("Cha"));
		assertEquals (3,"chanel".indexOf("nel",2));
		
	}

}
