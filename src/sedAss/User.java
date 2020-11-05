package sedAss;

public class User {
	private String fullName;
	private int code;
	private String gender;
	private String dob;
	private String phoneNumber;
	
	public User(int code, String fullName, String gender, String dob, String phoneNumber) {
		this.code = code;
		this.fullName = fullName;
		this.gender = gender;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
	}
	public int getCode(){
		return code;
	}
	public String getFullName(){
		return fullName;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	protected boolean validateCode(int code) {
		if (code > 100000000) {
			return true;
		} else return false; 
	}
	
}
