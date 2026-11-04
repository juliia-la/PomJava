package com.udm;

import io.github.bonigarcia.wdm.WebDriverManager; // Додали імпорт менеджера
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomeTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skillklan.com.ua");
        homePage = new HomePage(driver);


    }

    @Test
    public void testNavigation() {
        homePage.clickFields();       // 01 Напрямки
        homePage.clickPrices();       // 02 Вартість
        homePage.clickBlog();         // 04 Блог
        homePage.clickFaq();          // 07 FAQ (Питання)
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}