package com.udm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // element
    private By fieldsButton = By.xpath("//*[@id='nav']/div/nav/span/a");
    private By prisecButton = By.xpath("//*[@id='nav']/div/nav/a[1]");
    private By videoCoursesButton = By.xpath("//*[@id='nav']/div/nav/a[2]");
    private By blogButton = By.xpath("//*[@id='nav']/div/nav/a[3]");
    private By teamButton = By.xpath("//*[@id='nav']/div/nav/a[4]");
    private By faqButton = By.xpath("//*[@id='nav']/div/nav/a[5]");

    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // method click
    private void clickButton(By locator) {
        driver.findElement(locator).click();
    }

    // element click
    public void clickFields() {
        clickButton(fieldsButton);
    }

    public void clickPrices() {
        clickButton(prisecButton);
    }

    public void clickVideoCourses() {
        clickButton(videoCoursesButton);
    }

    public void clickBlog() {
        clickButton(blogButton);
    }

    public void clickTeam() {
        clickButton(teamButton);
    }

    public void clickFaq() {
        clickButton(faqButton);
    }
}