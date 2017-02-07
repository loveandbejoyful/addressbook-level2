package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact details in the address book.
 * Parent class of Phone, Email and Address.
 */
public class Contact {
	
	public String value;
    private boolean isPrivate;
    
    /**
     * Validates given contact.
     *
     * @throws IllegalValueException if given contact string is invalid.
     */
    public Contact(String contact, String messageConstraints, String validationRegex, boolean isPrivate) throws IllegalValueException {
        String trimmedContact = contact.trim();
        setValue(trimmedContact, messageConstraints, validationRegex);
        this.isPrivate = isPrivate;
    }
    
    /**
     * Initialize value variable
     * 
     * @throws IllegalValueEception if given contact string is invalid.
     */
    public void setValue(String trimmedContact, String messageConstraints, String validationRegex) throws IllegalValueException {
    	if (!isValidContact(trimmedContact, validationRegex)) {
    		throw new IllegalValueException(messageConstraints);
    	}
    	this.value = trimmedContact;
    }
    
    /**
     * Checks if a given string is a valid person phone number.
     */
    public static boolean isValidContact(String test, String validationRegex) {
        return test.matches(validationRegex);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
