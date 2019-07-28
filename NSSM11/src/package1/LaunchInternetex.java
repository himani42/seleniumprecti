package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LaunchInternetex
{
	public static void main(String []arg)
	{
		
		try{
			System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
			WebDriver d=new InternetExplorerDriver();
		}catch(Exception e){
			
		}

}
}


