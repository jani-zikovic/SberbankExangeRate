package com;

import org.openqa.selenium.*;

public class GetCurrencyBuyRatePage {

    private WebDriver browser;

    GetCurrencyBuyRatePage(WebDriver ChromeDriver) {
        browser = ChromeDriver;
    }

    public Currency currency;

    public GetCurrencyBuyRatePage(Currency currency) {
        this.currency = currency;
    }

    public void currencyRates() {
        switch (currency) {
            case AUD:
                WebElement audRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[2]/td[1]/span"));
                System.out.println("Searching for AUD BUY Rate element");

                String aud = audRate.getText();
                System.out.println("AUD BUY Rate is " + aud);
                break;

            case CAD:
                WebElement cadRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[3]/td[1]/span"));
                System.out.println("Searching for CAD BUY Rate element");

                String cad = cadRate.getText();
                System.out.println("CAD BUY Rate is " + cad);
                break;

            case DKK:
                WebElement dkkRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/span"));
                System.out.println("Searching for DKK BUY Rate element");

                String dkk = dkkRate.getText();
                System.out.println("DKK BUY Rate is " + dkk);
                break;

            case EUR:
                WebElement eurRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[5]/td[1]/span"));
                System.out.println("Searching for EUR BUY Rate element");

                String eur = eurRate.getText();
                System.out.println("EUR BUY Rate is " + eur);
                break;

            case GBP:
                WebElement gbpRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[6]/td[1]/span"));
                System.out.println("Searching for GBP BUY Rate element");

                String gbp = gbpRate.getText();
                System.out.println("GBP BUY Rate is " + gbp);
                break;

            case HRK:
                WebElement hrkRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[7]/td[1]/span"));
                System.out.println("Searching for HRK BUY Rate element");

                String hrk = hrkRate.getText();
                System.out.println("HRK BUY Rate is " + hrk);
                break;

            case HUF:
                WebElement hufRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[8]/td[1]/span"));
                System.out.println("Searching for HUF BUY Rate element");

                String huf = hufRate.getText();
                System.out.println("HUF BUY Rate is " + huf);
                break;

            case CHF:
                WebElement chfRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[9]/td[1]/span"));
                System.out.println("Searching for CHF BUY Rate element");

                String chf = chfRate.getText();
                System.out.println("CHF BUY Rate is " + chf);
                break;

            case JPY:
                WebElement jpyRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[10]/td[1]/span"));
                System.out.println("Searching for JPY BUY Rate element");

                String jpy = jpyRate.getText();
                System.out.println("JPY BUY Rate is " + jpy);
                break;

            case NOK:
                WebElement nokRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[11]/td[1]/span"));
                System.out.println("Searching for NOK BUY Rate element");

                String nok = nokRate.getText();
                System.out.println("NOK BUY Rate is " + nok);
                break;

            case PLN:
                WebElement plnRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[12]/td[1]/span"));
                System.out.println("Searching for PLN BUY Rate element");

                String pln = plnRate.getText();
                System.out.println("PLN BUY Rate is " + pln);
                break;

            case RON:
                WebElement ronRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[13]/td[1]/span"));
                System.out.println("Searching for RON BUY Rate element");

                String ron = ronRate.getText();
                System.out.println("RON BUY Rate is " + ron);
                break;

            case RUB:
                WebElement rubRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[14]/td[1]/span"));
                System.out.println("Searching for RUB BUY Rate element");

                String rub = rubRate.getText();
                System.out.println("RUB BUY Rate is " + rub);
                break;

            case SEK:
                WebElement sekRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[15]/td[1]/span"));
                System.out.println("Searching for SEK BUY Rate element");

                String sek = sekRate.getText();
                System.out.println("SEK BUY Rate is " + sek);
                break;

            case TRY:
                WebElement tryRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[16]/td[1]/span"));
                System.out.println("Searching for TRY BUY Rate element");

                String trr = tryRate.getText();
                System.out.println("TRY BUY Rate is " + trr);
                break;

            case USD:
                WebElement usdRate = browser.findElement(new By.ByXPath("//*[@id=\"main\"]/div/div[1]/div/div[3]/table/tbody/tr[17]/td[1]/span"));
                System.out.println("Searching for USD BUY Rate element");

                String usd = usdRate.getText();
                System.out.println("USD BUY Rate is " + usd);
                break;
        }
    }

    public void getRates(String currency) {
        GetCurrencyBuyRatePage AUD = new GetCurrencyBuyRatePage(Currency.AUD);
        AUD.currencyRates();

        GetCurrencyBuyRatePage CAD = new GetCurrencyBuyRatePage(Currency.CAD);
        CAD.currencyRates();

        GetCurrencyBuyRatePage DKK = new GetCurrencyBuyRatePage(Currency.DKK);
        DKK.currencyRates();

        GetCurrencyBuyRatePage EUR = new GetCurrencyBuyRatePage(Currency.EUR);
        EUR.currencyRates();

        GetCurrencyBuyRatePage GBP = new GetCurrencyBuyRatePage(Currency.GBP);
        GBP.currencyRates();

        GetCurrencyBuyRatePage HRK = new GetCurrencyBuyRatePage(Currency.HRK);
        HRK.currencyRates();

        GetCurrencyBuyRatePage HUF = new GetCurrencyBuyRatePage(Currency.HUF);
        HUF.currencyRates();

        GetCurrencyBuyRatePage CHF = new GetCurrencyBuyRatePage(Currency.CHF);
        CHF.currencyRates();

        GetCurrencyBuyRatePage JPY = new GetCurrencyBuyRatePage(Currency.JPY);
        JPY.currencyRates();

        GetCurrencyBuyRatePage NOK = new GetCurrencyBuyRatePage(Currency.NOK);
        NOK.currencyRates();

        GetCurrencyBuyRatePage PLN = new GetCurrencyBuyRatePage(Currency.PLN);
        PLN.currencyRates();

        GetCurrencyBuyRatePage RON = new GetCurrencyBuyRatePage(Currency.RON);
        RON.currencyRates();

        GetCurrencyBuyRatePage RUB = new GetCurrencyBuyRatePage(Currency.RUB);
        RUB.currencyRates();

        GetCurrencyBuyRatePage SEK = new GetCurrencyBuyRatePage(Currency.SEK);
        SEK.currencyRates();

        GetCurrencyBuyRatePage TRY = new GetCurrencyBuyRatePage(Currency.TRY);
        TRY.currencyRates();

        GetCurrencyBuyRatePage USD = new GetCurrencyBuyRatePage(Currency.USD);
        USD.currencyRates();
    }
}

