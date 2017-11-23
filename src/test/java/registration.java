import core.TestLib;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

/**
 * Created by snamburi on 4/21/2017.
 */
public class registration extends TestLib {
    @Test
    public void registration(){
        //int x = new Random().nextInt(100);
        //Opening newtourse.demoaut
        logger.info("Step 1: Open: " + baseUrl);
        driver.get(baseUrl + "/");

        //Click on Register link in header
        logger.info("Step 2: Click on REGISTER");
        driver.findElement(By.linkText("REGISTER")).click();

        //Validation
        //TODO: validate the page title

        //Enter data into registration form
        logger.info("Enter data into Registration form");
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Reach");

        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Asquared");

        driver.findElement(By.id("userName")).clear();
        driver.findElement(By.id("userName")).sendKeys("reach.asquared@gmail.com");

        driver.findElement(By.name("address1")).clear();
        driver.findElement(By.name("address1")).sendKeys("66 Phyllips hwy");

        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("Jacksonville");

        driver.findElement(By.name("state")).clear();
        driver.findElement(By.name("state")).sendKeys("FL");

        driver.findElement(By.name("postalCode")).clear();
        driver.findElement(By.name("postalCode")).sendKeys("32256");

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("asquared");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("asquared");

        driver.findElement(By.name("confirmPassword")).clear();
        driver.findElement(By.name("confirmPassword")).sendKeys("asquared");

        //Submitting form
        logger.info("Step 4: Submitting Register button");
        driver.findElement(By.name("register")).click();

        //Validate Successful registration
        logger.info("Step 5: Validate 'Thank you for registering. You may now sign-in using the user name and password you've just entered.' message");
        assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", driver.findElement(By.xpath("//tr[3]/td/p[2]/font")).getText());
    }
}
