import core.TestLib;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by snamburi on 5/9/2017.
 */
public class newtoursLinks extends TestLib {
    @Test
    public void testNewtoursLinks(){
        //Open base url
        logger.info("Opening URL: " + baseUrl);
        driver.get(baseUrl);
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        //enter data into registration form
        logger.info("Enter data into registration form");
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName"))
                .sendKeys("asquared");

        //Click on flights link
        String flightsLink = driver.findElement(By.linkText("Flights")).getAttribute("href");
        logger.info("Click on Flights link " + flightsLink);
        driver.findElement(By.linkText("Flights")).click();
        assertEquals(driver.getTitle(), "Welcome: Mercury Tours");



    }
}
