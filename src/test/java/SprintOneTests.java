import org.junit.Test;
import org.junit.Before;
import ru.yandex.praktikum.sprintone.MainPageSamokat;
import ru.yandex.praktikum.sprintone.SprintOneSteps;
import ru.yandex.praktikum.sprintone.YandexFrontPage;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;


public class SprintOneTests {
  MainPageSamokat mainPage;
  YandexFrontPage homePage;
  String samokatUrl = "https://qa-scooter.praktikum-services.ru/";
  String yandexUrl = "https://yandex.ru/";

  @Before
  public void beforeSteps() {
    System.setProperty("selenide.browser", "edge");
    mainPage = open(samokatUrl, MainPageSamokat.class);
    SprintOneSteps.closeCookieNotification();
  }

  @Test
  public void checkOrderHappyPassScenarioOne() {
    SprintOneSteps.checkOrderFlow(1, mainPage);
  }

  @Test
  public void checkOrderHappyPassScenarioTwo() { SprintOneSteps.checkOrderFlow(2, mainPage); }

  @Test
  public void checkFAQElement01() { SprintOneSteps.checkElementItems(0, mainPage); }
  @Test
  public void checkFAQElement02() {
    SprintOneSteps.checkElementItems(1, mainPage);
  }
  @Test
  public void checkFAQElement03() {
    SprintOneSteps.checkElementItems(2, mainPage);
  }
  @Test
  public void checkFAQElement04() {
    SprintOneSteps.checkElementItems(3, mainPage);
  }
  @Test
  public void checkFAQElement05() {
    SprintOneSteps.checkElementItems(4, mainPage);
  }
  @Test
  public void checkFAQElement06() {
    SprintOneSteps.checkElementItems(5, mainPage);
  }
  @Test
  public void checkFAQElement07() {
    SprintOneSteps.checkElementItems(6, mainPage);
  }
  @Test
  public void checkFAQElement08() {
    SprintOneSteps.checkElementItems(7, mainPage);
  }

  @Test
  public void checkYandexParentLogoLink() {
    System.out.println(mainPage.getParentUrl(mainPage.yandexLogoButton));
    assertEquals(yandexUrl, mainPage.getParentUrl(mainPage.yandexLogoButton));
  }

  @Test
  public void checkSamokatLogoLink() {
    System.out.println(mainPage.getParentUrl(mainPage.samokatLogoButton));
    assertEquals(samokatUrl, mainPage.getParentUrl(mainPage.samokatLogoButton));
  }
}
