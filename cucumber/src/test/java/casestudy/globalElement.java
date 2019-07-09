package casestudy;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class globalElement {
	
	@FindBy(how=How.ID, using="userName")
	static public WebElement username;
	@FindBy(how=How.ID, using="password")
	static public WebElement password;
	//@FindBy(how=How.CSS, using="input[value='Log in']")
	//tatic public WebElement signin;
	//@FindBy(how=How.LINK_TEXT, using="Log out")
	//static public WebElement signout; 
	//@FindBy(how=How.ID, using ="pass_confirmation")
	//static  public WebElement confpwd;
	//public static Object username;


}
