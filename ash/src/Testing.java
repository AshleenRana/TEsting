import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\14169\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");

        WebElement email=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("passwd"));
        WebElement login=driver.findElement(By.id("SubmitLogin"));

        email.sendKeys("arana51@gmail.com");
        password.sendKeys("Pass123");
        login.submit();

        System.out.println("successfully log in");
    }
}
