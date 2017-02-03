package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_USING_STORAGE_FILE;

/**
 * Formatting text for display. 
 */
public class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();
    
    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    /** Format user command instruction. */
    public String getUserCommandInstruction() {
    	return LINE_PREFIX + "Enter command: ";
    }
    
    /** Format command entered. */
    public String getCommandEntered(String fullInputLine) {
    	return "[Command entered:" + fullInputLine + "]";
    }
    
    /** Format storage file information. */
    public String getStorageFileInfo(String storageFilePath) {
    	return String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);
    }
    
    /** Format every line to show to user. */
    public String getShowToUser(String m) {
    	return LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX);
    }
    
    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    public static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }

}
