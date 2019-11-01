package io.github.notsandy.librarybooking;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class librarybooking {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Opens the Website
		driver.navigate().to("https://booking.lib.buffalo.edu/reserve/silverman");
		//driver.manage().window().maximize();
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[11]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		WebElement continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		WebElement first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Sandy");
		WebElement last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Liu");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sliu55@buffalo.edu");
		WebElement submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		WebElement another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[13]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("QiQi");
		last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Chen");
		email = driver.findElement(By.id("email"));
		email.sendKeys("qchen42@buffalo.edu");
		submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[15]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Tommy");
		last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Yuan");
		email = driver.findElement(By.id("email"));
		email.sendKeys("tommyyua@buffalo.edu");
		submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[17]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Derek");
		last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Ng");
		email = driver.findElement(By.id("email"));
		email.sendKeys("dng8@buffalo.edu");
		submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[19]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Steven");
		last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Liu");
		email = driver.findElement(By.id("email"));
		email.sendKeys("sliu57@buffalo.edu");
		submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[21]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Geoffrey");
		last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Chen");
		email = driver.findElement(By.id("email"));
		email.sendKeys("gchen37@buffalo.edu");
		submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		//Time Slot Page
		driver.findElement(By.cssSelector("#eq-time-grid > div.fc-toolbar.fc-header-toolbar > div.fc-left > div > button.fc-next-button.fc-button.fc-button-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"eq-time-grid\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[9]/td/div/div/a[23]")).click();
		driver.findElement(By.cssSelector("#submit_times")).click();
		//Confirm Room Page
		continue_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#terms_accept")));
		continue_button.click();
		//Form Page
		first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Dennis");
		last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys("Lam");
		email = driver.findElement(By.id("email"));
		email.sendKeys("dlam3@buffalo.edu");
		submit_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#btn-form-submit")));
		submit_button.click();
		//Make Another Booking Page
		another_button = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#s-lc-eq-success-buttons > a")));
		another_button.click();
		
		//===============================//
		
		driver.quit();
	}
}
