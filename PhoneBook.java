package buoi7;

public class PhoneBook {

	private int numberofEntries = 0;
	private PhoneEntry[] phoneEntries;

	public PhoneBook() {
		phoneEntries = new PhoneEntry[100];

	}

	public boolean addEntry(PhoneEntry entry) {
		if (numberofEntries < 100 && !isDuplicateName(entry.getName()) && !isDuplicateNumber(entry.getPhoneNumber())) {
			phoneEntries[numberofEntries] = entry;
			numberofEntries++;
			return true;
		}
		else return false;
	}
	
	public boolean modifyEntryName(String oldName, String newName) {
		PhoneEntry pe = findEntryByName(oldName);
		if (pe != null && !isDuplicateName(newName)) {
			pe.setName(newName);
			return true;
		}
		return false;
	}
		
			
	public boolean modifyEntryNumber(String entryName, String newNumber) {
		PhoneEntry  pe1 = findEntryByName(entryName);
		if(pe1!= null && !isDuplicateNumber(newNumber)) {
			pe1.setPhoneNumber(newNumber);
			return true;
		}
		return false;
	}
	
	public boolean deleteEntry(String entryName) {
		for (int i = 0; i < numberofEntries; i++) {
			if (phoneEntries[i].getName().equals(entryName)) {
				int j = i;
				while (phoneEntries[j+1] != null) {
					phoneEntries[j] = phoneEntries[j+1];
					j++;
				}
				phoneEntries[j] = null;
				numberofEntries--;
				return true;
			}
		}
		return false;
	}
	
	public PhoneEntry findEntryByName(String entryName) {
		for(int i = 0; i < numberofEntries; i++) {
			if(phoneEntries[i].getName().equals(entryName)) {
				return phoneEntries[i];
			}
		}
		return null;
	}
	
	public PhoneEntry findEntryByNumber(String entryNumber) {
		for(int i = 0; i < numberofEntries; i++) {
			if(phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
				return phoneEntries[i];
			}
		}
		return null;
	}
	
	private boolean isDuplicateName(String entryName) {
		for(int i = 0; i < numberofEntries; i++) {
			if(phoneEntries[i].getName().equals(entryName)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isDuplicateNumber(String entryNumber) {
		for(int i = 0; i < numberofEntries; i++) {
			if(phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String all = "";
		for (int i = 0; i < numberofEntries; i++) {
			all += phoneEntries[i].toString() + "\n";
		}
		return all;
	}
}
