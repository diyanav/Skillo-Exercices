package lecture_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.time.Duration;

public class Examples {

    private WebDriver driver;

    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
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

    @DataProvider
    public Object[][] getUsers() {
        File postPicture = new File("src/main/resources/upload/huskey-icon.jpeg");
        String postCaption = "Test caption";

        return new Object[][]{
                {"test.user-1234", "test.user-1234", "test.user-1234", postPicture, postCaption}
        };
    }

    @Test(dataProvider = "getUsers")
    public void testCreatePost(String user, String password, String name, File file, String caption) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.login(user, password);

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isUrlLoaded(), "The Home Page is not loaded!");

        Header header = new Header(driver);
        header.clickNewPost();

        PostPage postPage = new PostPage(driver);
        Assert.assertTrue(postPage.isUrlLoaded(), "The Post URL is not correct!");

        postPage.uploadPicture(file);
        Assert.assertTrue(postPage.isImageVisible(), "The image is not visible!");
        String imageName = postPage.getImageName();
        Assert.assertEquals(file.getName(), imageName, "The image name is incorrect!");

        postPage.populatePostCaption(caption);

        postPage.createPost();

        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.isUrlLoaded(), "The Profile URL is not correct!");

        Assert.assertEquals(profilePage.getPostCount(), 1, "The number is not correct!");

    }
}
