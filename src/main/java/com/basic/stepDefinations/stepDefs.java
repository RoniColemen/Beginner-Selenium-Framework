package com.basic.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefs {

    static WebDriver driver;
    String URL = "https://tutorialsninja.com/demo/index.php?route=common/home";


    @Given("User navigates to the AUT website")
    public void userNavigatesToTheAUTWebsite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get(URL);

        driver.findElement(By.xpath("//a[@title='My Account']/i")).click();
        driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
        String heading = driver.findElement
                (By.xpath("//div[@class='well']/h2[contains(.,'Returning Customer')]")).getText();
        Assert.assertEquals("Assert Failure", heading, "Returning Customer");
        Thread.sleep(3000);
    }

    @And("User enters the valid username")
    public void userEntersTheValidUsername(){
        System.out.println("Entering username");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rohanrane10@gmail.com");
    }

    @Given("User enters the valid password")
    public void userEntersTheValidPassword() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Entering password");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("hVWVZKQtXhBP@2");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Given("User should be logged into the AUT")
    public void userShouldBeLoggedIntoTheAUT(){
        String account = driver.findElement(By.xpath("//div[@id='content']/h2[contains(.,'My Account')]")).getText();
        System.out.println(account);
        Assert.assertEquals("Assert Failure", account, "My Account");
    }

    @When("Enter the Username {string}and Password {string}")
    public void enterTheUsernameAndPassword(String username,String password) {
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    }

}
