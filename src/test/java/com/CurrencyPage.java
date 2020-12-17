package com;

import java.util.*;
import org.openqa.selenium.*;

public class CurrencyPage {

    private WebDriver browser;

    public CurrencyPage(WebDriver ChromeDriver) {
        browser = ChromeDriver;
    }

    public void getEuro() {

        WebElement euro = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[5]/td[1]/span"));
        System.out.println("EURO BUY Rate is " + euro.getText());

    }

    public void getCurrencies() {

        List<WebElement> currencies = browser.findElements(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr/th/p"));
        System.out.println("Searching for currencies");

        for (int i = 0; i<currencies.size(); i++){
            currencies.get(i).getText();
            System.out.println("One of the currencies is: " + currencies.get(i).getText());
        }

    }

}

