package action;

import org.springframework.stereotype.Controller;

@Controller("indexAction")
public class IndexAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName = "Kenneth";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
