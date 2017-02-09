package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a Person's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidName(String)}
 */
public class Name {

    public static final String EXAMPLE = "John Doe";
    public static final String MESSAGE_NAME_CONSTRAINTS = "Person names should be spaces or alphabetic characters";
    public static final String NAME_VALIDATION_REGEX = "[\\p{Alpha} ]+";
    public final String fullName;

    /**
     * Validates given name.
     *
     * @throws IllegalValueException if given name string is invalid.
     */
    public Name(String name) throws IllegalValueException {
        String trimmedName = name.trim();
        if (!isValidName(trimmedName)) {
            throw new IllegalValueException(MESSAGE_NAME_CONSTRAINTS);
        }
        this.fullName = trimmedName;
    }

    /**
     * Returns true if a given string is a valid person name.
     */
    public static boolean isValidName(String test) {
        return test.matches(NAME_VALIDATION_REGEX);
    }

    /**
     * Retrieves a listing of every word in the name, in order.
     */
    public List<String> getWordsInName() {
        return Arrays.asList(fullName.split("\\s+"));
    }
    
    /**
     * Returns true if the other name is very similar to this name.
     * Two names are considered similar if at least one of them contains all the words of the other name.
     * E.g. "John K Smith" and "John Smith" are similar because the words in "John K Smith" include the words in "John Smith".
     * This comparison is not case-sensitive.   
     */
    public boolean isSimilar(Name other) {
    	if (other == null) {
    		return false;
    	}
    	String[] thisNameWordsArray = this.fullName.toLowerCase().split(" ");
    	String[] otherNameWordsArray = other.fullName.toLowerCase().split(" ");
    	ArrayList<String> thisNameWordsList = new ArrayList<String>(Arrays.asList(thisNameWordsArray));
    	ArrayList<String> otherNameWordsList = new ArrayList<String>(Arrays.asList(otherNameWordsArray));
    	boolean thisNameContainsOtherNameWords = true;
    	boolean otherNameContainsThisNameWords = true;
    	
    	for (String str : thisNameWordsList) {
    		if (!otherNameWordsList.contains(str)) {
    			otherNameContainsThisNameWords = false;
    			break;
    		}
    	}
    	for (String str : otherNameWordsList) {
    		if (!thisNameWordsList.contains(str)) {
    			thisNameContainsOtherNameWords = false;
    			break;
    		}
    	}
    	return thisNameContainsOtherNameWords || otherNameContainsThisNameWords;
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Name // instanceof handles nulls
                && this.fullName.equals(((Name) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

}
