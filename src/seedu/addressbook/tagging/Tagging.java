package seedu.addressbook.tagging;

import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.person.Name;

/**
 * Association class for classes Tag and Person.
 * Each Tagging object will represent an adding or deleting of a tag for a specific person. 
 */
public class Tagging {
	
	private final static char ADD_PREFIX = '+';
	private final static char DELETE_PREFIX = '-';
	
	private boolean addNotDelete;
	private Name name;
	private Tag tag;
	
	public Tagging(boolean addNotDelete, Name name, Tag tag) {
		this.addNotDelete = addNotDelete;
		this.name = name;
		this.tag = tag;
	}
	
	/**
	 * Returns each tagging String to be printed out when AddressBook program exits. 
	 */
	public String toString() {
		char taggingPrefix = (addNotDelete) ? ADD_PREFIX : DELETE_PREFIX;
		String taggingName = name.toString();
		String taggingTag = tag.toString();
		return taggingPrefix + " " + taggingName + " " + taggingTag;
	}
	
}
