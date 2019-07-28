package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestIstqb {

	public static void main(String[] args) {
		WebDriver driver=Browserfactory.launch("chrome");
		driver.get("https://istqb.in/about-us/affiliates/affiliated-companies");

		WebElement companyList = driver.findElement(By.cssSelector("#tmTopD > div > section > div > div > div > ul"));

		List<WebElement> links = companyList.findElements(By.tagName("li"));
		System.out.println(links.size());
		for(int i=1;i<=1;i++){
			driver.findElement(By.cssSelector("#tmTopD > div > section > div > div > div > ul > li:nth-child("+i+") > a")).click();
			WebElement companyName = driver.findElement(By.cssSelector("#tmMainBody > div > div > div > main > div:nth-child(3)"));
			List<WebElement> compLinks = companyName.findElements(By.tagName("article"));//uk-grid
			//System.out.println("comp size"+compLinks.get(0).getText());
			System.out.println(getCompBy(i)+"::\n");
			for(int j=0;j<compLinks.size();j++){
				System.out.println(compLinks.get(j).getText());
			}
		}

		//driver.close();
	}
	static  String getCompBy(int i){
		String compBy = "";
		switch(i){
		case	1:
		compBy = "Company Name Start from A";
		break;
		case	2:
		compBy = "Company Name Start from B";
		break;
		case	3:
		compBy = "Company Name Start from C";
		break;
		case	4:
		compBy = "Company Name Start from D";
		break;
		case	5:
		compBy = "Company Name Start from E";
		break;
		case	6:
		compBy = "Company Name Start from F";
		break;
		case	7:
		compBy = "Company Name Start from G";
		break;
		case	8:
		compBy = "Company Name Start from H";
		break;case	9:
		compBy = "Company Name Start from I";
		break;case	10:
		compBy = "Company Name Start from J";
		break;case	11:
		compBy = "Company Name Start from K";
		break;case	12:
		compBy = "Company Name Start from L";
		break;case	13:
		compBy = "Company Name Start from M";
		break;case	14:
		compBy = "Company Name Start from N";
		break;
		case	15:
		compBy = "Company Name Start from O";
		break;
		case	16:
		compBy = "Company Name Start from P";
		break;
		case	17:
		compBy = "Company Name Start from Q";
		break;
		case	18:
		compBy = "Company Name Start from R";
		break;
		case	19:
		compBy = "Company Name Start from S";
		break;
		case	20:
		compBy = "Company Name Start from T";
		break;
		case	21:
		compBy = "Company Name Start from U";
		break;
		case	22:
		compBy = "Company Name Start from V";
		break;
		case	23:
		compBy = "Company Name Start from W";
		break;
		case	24:
		compBy = "Company Name Start from X";
		break;
		case	25:
		compBy = "Company Name Start from Y";
		break;
		case	26:
		compBy = "Company Name Start from Z";
		break;


		}
		return compBy;
}

}
