package seedu.addressbook.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {
	
	@Test
	public void isSimilar_invalidNames_throwsException() throws IllegalValueException {
		try {
			Name harry = new Name("Harry");
			Name invalid = null;
			assertIsNotSimilar(harry, invalid);
		} catch (IllegalValueException e) {
			fail("Expected execution did not occur.");
		}
	}

	@Test
	public void isSimilar_differentWords_notSimilar() {
		try {
			// different words
			Name john = new Name("John");
			Name mike = new Name("Mike");
			assertIsNotSimilar(john, mike);
			
			// have common words
			Name sarahLee = new Name("Sarah Lee");
			Name sarahOng = new Name("Sarah Ong");
			assertIsNotSimilar(sarahLee, sarahOng);
			
		} catch (IllegalValueException e) {
			fail("Expected execution did not occur.");
		}
	}
	
	@Test
	public void isSimilar_sameWords_similar() {
		try {
			// same sequences of same words of same case
			Name melissa = new Name("Melissa Wong");
			Name melissaCopy = new Name("Melissa Wong");
			assertIsSimilar(melissa, melissaCopy);
			
			// different sequences of same words of same case
			Name johnMike = new Name("John Mike");
			Name mikeJohn = new Name("Mike John");
			assertIsSimilar(johnMike, mikeJohn);
			
			// same sequences of same words of different case
			Name jacob = new Name("Jacob Lim");
			Name jacobCapitalLetters = new Name("JACOB LIM");
			assertIsSimilar(jacob, jacobCapitalLetters);
			
			// different sequences of same words of different case
			Name amandaCheong = new Name("Amanda Cheong");
			Name cheongAmandaSmallLetters = new Name("cheong amanda");
			assertIsSimilar(amandaCheong, cheongAmandaSmallLetters);
			
			// same sequences of different words of same case
			Name hoJunJie = new Name("Ho Jun Jie");
			Name markHoJunJie = new Name("Mark Ho Jun Jie");
			assertIsSimilar(hoJunJie, markHoJunJie);
			
			// different sequences of different words of same case
			Name ryanKwok = new Name("Ryan Kwok");
			Name kwokYongWeiRyan = new Name("Kwok Yong Wei Ryan");
			assertIsSimilar(ryanKwok, kwokYongWeiRyan);
			
			// same sequences of different words of different case
			Name jenniferGoh = new Name("Jennifer Goh");
			Name jenniferGohHuiSzeMixedLetters = new Name("jennifer Goh HUI SZE");
			assertIsSimilar(jenniferGoh, jenniferGohHuiSzeMixedLetters);
			
			// different sequences of different words of different case
			Name clarieLeong = new Name("Clarie Leong");
			Name leongJiaXinClarieMixedLetters = new Name("LEONG JIA XIN Clarie");
			assertIsSimilar(clarieLeong, leongJiaXinClarieMixedLetters);
			
;		} catch (IllegalValueException e) {
			fail("Expected execution did not occur.");
		}
		
	}
	
	private void assertIsSimilar(Name name1, Name name2) {
		assertTrue(name1.isSimilar(name2));
	}
	
	private void assertIsNotSimilar(Name name1, Name name2) {
		assertFalse(name1.isSimilar(name2));
	}

}