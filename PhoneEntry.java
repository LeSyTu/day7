package buoi7;

public class PhoneEntry {
	private String name;
	private String phoneNumber;
	
	public PhoneEntry() {
		this.name = "";
		this.phoneNumber="";
	}
	
	public PhoneEntry(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		String result = name + " " + phoneNumber;
		return result;
	}

}
