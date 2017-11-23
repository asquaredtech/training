package jyoti;

import core.TestLib;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Abhi on 5/13/2017.
 */
public class newtoursReg1 extends TestLib {
    @Test
    public void newtoursReg1 () throws Exception {
        //Open base Url
        logger.info("Open + Base url");
        driver.get(baseUrl);


        //Asserting page title Welcome: Mercury tours
        logger.info("Asserting page title Welcome: Mercury Tours");
        Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());

        //Asserting link Register and page title
        logger.info("Asserting Register link text and page title");
        driver.findElement(By.linkText("REGISTER")).click();
        Assert.assertEquals("Register: Mercury Tours", driver.getTitle());

        //Entering first name
        logger.info("Enter the first name");
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Reach20");

        //Entering last name
        logger.info("Enter the last name");
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Asquared20");

        //Entering Email id
        logger.info("Enter the Email id");
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("testing.automation20@gmail.com");

        //Entering Address
        logger.info("Enter the Address");
        driver.findElement(By.name("address1")).clear();
        driver.findElement(By.name("address1")).sendKeys("123 Baymeadows Way");


        //Entering City
        logger.info("Enter the City");
        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("Jacksonville");

        //Entering Postal Code
        logger.info("Enter the Postal Code");
        driver.findElement(By.name("postalCode")).clear();
        driver.findElement(By.name("postalCode")).sendKeys("32256");


        //Entering Country
        logger.info("Enter the Country");
        //driver.findElement(By.name("country")).clear();
        //driver.findElement(By.name("country")).sendKeys("United States of America");
        new Select(driver.findElement(By.name("country"))).selectByVisibleText("United States");


        //Entering User Name
        logger.info("User Name");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("userName20");


        //Entering Password
        logger.info("Password");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("hi20");

        //Reconfirm Password
        logger.info("Reconfirm password");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("hi20");

        // Click on Submit button and Asserting Thankyou message
        logger.info("Click on Submit button and asserting Thank you message");
        driver.findElement(By.name("REGISTER")).click();
        Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered. ",
                driver.findElement(By.xpath("//html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]")).getText());


          }

        }
