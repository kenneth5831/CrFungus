package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This class is used as an action class 
 * and extends ActionSupport class.
 * @author codesjava
 */
public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//data members
	private String userName;
	private String password;
	private String message;
 
	//business logic
	public String execute(){
		System.out.println("LoginActionLoginActionLoginActionLoginActionLoginAction");
		if(userName.equals("jai") && 
				password.equals("1234")){
			setMessage("Hello " +userName + ", " +
				"You are successfully logged in.");
			return SUCCESS;
		}else{
			setMessage("Invalid username or password.");
			return ERROR;
		}		
	}	
 
	//getter setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}