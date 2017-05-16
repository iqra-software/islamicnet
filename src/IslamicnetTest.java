
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IslamicnetTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		String[] array;
		array = new String[10];
		array[0] = "http://qurantutoring.com/islamicnet/iqra/iqra.html"; // IslamicNet> Iqra
		array[1] = "http://qurantutoring.com/islamicnet/sources/sources.html"; // IslamicNet > Sources
		array[2] = "http://qurantutoring.com/islamicnet/pillars/pillars.html"; // IslamicNet > Pillars
		array[3] = "http://qurantutoring.com/islamicnet/structure/structure.html";  // IslamicNet > Structure
		array[4] = "http://qurantutoring.com/islamicnet/knowledgebase/knowledgebase.html";  // IslamicNet > Knowledgebase
		
		
		for(int n=0; n<=0; n++){
	    
	    for(int x=0; x<=4; x++){
	    System.setProperty("webdriver.chrome.driver", "C:\\softwares\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
	    driver.get(array[x]);	 
		switch (array[x])
	    
	    //driver.get("http://iqra.software/languages/java/list/definitions.html");	 
	    //switch ("http://iqra.software/languages/java/list/definitions.html")        	
	     
	    {
        
	    case "http://qurantutoring.com/islamicnet/iqra/iqra.html":  // IslamicNet> Iqra : Case 0
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("quran-tutoring")).click();	    	
	    	for(int i= 0; i <= 2; i++){
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	    	}
	    	break;
        
	    case "http://qurantutoring.com/islamicnet/sources/sources.html": // IslamicNet > Sources : Case 1
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("quran")).click();	
	        for(int i= 0; i <= 2; i++){
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);  
	        }
	        break;
	        
	    case "http://qurantutoring.com/islamicnet/pillars/pillars.html": // IslamicNet > Pillars: Case 2
	        for(int i= 0; i <= 2; i++){
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	        }
	        break;
	        
	        
	    case "http://qurantutoring.com/islamicnet/structure/structure.html":  // IslamicNet > Structure : Case 3
	        for(int i= 0; i <= 2 ; i++){
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	        }
	        break;   
	        
	    case "http://qurantutoring.com/islamicnet/knowledgebase/knowledgebase.html":  // IslamicNet > Knowledgebase : Case 4
	        for(int i= 0; i <= 2; i++){
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
	        }
	        break;           
	        
        
        default: 
        for(int i= 0; i <= 2; i++){
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
        }
        
        }   
	    	    
	    driver.quit();
	    }    
	     
	    
		}

		
		
		
	}

}
