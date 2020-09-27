package dao;

public class User {
	private String uname;
	private String password;
	private String info;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public User(String uname, String password, String info) {
		super();
		this.uname = uname;
		this.password = password;
		this.info = info;
	}
	
	

}
