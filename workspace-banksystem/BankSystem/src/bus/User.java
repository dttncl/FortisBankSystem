package bus;

public class User {
	protected String userId;
	protected String userPIN;
	protected String fName;
	protected String lName;
		
	public User() {
		super();
		this.userId = "undefined";
		this.userPIN = "0000";
		this.fName = "undefined";
		this.lName = "undefined";
	}

	public User(String userId, String userPIN, String fName, String lName) {
		super();
		this.userId = userId;
		this.userPIN = userPIN;
		this.fName = fName;
		this.lName = lName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPIN() {
		return userPIN;
	}

	public void setUserPIN(String userPIN) {
		this.userPIN = userPIN;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPIN=" + userPIN + ", fName=" + fName + ", lName=" + lName + "]";
	}
	
	
}
