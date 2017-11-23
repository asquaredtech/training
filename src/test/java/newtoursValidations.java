import core.TestLib;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class newtoursValidations extends TestLib {

  @Test
  public void testNewtoursValidations() throws Exception {
    driver.get(baseUrl + "/");
    logger.info("Opened base URL: " + baseUrl);

    //Verifying page title
    logger.info("Verifying page title is 'Welcome: Mercury Tours'");
    assertEquals("Welcome: Mercury Tours", driver.getTitle());

    logger.info("Asserting Sign-On link");
    assertEquals("SIGN-ON", driver.findElement(By.linkText("SIGN-ON")).getText());

    logger.info("Asserting REGISTER link");
    assertEquals("REGISTER", driver.findElement(By.linkText("REGISTER")).getText());

    logger.info("Asserting SUPPORT link");
    assertEquals("SUPPORT", driver.findElement(By.linkText("SUPPORT")).getText());

    logger.info("Asserting CONTACT link");
    assertEquals("CONTACT", driver.findElement(By.linkText("CONTACT")).getText());
  }
}
