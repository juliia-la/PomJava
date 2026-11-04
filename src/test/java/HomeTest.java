package com.udm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod; // Анотація TestNG
import org.testng.annotations.AfterMethod;  // Анотація TestNG
import org.testng.annotations.Test;

public class HomTest {
    private WebDriver driver;
    private HomePage homePage;

    // Виконується перед КОЖНИМ тестовим методом
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Замініть на реальну URL-адресу вашого сайту
        driver.get("https://example-your-website.com");

        // Створюємо об'єкт нашої сторінки
        homePage = new HomePage(driver);
    }

    // Сам тест для перевірки навігації
    @Test
    public void testNavigation() {
        homePage.clickFields();
        homePage.clickPrices();
        homePage.clickVideoCourses();
        homePage.clickBlog();
        homePage.clickTeam();
        homePage.clickFaq();
    }

    // Виконується після КОЖНОГО тестового методу
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Закриваємо браузер
        }
    }
}} // <- ДОДАНО: Закриває