package ru.yandex.praktikum.sprintone;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YandexFrontPage {

  @FindBy(how = How.XPATH, using = ".//*[@class='home-logo__default']")
  private SelenideElement yandexTitle;

  @FindBy(how = How.XPATH, using = ".//a[@href='https://www.yandex.ru']")
  private SelenideElement yandexCaptcha;

}