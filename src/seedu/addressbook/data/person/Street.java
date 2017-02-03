package seedu.addressbook.data.person;

/**
 * Represents a Person's street name in the address book.
 */
public class Street {

    private static final String STREET_VALIDATION_REGEX = "[\\p{Alpha} ]+";
    private final String street;
    
    public Street(String street) {
    	this.street = street;
    }

    /**
     * Returns true if a given string is a valid person street name.
     */
    public boolean isValid() {
        return street.matches(STREET_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return street;
    }

}
