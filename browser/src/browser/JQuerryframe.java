package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerryframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String Google_url="https://www.google.com";
		String Application_url="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Google_url);
		driver.get(Application_url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.navigate().back();
		By FrameLocator=By.className("demo-frame");
		WebElement frame=driver.findElement(FrameLocator);
		driver.switchTo().frame(frame);
		By draggableL=By.id("draggable");
		WebElement draggable =driver.findElement(draggableL);
		String draggabletext=draggable.getText();
		System.out.println("Drag to my Target :-"+draggabletext);
		By droppableL=By.id("droppable");
		WebElement droppable =driver.findElement(droppableL);
		String droppabletext=droppable.getText();
		System.out.println("Drop to here :-"+droppabletext);
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent();
		By ResizableL=By.linkText("Resizable");
		WebElement Resizable =driver.findElement(ResizableL);
		Resizable.click();
		action.clickAndHold().moveByOffset(150,150).release().build().perform();
		

	}

}
