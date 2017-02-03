package seedu.addressbook.data.person;

/**
 * Represents a Person's block number in the address book.
 */
public class Block {

    private static final String BLOCK_VALIDATION_REGEX = "\\d+";
    private final String block;
    
    public Block(String block) {
    	this.block = block;
    }

    /**
     * Returns true if a given string is a valid person block number.
     */
    public boolean isValid() {
        return block.matches(BLOCK_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return block;
    }

}
