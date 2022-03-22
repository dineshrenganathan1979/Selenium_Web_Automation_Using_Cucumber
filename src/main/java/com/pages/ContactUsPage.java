package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	
	private WebDriver driver;
	
	
	// 1. By Locators:
	private By subjectHeading = By.xpath("//select[@id='id_contact']");
	private By email = By.xpath("//input[@id='email']");
	private By orderRef = By.id("id_order");
	private By messageText = By.xpath("//textarea[@id='message']");
	private By sendButton = By.id("submitMessage");
	private By successMessg = By.cssSelector("div#center_column p");

	// 2. Constructor of the page class:
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	public String getContactUsPageTitle() {
		return driver.getTitle();
	}
	
	public void fillContactUsForm(String heading, String emailId, String orderReference, String message) {
		Select select = new Select(driver.findElement(subjectHeading));
		select.selectByVisibleText(heading);
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(orderRef).sendKeys(orderReference);
		driver.findElement(messageText).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(sendButton).click();
	}
	
	public String getSuccessMessg() {
		return driver.findElement(successMessg).getText();
	}
	
	
	
	

}
