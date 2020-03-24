package com.cts.alaska;

import java.util.List;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;

public class AlaskaTest extends LaunchWebDriver {
	@Test
	public void alaska() throws InterruptedException {

		//check on whale watching tour link
		//homepage
		List<WebElement> listOfEle = driver.findElements(By.xpath("//a[text()='whale watching tour']"));
		int countOfListOfEle = listOfEle.size();
		if (countOfListOfEle > 0) {
			System.out.println("whale watiching is present");

		} else {
			System.out.println("not present");
		}

		Thread.sleep(5000);
		
		driver.findElement(By.id("rciHeaderOpenSidenav")).click();
		driver.findElement(By.id("rciHeaderSideNavMenu-1")).click();
		driver.findElement(By.id("rciHeaderCloseSidenav")).click();

		//findacurisepage
		driver.findElement(By.id("rciSearchHeaderIcon")).click();
		driver.findElement(By.id("rciSearchInput")).sendKeys("ships");
		driver.findElement(By.id("rciSearchInputIcon")).click();

		Thread.sleep(5000);
		//searchpage
		driver.findElement(By.xpath("//div[contains(text(),'Next Page')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Rhapsody of the Seas')]")).click();

		//WebDriverWait wait =new WebDriverWait(driver,50);
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='DECK PLANS']"))));

		
		//driver.findElement(By.xpath("//a[text()='DECK PLANS']")).click();
		Thread.sleep(5000);
		//RhapsodySeaPage
		 WebElement ele= driver.findElement(By.xpath("//a[text()='DECK PLANS']"));

		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", ele);
		 
		 
		 //Deckplanspage
		Thread.sleep(5000);
		driver.findElement(By.id("deckDropdown")).click();
		// driver.findElement(By.xpath("//option[text()='Deck Two']")).click();
		driver.findElement(By.xpath("//option[text()='Deck Eight']")).click();

		// Select x = new Select()

		List<WebElement> listOfElements = driver.findElements(By.xpath("//h4[text()='Royal Suite - 1 Bedroom']"));
		int countOfListOfElements = listOfElements.size();
		if (countOfListOfElements > 0) {
			System.out.println("Royal Suite present");
		} else {
			System.out.println("Royal Suite not present");
		}

		
		//@Test
		if (driver.getPageSource().toLowerCase().contains("whale watching")
				&& driver.getPageSource().toLowerCase().contains("royal suite")) {
			System.out.println("passed");
		} else {
			Assert.fail("Does not meet the requirements");
		}

	}

}
