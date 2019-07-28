package package1;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigation {

	public static void main(String[] args) throws InterruptedException{
	
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
ChromeDriver cd= new ChromeDriver();
cd.navigate().to("https://accounts.google.com/signin/v2/sl/pwd?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
Thread.sleep(3000);
cd.navigate().back();

Thread.sleep(3000);
cd.navigate().forward();
cd.navigate().back();
Thread.sleep(3000);
cd.navigate().refresh();
	}

}
