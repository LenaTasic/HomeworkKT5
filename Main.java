package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ltasic\\Documents\\Projects\\AUTOMATION 2023\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.automationpractice.pl/index.php");

        //Click on Sign in button/link
        driver.findElement(By.cssSelector("[title='Log in to your customer account']")).click();

        //Email address
        WebElement email = driver.findElement(By.xpath("//*[@id='email_create']"));
        email.sendKeys("testing@fjls.com");

        //Click Create an account
        driver.findElement(By.cssSelector("#SubmitCreate")).click();

        //Select Title
        driver.findElement(By.cssSelector("#id_gender1")).click();

        //Enter First Name
        driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Joseph");

        //Enter Last Name
        driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Smith");


        //Delete email address
        driver.findElement(By.xpath("//*[@id='email']")).clear();

        //Enter email address
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("emlltt@glmltlm.com");


         //Enter Password
        driver.findElement(By.cssSelector("#passwd")).sendKeys("pass124");


        //Select Date of Birth - Day
        Select select = new Select(driver.findElement(By.id("days")));
        select.selectByIndex(16);

        //Select Date of Birth - Month
        Select selectMonth = new Select(driver.findElement(By.id("months")));
        selectMonth.selectByIndex(12);


        //Select Date of Birth - Year
        Select selectYear = new Select(driver.findElement(By.id("years")));
        selectYear.selectByValue("1956");
        //selectYear.selectByIndex(2000);

        //Select Newsletter
        driver.findElement(By.cssSelector("#newsletter")).click();

        //Select Register
        driver.findElement(By.cssSelector("#submitAccount")).click();

        //Add my first address
        driver.findElement(By.cssSelector("[title='Add my first address']")).click();


        //Enter company name
        driver.findElement(By.cssSelector("#company")).sendKeys("QAcompany");

        //Enter address:
        driver.findElement(By.cssSelector("#address1")).sendKeys("943 Forest Dr, Arnold, MD 21012");

        //City
        driver.findElement(By.cssSelector("#city")).sendKeys("Arnold");

        //State
        driver.findElement(By.cssSelector("#id_state")).sendKeys("Maryland");
        //Select state = new Select(driver.findElement(By.id("id_state")));
        //state.selectByValue("Maryland");

        //Zip/Postal Code
        driver.findElement(By.cssSelector("#postcode")).sendKeys("21012");

        //County
        //Select country = new Select(driver.findElement(By.id("id_country")));
        //country.selectByValue("United States");


        //Home phone
        driver.findElement(By.cssSelector("#phone")).click();
        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("124578888777");

        //Mobile phone
        driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("441111147455");

        //Additional information
        driver.findElement(By.xpath("//*[@id='other']")).sendKeys("Thank you!");

        //Please assign an address title for future reference
        driver.findElement(By.xpath("//*[@id='alias']")).sendKeys(" Test");

        //Save
        driver.findElement(By.cssSelector("#submitAddress")).click();

        //Back to your addresses
        //driver.findElement(By.cssSelector("#btn btn-defaul button button-small")).click();

        Thread.sleep(5000);

        driver.quit();


        // Thread.sleep(5000);

    }
}
