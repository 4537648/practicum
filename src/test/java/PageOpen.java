import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class PageOpen {

  @Test
  public void openPage() {
    // Открой браузер Chrome
    // Перейди на страницу тестового стенда
    // Закрой браузер
    open("https://qa-mesto.praktikum-services.ru/");
  }
}