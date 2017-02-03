package seedu.addressbook.data.person;

/**
 * Represents a Person's unit number in the address book.
 */
public class Unit {

    private static final String UNIT_VALIDATION_REGEX = "#\\d+-\\d+";
    private final String unit;
    
    public Unit(String unit) {
    	this.unit = unit;
    }

    /**
     * Returns true if a given string is a valid person unit number.
     */
    public boolean isValid() {
        return unit.matches(UNIT_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return unit;
    }

}
