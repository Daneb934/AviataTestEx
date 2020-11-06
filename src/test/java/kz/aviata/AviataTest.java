package kz.aviata;

import org.junit.Test;
import org.openqa.selenium.NoAlertPresentException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AviataTest {

    @Test
    public void searchForFlight() {
        open("https://aviata.kz");

        $(byLinkText("Алматы")).click();
        $(byLinkText("Нур-Султан"), 1).click();
        $("#desktop-one-way-from-date").click();
        $(byLinkText("15")).click();
        $(withText("Найти билеты")).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();

            try
            {
                //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
            }
            catch (NoAlertPresentException Ex)
            {
            }

        $(byLinkText("Шымкент"), 1).click();
        $(withText("Найти билеты")).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Актау")).click();
        $(withText("Найти билеты")).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Нур-Султан"),0).click();
        $(byLinkText("Алматы"), 1).click();
        $(withText("Найти билеты")).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Шымкент"), 1).click();
        $(withText("Найти билеты")).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Актау")).click();
        $(withText("Найти билеты")).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Шымкент"),0).click();
        $(byLinkText("Нур-Султан"),1).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Алматы"),1).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }

        $(byLinkText("Стамбул"),1).click();
        sleep(10000);
        $(byXpath("//*[@id=\"app\"]/div/header/div/a/img")).click();
        try
        {
            //Должен лавить всплывашку и закрывать ее но не могу ее поймать и взять id
        }
        catch (NoAlertPresentException Ex)
        {
        }


//        $(byLinkText())
        closeWebDriver();


    }
}
