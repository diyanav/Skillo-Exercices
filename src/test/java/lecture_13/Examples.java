package lecture_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Examples {

    @Test
    public void testLogin() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //open the skillo test web site
        driver.get("http://training.skillo-bg.com:4200/posts/all");

        //open Login form
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        //verify the URL
        String expectedLoginPageUrl = "http://training.skillo-bg.com:4200/users/login";
        String actualLoginPageUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualLoginPageUrl, expectedLoginPageUrl, "Login page URL is incorrect!");

        //verify the Sign In form
        WebElement signInElement = driver.findElement(By.className("h4"));
        String expectedSignInText = "Sign In";
        String actualSignInText = signInElement.getText();
        Assert.assertEquals(actualSignInText, expectedSignInText, "Sign In form is incorrect!");

        //type username
        WebElement userName = driver.findElement(By.id("defaultLoginFormUsername"));
        userName.sendKeys("test.user-1234");

        //type password
        WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
        password.sendKeys("test.user-1234");

        //click Sign In button
        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
        Assert.assertTrue(signInButton.isEnabled(), "Sign In button is disabled!");
        signInButton.click();

        //verify home page url
        String expectedHomePageUrl = "http://training.skillo-bg.com:4200/posts/all";
        String actualHomePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl, "Home page URL is incorrect!");

        //open Profile page
        WebElement profileLink = driver.findElement(By.id("nav-link-profile"));
        Assert.assertTrue(profileLink.isDisplayed());
        profileLink.click();

        //verify profile URL
        String expectedProfilePageUrl = "http://training.skillo-bg.com:4200/users/4615";
        String actualProfilePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualProfilePageUrl, expectedProfilePageUrl, "Profile page URL is incorrect!");

        //verify user name in profile
        WebElement userNameElement = driver.findElement(By.tagName("h2"));
        String actualUserNameElement = userNameElement.getText();
        String expectedUserNameElement = "user.name-1234";
        Assert.assertEquals(actualUserNameElement, expectedUserNameElement, "User name is incorrect!");

        driver.close();
    }
}
