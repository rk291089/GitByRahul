import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

   public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        BaseClass obj = new BaseClass();
        obj.intBrowser();
        HomePage hp= new HomePage();
        hp.getTitle();
        hp.selectRadioButton();
        hp.selectDropDown();
        hp.selectCheckbox();
        hp.openNewWindow();
        hp.alertExample();
        hp.switchTab();
        hp.alertExample();
        hp.table();
        hp.tableFixedHeader();
        hp.terminateBrowser();

    }

    BaseClass(){
      if(driver==null){

      //    ChromeOptions co = new ChromeOptions();
      //    co.setHeadless(true);
          WebDriverManager.chromedriver().setup();
     //     WebDriver driver = WebDriverManager.chromediver().capabilities(co).create(); 5.1.1
          driver = new ChromeDriver();
      }
    }

    public void intBrowser(){
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void terminateBrowser(){
        driver.close();
    }
    
    public void dummyCode() {
    	System.out.println("this is the code writtten in Indian timings by Rk2");
    	System.out.println("US guys commited this code");
    	
    }

   
}
