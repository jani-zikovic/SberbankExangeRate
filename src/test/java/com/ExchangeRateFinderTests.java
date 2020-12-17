package com;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ExchangeRateFinderTests {

    private WebDriver browser;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        browser = new ChromeDriver();
    }

    @Test
    public void FindEuroRate() {
        browser.navigate().to("https://www.sberbank.cz/cs-cz/");
        System.out.println("Going to Sberbank Homepage");

        WebElement exchangeRateLink = browser.findElement(new By.ByXPath("/html/body/footer/div/div/div[1]/div/div[1]/div[1]/a"));
        System.out.println("Searching for Exchange Rate link");

        exchangeRateLink.click();
        System.out.println("Clicking on the Exchange Rate link");

        CurrencyPage CurrencyPage = new CurrencyPage(browser);
        CurrencyPage.getEuro();
    }

    @Test
    public void FindCurrencies() {
        browser.navigate().to("https://www.sberbank.cz/cs-cz/poplatky-a-sazby/kurzy");
        System.out.println("Going to Exchange Rate Page");

        CurrencyPage CurrencyPage = new CurrencyPage(browser);
        CurrencyPage.getCurrencies();
    }

    @Test
    public void FindExchangeRate() {
        browser.navigate().to("https://www.sberbank.cz/cs-cz/poplatky-a-sazby/kurzy");
        System.out.println("Going to Exchange Rate Page");

        GetCurrencyBuyRatePage GetCurrencyBuyRatePage = new GetCurrencyBuyRatePage(browser);

        GetCurrencyBuyRatePage.getRates("AUD");
        System.out.println("Getting rate for AUD");
    }

    @After
    public void CleanUp() {
        browser.quit();
    }
}
