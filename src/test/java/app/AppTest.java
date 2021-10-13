package app;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test
  public void loginTestWithValid() throws Exception {
	  App ap=new App();
	  boolean  status=ap.userlogin("userdemo","password");
      Assert.assertTrue(status);
  }
  @Test
  public void loginTestWithInvalid() throws Exception {
	  App ap=new App();
	  boolean  status=ap.userlogin("userdemo","password1223");
      Assert.assertFalse(status);
  }
}
