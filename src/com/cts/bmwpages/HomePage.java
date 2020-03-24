package com.cts.bmwpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private static By modelsLoc =By.xpath("//a[@style='height: 99px;']");
	public static void clickOnModels(WebDriver driver)
	{
		driver.findElement(modelsLoc).click();
	}

}
