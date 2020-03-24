package com.cts.bmwtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;
import com.cts.bmwpages.HomePage;
import com.cts.bmwpages.ModelsPage;
import com.cts.bmwpages.SeriesPage;
import com.cts.utils.ExcelUtils;

public class PhpTravelsTest extends LaunchWebDriver {

	@Test
	public void PhpTravels() throws IOException {
		HomePage.clickOnModels(driver);
		ModelsPage.clickOnSeries(driver);
		ModelsPage.clicOnImage(driver);
		SeriesPage.clickOnTechnical(driver);

		String actualText = SeriesPage.getCurrentText(driver);
		actualText = actualText.substring(0);
		System.out.println(actualText);
		actualText = actualText.substring(0, 3);
		System.out.println(actualText);
		int hp = Integer.parseInt(actualText);
		if (hp < 500) {
			Assert.fail("failed");
		} else {
			System.out.println("passed");
		}
		ExcelUtils.WriteIntoExcel("BMWApplication/excel", "BMWdata", 0, 0, "dose not meet my requirements");
	}
}
