package pageObjects;

public class Login_PO extends Base_PO{

    public Login_PO(){
        super();
    }

    public void navigateTo_webDriverUniversity_login_Page(){
        navigateTo_URL("http://www.webdriveruniversity.com/Login-Portal/index.html?");

    }
}
