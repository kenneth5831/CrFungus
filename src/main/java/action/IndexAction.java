package action;

import org.springframework.stereotype.Controller;

@Controller("indexAction")
public class IndexAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName ;
	private String password ;

	
	public String excute() throws Exception{
		
		userName = "kenneth";
		
		return SUCCESS;
	}
	
	public String getUserEmail(){
		return "my@email.com";
	}
	
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
	
	
}
