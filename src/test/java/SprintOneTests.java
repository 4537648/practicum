import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.junit.Before;
import ru.yandex.praktikum.pageobjects.MainPageSamokat;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class SprintOneTests {

  MainPageSamokat mainPage;
  String samokatUrl = "https://qa-scooter.praktikum-services.ru/";
  String yandexUrl = "https://yandex.ru/";

  @Before
  public void beforeSteps() {
    System.setProperty("selenide.browser", "edge");
    mainPage = open(samokatUrl, MainPageSamokat.class);
    WebDriverRunner.getWebDriver().manage().window().maximize();
    MainPageSamokat.closeCookieNotification();
  }

  @Test
  public void checkOrderHappyPassScenarioHeaderButton() {
    MainPageSamokat.checkOrderFlow(1, mainPage);
  }

  @Test
  public void checkOrderHappyPassScenarioBodyButton() {
    MainPageSamokat.checkOrderFlow(2, mainPage);
  }

  @Test
  public void checkFAQElement01() {
    MainPageSamokat.checkElementItems(0, mainPage);
  }

  @Test
  public void checkFAQElement02() {
    MainPageSamokat.checkElementItems(1, mainPage);
  }

  @Test
  public void checkFAQElement03() {
    MainPageSamokat.checkElementItems(2, mainPage);
  }

  @Test
  public void checkFAQElement04() {
    MainPageSamokat.checkElementItems(3, mainPage);
  }

  @Test
  public void checkFAQElement05() {
    MainPageSamokat.checkElementItems(4, mainPage);
  }

  @Test
  public void checkFAQElement06() {
    MainPageSamokat.checkElementItems(5, mainPage);
  }

  @Test
  public void checkFAQElement07() {
    MainPageSamokat.checkElementItems(6, mainPage);
  }

  @Test
  public void checkFAQElement08() {
    MainPageSamokat.checkElementItems(7, mainPage);
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