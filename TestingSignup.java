
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingSignup {

    public static void main(String []args) throws InterruptedException {
  
      System.setProperty("webdriver.chrome.driver", "/home/webonise/workspace/Testing/Resource/chromedriver");
      WebDriver driver;
       
      driver = new ChromeDriver();
          
      driver.get("https://web-stg.gofaceoff.com/");
       
      WebElement signup = driver.findElement(By.xpath("//a[@href='/signup']"));
      signup.click();
        
      WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
      email.sendKeys("prajaktap422@gmail.com");
           
      WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
      username.clear();
      username.sendKeys("prajaktapa");
        
      WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
      password.clear();
      password.sendKeys("prajaktapa123");
        		
      WebElement firsname = driver.findElement(By.xpath("//input[@name='first_name']"));
      firsname.clear();
      firsname.sendKeys("prajakta");
      
      WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
      lastname.clear();
      lastname.sendKeys("patil");
            
      WebElement dateOfBirth = driver.findElement(By.xpath("//input[@name='dateOfBirth']"));
      dateOfBirth.clear();
      dateOfBirth.sendKeys("08/22/1993");
      
      WebElement state = driver.findElement(By.xpath("//*[ @name = 'state']"));
      Select selectcountry = new Select(state);
      selectcountry.selectByVisibleText("LA");
      
      WebElement referralCode = driver.findElement(By.xpath("//*[ @name = 'referralCode']"));
      referralCode.clear();
      referralCode.sendKeys("ian");   
      
      WebElement signup1 = driver.findElement(By.xpath("//*[ @type='submit']"));
      signup1.click();
      
      Thread.sleep(10000);
      WebElement skip = driver.findElement(By.xpath("//a[ text()='Skip']"));
      skip.click();
      
      WebElement log_pref = driver.findElement(By.xpath("//span[@class = 'dropDownIcon']"));
      log_pref.click();
      
      WebElement logout = driver.findElement(By.xpath("//a[ text()='Log Out']"));
      logout.click();	
    }
}
