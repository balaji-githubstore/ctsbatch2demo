package com.cts.bmwpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeriesPage {
	private static By technicalLoc = By.xpath(" //a[contains(text(),' Technical Data ')]");
	private static By textLoc =By.xpath("//div[contains(text(),'195 (265) / 4,000')]");
	public static void clickOnTechnical(WebDriver driver)
	{
		driver.findElement(technicalLoc).click();
		
	}
	public static String getCurrentText(WebDriver driver){
		String actualText = driver.findElement(textLoc).getText();
		System.out.println("actualText");
		return actualText;
	}

}
