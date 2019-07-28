package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import  org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		// TODO Auto-generated method stub
		try{
			WebDriver cd=new ChromeDriver();
			ChromeOptions option=new ChromeOptions();
			cd.manage().window().maximize();
			option.addArguments("--start-maximized");
			option.addArguments("--start-Igcognito");
			cd.navigate().to("https://www.seleniumhq.org");
			Thread.sleep(3000);
			cd.navigate().forward();
			Thread.sleep(3000);
			cd.navigate().refresh();
		}catch(Exception e){
			
		}
			
		}
			
		
		
//System.out.println(cd);
	}


