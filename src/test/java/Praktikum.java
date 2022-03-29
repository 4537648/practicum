import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;

public class Praktikum {

  private WebDriver driver;

  @Test
  public void test() {
    // Создаём драйвер для браузера Chrome
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver();
    // Открой нужную страницу
    driver.get("https://www.yandex.ru");
  }

  @After
  public void teardown() {
    // Закрой браузер
    driver.quit();
  }
}