package com.cts.bmwpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ModelsPage {
	private static By sevenSeriesLoc=By.linkText("7");
	private static By imageLoc =By.xpath("//img[@alt='Not found']");

	public static void clickOnSeries(WebDriver driver){
		driver.findElement(sevenSeriesLoc).click();
	}
public static void clicOnImage(WebDriver driver){
		WebElement findEle = driver.findElement(imageLoc );
	Actions action = new Actions(driver);
      action.moveToElement(findEle).pause(5000).doubleClick().build().perform();
	}
}
