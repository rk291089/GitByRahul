import io.github.bonigarcia.wdm.WebDriverManager;
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
    System.out.println(driver);
    }

    public void terminateBrowser(){
        driver.close();
    }
    
    public void dummyCode() {
    	System.out.println("this is the code writtten in Indian timings by Rk2");
    	System.out.println("US guys commited this code");
    	
    }

    public void addedOnBranch() {
        //added just to check
    }
    public void masterbranch() {
    	//added on gitbyrahul
    }

    // Added on LearIT master branch, and it has been committed


}
