package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browserfactory {
	public static WebDriver  launch(String browsername)
	{
		WebDriver driver=null;
		try
		{
			if(browsername.equalsIgnoreCase("chrome"))
			{
				//System.setProperty("webdriver.chrome.diver","./exefiles/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println("chrome launch");
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
				driver=new FirefoxDriver();
				System.out.println("firefox Launch");
			}

		}catch(Exception e){
		}

		return driver;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Browserfactory.launch("chrome");
		String classname=driver.getClass().getSimpleName();
		System.out.println(classname);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	}

}
