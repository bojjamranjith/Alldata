import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser{
   public static void main(String[] args) {
      //path of chromedriver.exe set
      System.setProperty("webdriver.chrome.driver",
         "C:\\Browser Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //launch URL
      driver.get("https://www.facebook.com");
      WebElement uname=driver.findElement(By.id("email"));
      uname.sendKeys("9989200381");
      WebElement password=driver.findElement(By.id("pass"));
      password.sendKeys("Ranjith@123");
      driver.findElement(By.id("u_0_5_Jd")).click();
      
      System.out.println("Page title is: " + driver.getTitle());
      
      
   }
}
