package seedu.addressbook.tagging;

public class Tagging {
	
	private char addOrDelete;
	private String name;
	private String tag;
	
	public Tagging(char addOrDelete, String name, String tag) {
		this.addOrDelete = addOrDelete;
		this.name = name;
		this.tag = tag;
	}
	
	/**
	 * Returns each tagging String to be printed out when AddressBook program exits. 
	 */
	public String toString() {
		return addOrDelete + " " + name + " [" + tag + "]";
	}
	
}
