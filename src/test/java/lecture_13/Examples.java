package lecture_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.GregorianCalendar;

import java.time.Duration;
import java.util.Random;

public class Examples {

    private WebDriver driver;

    @BeforeSuite
    public final void setupTestSuite(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.safaridriver().setup();
    }

    @BeforeMethod
    public final void setupTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public final void tearDownTest(){
        if(this.driver != null) {
            driver.close();
        }
    }

    @DataProvider(name = "generateUserData")
    public Object[][] generateUserData(){
        return new Object[][]{
                {"test.user-1234", "test.user-1234"}
        };
    }

    @Test(dataProvider = "generateUserData")
    public void testLogin(String userName, String password) {

        //open the skillo test website
        driver.get("http://training.skillo-bg.com:4300/posts/all");

        //open Login form
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));

        //verify the SignIn form
        WebElement signInElement = driver. findElement (By.xpath ( "//p[text()='Sign in']"));
        wait.until(ExpectedConditions.visibilityOf(signInElement));

        //type username
        WebElement userNameField = driver.findElement(By.id("defaultLoginFormUsername"));
        userNameField.sendKeys(userName);

        //type password
        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
        passwordField.sendKeys(password);

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();

        //verify home page url
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));

        //open Profile page
        WebElement profileLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-profile")));
        profileLink.click();

        //verify profile URL
        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        //verify user name in profile
        Boolean isUserNameDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h2"), userName));
        Assert.assertTrue(isUserNameDisplayed, "The user name is not displayed!");
    }

    @Test
    public void testRegistration(){
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));

        //verify the SignIn form
        WebElement signInElement = driver. findElement (By.xpath ( "//p[text()='Sign in']"));
        wait.until(ExpectedConditions.visibilityOf(signInElement));

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/register"));

        WebElement signUpLabel = driver.findElement(By.xpath("//*[text() = 'Sign up']"));
        wait.until(ExpectedConditions.visibilityOf(signUpLabel));

        String username = generateUsername();
        WebElement usernameElement = driver.findElement(By.name("username"));
        usernameElement.sendKeys(username);

        String email = username + "@email.com";
        WebElement emailElement = driver.findElement((By.cssSelector("input[type='email']")));
        emailElement.sendKeys(email);

        String birthDate = generateBirthDate();
        WebElement birthDateElement = driver.findElement((By.cssSelector("input[type='date']")));
        birthDateElement.sendKeys(birthDate);

        String password = generatePassword();
        WebElement passwordElement = driver.findElement((By.name("password")));
        passwordElement.sendKeys(password);
        
        WebElement confirmPasswordElement = driver.findElement((By.name("verify-password")));
        confirmPasswordElement.sendKeys(password);

        WebElement publicInfoElement = driver.findElement((By.name("pulic-info")));
        publicInfoElement.sendKeys("test");

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));

        WebElement profileLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-profile")));
        profileLink.click();

        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        Boolean isUserNameDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h2"), username));
        Assert.assertTrue(isUserNameDisplayed, "The user name is not displayed!");
    }

    private String generateUsername() {
        int randomNumber = new Random().nextInt(999999);
        return "test.user-" + String.format("%06d", randomNumber);
    }

    private String generateBirthDate(){
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1930, 2004);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return String.valueOf((gc.get(gc.MONTH) + 1) + gc.get(gc.DAY_OF_MONTH) + gc.get(gc.YEAR));

    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    private String generatePassword(){

        return "Random1";
    }

}
