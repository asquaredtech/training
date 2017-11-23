package jyoti;

import core.TestLib;
import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Abhi on 5/13/2017.
 */
public class newtoursLinks1 extends TestLib {

    @Test
    public void newtoursLinks1 () throws Exception {
        //Open base Url
        logger.info("Opening : " + baseUrl);
        driver.get(baseUrl);

        //Asserting page title Welcome: Mercury tours
        logger.info("Asserting page title Welcome: Mercury Tours");
        TestCase.assertEquals("Welcome: Mercury Tours", driver.getTitle());


        //Asserting Sign On link and page title
        logger.info("Asserting Sign-link and Page title");
        //driver.findElement(By.linkText("SIGN-ON"));
        driver.findElement(By.linkText("SIGN-ON")).click();
        TestCase.assertEquals("Sign-on: Mercury Tours", driver.getTitle());

        //Asserting Support link and page title
        logger.info("Asserting Support link and page title");
        driver.findElement(By.linkText("SUPPORT")).click();
        TestCase.assertEquals("Under Construction: Mercury Tours", driver.getTitle());

        //Asserting Contact link and page title
        logger.info("Asserting Contact link and page title");
        driver.findElement(By.linkText("CONTACT"));
        TestCase.assertEquals("CONTACT: Under Construction: Mercury Tours", driver.getTitle());

        //Asserting Home link and page title
        logger.info("Asserting HOME link and page title");
        driver.findElement(By.linkText("Home"));
        TestCase.assertEquals("Home: Welcome: Mercury Tours", driver.getTitle());

        //Asserting Flights link and page title
        logger.info("Asserting Flights link and page title");
        driver.findElement(By.linkText("Flights"));
        TestCase.assertEquals("Flights: Welcome: Mercury Tours", driver.getTitle());

        //Asserting Hotels link and page title
        logger.info("Asserting Hotels link and page title");
        driver.findElement(By.linkText("Hotels"));
        TestCase.assertEquals("Hotels: Under Construction: Mercury Tours", driver.getTitle());

        //Asserting Car Rentals link and page title
        logger.info("Asserting Car Rentals link and page title");
        driver.findElement(By.linkText("Car Rentals"));
        TestCase.assertEquals("Car Rentals: Under Construction: Mercury Tours", driver.getTitle());


        //Asserting Cruises link and page title
        logger.info("Asserting Cruises link and page title");
        driver.findElement(By.linkText("Cruises"));
        TestCase.assertEquals("Cruises: Mercury Tours", driver.getTitle());


        //Asserting Destinations link and page title
        logger.info("Asserting Destinations link and page title");
        driver.findElement(By.linkText("Destinations"));
        TestCase.assertEquals("Destinations: Under Construction: Mercury Tours", driver.getTitle());


        //Asserting Vacations link and page title
        logger.info("Asserting Vacations link and page title");
        driver.findElement(By.linkText("Vacations"));
        TestCase.assertEquals("Vacations: Under Construction: Mercury Tours", driver.getTitle());
                }

            }


