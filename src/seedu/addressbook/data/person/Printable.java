package seedu.addressbook.data.person;

public interface Printable {

	String toString();
    String getPrintableString();
    boolean equals(Object other);
    int hashCode();
	
}