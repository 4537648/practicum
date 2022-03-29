package ru.yandex.praktikum.sprintone;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.sprintone.TestData.headings;
import static ru.yandex.praktikum.sprintone.TestData.panels;


public class SprintOneSteps {
  public static void main(String[] args) {

  }

  public static void closeCookieNotification() {
    if ($(byClassName("App_CookieConsent__1yUIN")).isDisplayed()) {
      $(byClassName("App_CookieButton__3cvqF")).shouldBe(visible).click();
    }
  }
  public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

  public static void checkElementItems(int ItemNumber, MainPageSamokat mainPage) {
    assertEquals(headings[ItemNumber], mainPage.allElementsHeading.get(ItemNumber).getText());
    mainPage.allElementsHeading.get(ItemNumber).click();
    assertEquals(panels[ItemNumber], mainPage.allElementsPanel.get(ItemNumber).shouldBe(visible).getText());
  }

  public static void checkOrderFlow(int Scenario, MainPageSamokat mainPage) {
    switch (Scenario) {
      case 1: {
        mainPage.orderButtonOne.click();
        break;
      }
      case 2: {
        mainPage.orderButtonTwo.click();
        break;
      }
    }
    mainPage.orderFirstName.setValue("тестовое имя");
    mainPage.orderLastName.setValue("фамилия");
    mainPage.orderAddress.setValue("Москва, Кремль-9");
    mainPage.orderUnderground.click();
    mainPage.orderMetroStations.get(SprintOneSteps.getRandomNumber(0, mainPage.orderMetroStations.size())).click();
    mainPage.orderPhone.setValue("8" + SprintOneSteps.getRandomNumber(901,999) + SprintOneSteps.getRandomNumber(1000000,9999999));
    mainPage.orderNextButton.click();
    mainPage.orderDate.click();
    mainPage.datePickerSelected.click();
    mainPage.orderDuration.click();
    mainPage.durationPickerItems.get(SprintOneSteps.getRandomNumber(0, mainPage.durationPickerItems.size())).click();
    switch (SprintOneSteps.getRandomNumber(0,2)) {
      case 0: {
        mainPage.scooterColourBlack.click();;
        break;
      }
      case 1: {
        mainPage.scooterColourGrey.click();;
        break;
      }
      case 2: {
        mainPage.scooterColourBlack.click();;
        mainPage.scooterColourGrey.click();;
        break;
      }
    }
    mainPage.orderComent.setValue("В работу не брать, работает автотест");
    mainPage.orderButtonFinal.click();
    mainPage.orderConfirmationYesButton.click();
    mainPage.orderSuccessMessageHeader.isDisplayed();
    sleep(2000);
    String orderResultString[] = mainPage.orderSuccessMessageText.getText().split(" ");
    orderResultString[2] = orderResultString[2].substring(0, (orderResultString[2].length() - 1));
    int i = Integer.parseInt(orderResultString[2]);
    System.out.println(i);
  }
}