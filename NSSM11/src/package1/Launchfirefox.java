package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Launchfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.geckodriver", "./exefiles/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		try{
			WebDriver fd=new FirefoxDriver();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--private");
			fd.navigate().to("https://www.facebook.com");
		}catch(Exception e){
			
		}

	}

}
