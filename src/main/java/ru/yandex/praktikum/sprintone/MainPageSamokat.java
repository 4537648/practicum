package ru.yandex.praktikum.sprintone;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class MainPageSamokat {

  // кнопка Логотип Яндекс
  @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
  public SelenideElement yandexLogoButton;

  // кнопка Логотип Самокат
  @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
  public SelenideElement samokatLogoButton;

  // кнопка Заказать в шапке
  @FindBy(how = How.XPATH, using = "//div[@class='Header_Nav__AGCXC']//button[text()='Заказать']")
  public SelenideElement orderButtonOne;

  // кнопка Заказать в теле страницы
  @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Button_Middle__1CSJM")
  public SelenideElement orderButtonTwo;

  // кнопка Проверки Статуса Заказа
  @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
  public SelenideElement statusButton;

  // массив заголовков элементов блока "Вопросы о важном"
  @FindBy(how = How.XPATH, using = ".//*[@class='Home_FAQ__3uVm4']//*[@class='accordion__item']//*[@class='accordion__heading']/div")
  public List<SelenideElement> allElementsHeading;

  // массив заголовков элементов блока "Вопросы о важном"
  @FindBy(how = How.XPATH, using = ".//*[@class='Home_FAQ__3uVm4']//*[@class='accordion__item']//*[@class='accordion__panel']/p")
  public List<SelenideElement> allElementsPanel;


  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
  public SelenideElement orderFirstName;

  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
  public SelenideElement orderLastName;

  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
  public SelenideElement orderAddress;

  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Станция метро']")
  public SelenideElement orderUnderground;

  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
  public SelenideElement orderPhone;

  @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Button_Middle__1CSJM")
  public SelenideElement orderNextButton;

  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
  public SelenideElement orderDate;

  @FindBy(how = How.CSS, using = ".Dropdown-root")
  public SelenideElement orderDuration;

  @FindBy(how = How.CSS, using = ".Order_SelectOption__82bhS.select-search__option")
  public List<SelenideElement> orderMetroStations;

  @FindBy(how = How.CSS, using = ".react-datepicker__day--keyboard-selected")
  public SelenideElement datePickerSelected;

  @FindBy(how = How.XPATH, using = ".//*[@class='Dropdown-menu']/div")
  public List<SelenideElement> durationPickerItems;

  @FindBy(how = How.CSS, using = ".Dropdown-placeholder.is-selected")
  public SelenideElement orderDurationSelected;

  @FindBy(how = How.XPATH, using = ".//*[@for='black']")
  public SelenideElement scooterColourBlack;

  @FindBy(how = How.XPATH, using = ".//*[@for='grey']")
  public SelenideElement scooterColourGrey;

  @FindBy(how = How.XPATH, using = "//input[@placeholder='Комментарий для курьера']")
  public SelenideElement orderComent;

  @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']")
  public SelenideElement orderButtonFinal;

  @FindBy(how = How.XPATH, using = "//div[@class='Order_Modal__YZ-d3']//button[text()='Да']")
  public SelenideElement orderConfirmationYesButton;

  @FindBy(how = How.XPATH, using = "//div[@class='Order_Modal__YZ-d3']//button[text()='Нет']")
  public SelenideElement orderConfirmationNoButton;

  @FindBy(how = How.XPATH, using = "//*[text()='Заказ оформлен']")
  public SelenideElement orderSuccessMessageHeader;

  @FindBy(how = How.CLASS_NAME, using = "Order_Text__2broi")
  public SelenideElement orderSuccessMessageText;


  public String getParentUrl(SelenideElement linkObject) {
    return linkObject.getAttribute("href");
  }

}