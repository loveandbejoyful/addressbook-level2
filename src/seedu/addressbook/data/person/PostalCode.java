package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code number in the address book.
 */
public class PostalCode {

    private static final String POSTALCODE_VALIDATION_REGEX = "\\d{6}";
    private final String postalCode;
    
    public PostalCode(String postalCode) {
    	this.postalCode = postalCode;
    }

    /**
     * Returns true if a given string is a valid person postal code number.
     */
    public boolean isValid() {
        return postalCode.matches(POSTALCODE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return postalCode;
    }

}
