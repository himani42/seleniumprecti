package package1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HandlingWebtables {

	public static void main(String[] args) {
		String headerText="";
		String coldata="";
		// TODO Auto-generated method stub
		WebDriver driver=Browserfactory.launch("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		//By by=By.className("txt");
		//By by1=By.id("ctl00_MainContent_password");
		//WebElement  untextbx=driver.findElement(by);
		//WebElement  untextbx1=driver.findElement(by1);
		//untextbx.sendKeys("Tester");
		///untextbx1.sendKeys("test");.
		driver.findElement(By.className("txt")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.className("button")).click();
		//String rowsxp="//table[@class='SampleTable']//tbody//tr";
		List<WebElement>rows=driver.findElements(By.tagName("tr"));
		//int rowcount=rows.size();
		//System.out.println("total rows :" +rows);
		//int sum=0;

		int rowSize=rows.size();
		for(int i=0;i<1;i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("th"));
			//System.out.println("total colunm:" +cols.size());
			for(int j=1;j<cols.size();j++)
			{
				headerText=headerText+"\t"+cols.get(j).getText();

			}
			//System.out.print(headerText);
		}

		for(int i=0;i<rowSize;i++){
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			//System.out.println("Row:" +i);
			int colcount=cols.size()-2;
			if(colcount>0){
				//System.out.println("total colunm:" +colcount);
				for(int j=0;j<colcount;j++){
					//System.out.println("colunm:" +j);
					coldata=coldata+"\t\t\t"+cols.get(j).getText();
					System.out.println(coldata);
				}
				
			}
			//System.out.println("\n");
			//System.out.println(coldata);
		}
		//System.out.println(coldata);
		//System.out.println(coldata);
		//driver.quit();
		driver.close();
	}
	//String colsxp="//table[@class='SampeTable']//tr["+i+"]/td";
	//List<WebElement>cols=driver.findElements(By.xpath(colsxp));
	//int colcount=cols.size();
	//System.out.println("row"+i+"total colunm:" +colcount);
	//}

}

//for(int j=1;j<=colcount;j++)
//{
//String data="//table[@class='SampleTable']//tr["+i+"]//td["+j+"]";
//String value=driver.findElement(By.xpath(data)).getText();
//System.out.println(value);
//sum=sum+Integer.parseInt(value);
//}
//}
//System.out.println(sum);
//}



