
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class validateLinks extends baseClass{
    @Test
    public void testValidateLinks() throws Exception {
        Logger logger = LogManager.getLogger(validateLinks.class);

        logger.info("Step 01: Go to http://newtours.demoaut.com");
        driver.get(baseUrl + "/");

        //Validation point 01
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        logger.info("Step 02: Click on SIGN-ON link in Header");
        driver.findElement(By.linkText("SIGN-ON")).click();

        //Validation point 02
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());

        logger.info("Step 03: Click on REGISTER link in Header");
        driver.findElement(By.linkText("REGISTER")).click();

        //Validation point 03
        assertEquals("Register: Mercury Tours", driver.getTitle());

    }
}
