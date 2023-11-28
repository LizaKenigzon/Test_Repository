import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver wd1;

    @Test
    public void test(){
        wd1 = new ChromeDriver();
        wd1.get("https://georgian-airways.com/ru");
    }
}
