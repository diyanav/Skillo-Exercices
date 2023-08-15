package lecture_15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exercices {

    private WebDriver driver;

    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @BeforeMethod
    protected final void setUpTest() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().setPosition(new Point(2000, 0));
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    protected final void tearDownTest() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

    @Test
    public void testCheckBox() {
        driver.get("https://demoqa.com/checkbox");

        WebElement label = driver.findElement(By.cssSelector("[for='tree-node-home']"));
        label.click();

        WebElement checkbox = driver.findElement(By.id("tree-node-home"));
        Assert.assertTrue(checkbox.isSelected());

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(), "You have selected :\n" + "home\n" + "desktop\n" +
                "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" +
                "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" +
                "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFil");

        label.click();
        Assert.assertFalse(checkbox.isSelected());

    }

    @Test
    public void testCheckBoxes() {
        driver.get("https://demoqa.com/checkbox");

        WebElement homeExpandArrow = driver.findElement(By.xpath("//*[@for='tree-node-home']/preceding-sibling::button"));
        homeExpandArrow.click();

        WebElement documentsLabel = driver.findElement(By.cssSelector("[for='tree-node-documents']"));
        documentsLabel.click();
        WebElement documentsCheckBox = driver.findElement(By.id("tree-node-documents"));
        Assert.assertTrue(documentsCheckBox.isSelected());

        WebElement downloadsLabel = driver.findElement(By.cssSelector("[for='tree-node-downloads']"));
        downloadsLabel.click();
        WebElement downloadsCheckBox = driver.findElement(By.id("tree-node-downloads"));
        Assert.assertTrue(downloadsCheckBox.isSelected());

        Assert.assertTrue(documentsCheckBox.isSelected());

        WebElement checkbox = driver.findElement(By.id("tree-node-home"));
        Assert.assertFalse(checkbox.isSelected());

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(), "documents\n" + "workspace\n" + "react\n" +
                "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" +
                "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile");

    }

    @Test
    public void testRadioButton() {
        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadioButtonLabel = driver.findElement(By.cssSelector("[for='yesRadio']"));
        yesRadioButtonLabel.click();
        Assert.assertTrue(yesRadioButtonLabel.isSelected());

        String actualText = driver.findElement(By.className("mt-3")).getText();
        Assert.assertEquals(actualText, "You have selected Yes");

        WebElement impressiveRadioButtonLabel = driver.findElement(By.cssSelector("[for='impressiveRadio']"));
        impressiveRadioButtonLabel.click();
        Assert.assertTrue(impressiveRadioButtonLabel.isSelected());

        Assert.assertFalse(yesRadioButtonLabel.isSelected());

        actualText = driver.findElement(By.className("mt-3")).getText();
        Assert.assertEquals(actualText, "You have selected Impressive");

        WebElement noRadioButtonLabel = driver.findElement(By.cssSelector("[for='noRadio']"));
        noRadioButtonLabel.click();

        if (noRadioButtonLabel.isEnabled()) {
            Assert.assertTrue(noRadioButtonLabel.isSelected());
        } else {
            Assert.assertFalse(noRadioButtonLabel.isSelected());
        }

    }

    @Test
    public void testHover() {
        driver.get("https://demoqa.com/tool-tips");
        WebElement button = driver.findElement(By.id("toolTipButton"));

        Actions actions = new Actions(driver);
        actions.moveToElement(button);

        String tooltipButton = driver.findElement(By.id("buttonToolTip")).getText();
        Assert.assertEquals(tooltipButton, "You hovered over the Button");
    }

    @Test
    public void testAlert() {
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        Assert.assertEquals(alertButton.getText(), "Click me");
        alertButton.click();

        Alert alert = driver.switchTo().alert();

        String actualAlertText = alert.getText();
        Assert.assertEquals(actualAlertText, "You clicked a button");
        alert.accept();

        Assert.assertEquals(alertButton.getText(), "Click me");
    }

    @Test
    public void testAlert() {
        driver.get("https://demoqa.com/alerts");

        WebElement promptBoxButton = driver.findElement(By.id("promptButton"));
        promptBoxButton.click();

        String name = "Diyana";

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();

        String actualText = driver.findElement(By.id("promptResult")).getText();
        String expectedText = "You entered " + name;
        Assert.assertEquals(actualText, expectedText);
    }
}
