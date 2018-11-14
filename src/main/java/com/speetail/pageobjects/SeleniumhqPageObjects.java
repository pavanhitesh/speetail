package com.speetail.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumhqPageObjects {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(linkText="Download")
	WebElement lnkDownload;

	@FindBy(linkText="Documentation")
	WebElement lnkDocumentation;

	public SeleniumhqPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 60);
	}


	public void clickDownloadLnk() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		lnkDownload.click();
	}

	public void clickDocumentationLnk() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Documentation")));
		lnkDocumentation.click();

	}
}
