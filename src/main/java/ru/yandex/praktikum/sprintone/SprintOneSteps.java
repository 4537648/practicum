package ru.yandex.praktikum.sprintone;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.sprintone.MainPageSamokat.fillOrderFormFirstScreen;
import static ru.yandex.praktikum.sprintone.MainPageSamokat.fillOrderFormSecondScreen;
import static ru.yandex.praktikum.sprintone.TestData.headings;
import static ru.yandex.praktikum.sprintone.TestData.panels;

public class SprintOneSteps {

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
    fillOrderFormFirstScreen(mainPage);
    fillOrderFormSecondScreen(mainPage);
    mainPage.orderConfirmationYesButton.click();
    mainPage.orderSuccessMessageHeader.isDisplayed();
  }
}