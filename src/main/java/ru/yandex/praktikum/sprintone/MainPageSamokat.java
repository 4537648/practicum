package ru.yandex.praktikum.sprintone;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;
import static com.codeborne.selenide.Condition.visible;

public class MainPageSamokat {

  // блок с названием страницы "Самокат на пару дней"
  @FindBy(how = How.CLASS_NAME, using = "Home_Header__iJKdX")
  public SelenideElement homeHeaderBlock;

  // блок с таблицей названия страницы "Самокат на пару дней"
  @FindBy(how = How.CLASS_NAME, using = "Home_Table__2kPxP")
  public SelenideElement homeTableBlock;

  // поле ИМЯ формы заказа
  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
  public SelenideElement orderFirstName;

  // поле ФАМИЛИЯ формы заказа
  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
  public SelenideElement orderLastName;

  // поле АДРЕС формы заказа
  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
  public SelenideElement orderAddress;

  // поле МЕТРО формы заказа
  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Станция метро']")
  public SelenideElement orderUnderground;

  // поле ТЕЛЕФОН формы заказа
  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
  public SelenideElement orderPhone;

  // кнопка ДАЛЕЕ формы заказа
  @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Button_Middle__1CSJM")
  public SelenideElement orderNextButton;

  // поле ДАТА формы заказа
  @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
  public SelenideElement orderDate;

  // поле СРОК АРЕНДЫ формы заказа
  @FindBy(how = How.CSS, using = ".Dropdown-root")
  public SelenideElement orderDuration;

  // список СТАНЦИИ МЕТРО формы заказа
  @FindBy(how = How.CSS, using = ".Order_SelectOption__82bhS.select-search__option")
  public List<SelenideElement> orderMetroStations;

  // календарь выбора даты формы заказа
  @FindBy(how = How.CSS, using = ".react-datepicker__day--keyboard-selected")
  public SelenideElement datePickerSelected;

  // список вариантов срока аренды формы заказа
  @FindBy(how = How.XPATH, using = ".//*[@class='Dropdown-menu']/div")
  public List<SelenideElement> durationPickerItems;

  // поле выбора цвета самоката ЧЕРНЫЙ ЖЕМЧУГ формы заказа
  @FindBy(how = How.XPATH, using = ".//*[@for='black']")
  public SelenideElement scooterColourBlack;

  // поле выбора цвета самоката СЕРАЯ БЕЗЫСХОДНОСТЬ формы заказа
  @FindBy(how = How.XPATH, using = ".//*[@for='grey']")
  public SelenideElement scooterColourGrey;

  // поле КОММЕНТАРИЙ формы заказа
  @FindBy(how = How.XPATH, using = "//input[@placeholder='Комментарий для курьера']")
  public SelenideElement orderComment;

  // кнопка ЗАКАЗАТЬ формы заказа
  @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']")
  public SelenideElement orderButtonFinal;

  // кнопка НАЗАД формы заказа
  @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[text()='Назад']")
  public SelenideElement orderButtonBack;

  // кнопка ДА подтверждения заказа
  @FindBy(how = How.XPATH, using = "//div[@class='Order_Modal__YZ-d3']//button[text()='Да']")
  public SelenideElement orderConfirmationYesButton;

  // кнопка НЕТ подтверждения заказа
  @FindBy(how = How.XPATH, using = "//div[@class='Order_Modal__YZ-d3']//button[text()='Нет']")
  public SelenideElement orderConfirmationNoButton;

  // заголовок сообщения об успешном оформлении заказа
  @FindBy(how = How.XPATH, using = "//*[text()='Заказ оформлен']")
  public SelenideElement orderSuccessMessageHeader;

  // текст сообщения об успешном оформлении заказа
  @FindBy(how = How.CLASS_NAME, using = "Order_Text__2broi")
  public SelenideElement orderSuccessMessageText;

  // Картинка-логотип самоката.
  @FindBy(how = How.CLASS_NAME, using = "Home_BluePrint__TGX2n")
  public SelenideElement scooterImageBlueprint;

  // Логотип "Яндекс".
  @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
  public SelenideElement yandexLogoButton;

  // Логотип "Самокат".
  @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
  public SelenideElement samokatLogoButton;

  // Логотип "Учебный тренажер".
  @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
  public SelenideElement headerTextDisclaimer;

  // App Cookie Consent
  @FindBy(how = How.CLASS_NAME, using = "App_CookieConsent__1yUIN")
  public static SelenideElement appCookieConsent;

  // Текст App Cookie Consent "И здесь куки! В общем, мы их используем."
  @FindBy(how = How.CLASS_NAME, using = "App_CookieText__1sbqp")
  public SelenideElement appCookieConsentText;

  // Кнопка "да все привыкли"
  @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
  public static SelenideElement appCookieConsentButton;

  // Заголовок "Самокат на пару дней".
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX' and text()='Самокат ']")
  public SelenideElement samokatForTwoDaysTitleText;

  // Подзаголовок "Привезём его прямо к вашей двери,а когда накатаетесь — заберём.
  @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E' and text()='Привезём его прямо к вашей двери,']")
  public SelenideElement samokatForTwoDaysSubTitleOneText;

  // Подзаголовок "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
  @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E' and text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
  public SelenideElement samokatForTwoDaysSubTitleTwoText;

  // Кнопка "Заказать" в хедере страницы.
  @FindBy(how = How.XPATH, using = "//div[@class='Header_Nav__AGCXC']//button[text()='Заказать']")
  public SelenideElement orderButtonOne;

  // Элемент "Статус заказа" в хедере страницы.
  @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
  public SelenideElement statusButton;

  // Поле ввода номера заказа - Появляется после клака по кнопке "Статус заказа"
  @FindBy(how = How.CSS, using = ".Input_Input__1iN_Z.Header_Input__xIoUq")
  public SelenideElement statusNumberField;

  // Кнопка "Go" - Появляется после клака по кнопке "Статус заказа"
  @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Header_Button__28dPO")
  public SelenideElement statusNumberGoButton;

  // Картинка "Самокат".
  @FindBy(how = How.CLASS_NAME, using = "Home_Scooter__3YdJy")
  public SelenideElement scooterImageFull;

  // Элемент-блок с параметрами самоката (скорость, расстояние, вес).
  @FindBy(how = How.CLASS_NAME, using = "Home_Table__2kPxP")
  public SelenideElement scooterParamsBlock;

  // Блок с характеристиками

  // Модель Toxic PRO
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[1]/div[1]")
  public SelenideElement scooterParamsTitleLineParam;

  // Максимальная скорость
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[3]/div[1]")
  public SelenideElement scooterParamsSecondLineParam;

  // 40 км/ч
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[3]/div[2]")
  public SelenideElement scooterParamsSecondLineValue;

  // Проедет без подзарядки
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[4]/div[1]")
  public SelenideElement scooterParamsThirdLineParam;

  // 80 км
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[4]/div[2]")
  public SelenideElement scooterParamsThirdLineValue;

  // Выдерживает вес
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[5]/div[1]")
  public SelenideElement scooterParamsFourthLineParam;

  // 120 кг
  @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']/div[5]/div[2]")
  public SelenideElement scooterParamsFourthLineValue;

  // Подзаголовок "Как это работает"
  @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E' and text()='Как это работает']")
  public SelenideElement bodyTextHowItWorks;

  // Элемент "Кружок с цифрой 1 внутри"
  @FindBy(how = How.XPATH, using = "//*[@class='Home_StatusCircle__3_aTp' and text()='1']")
  public SelenideElement gfxCircleOne;

  // Элемент "Кружок с цифрой 2 внутри".
  @FindBy(how = How.XPATH, using = "//*[@class='Home_StatusCircle__3_aTp' and text()='2']")
  public SelenideElement gfxCircleTwo;

  // Элемент "Кружок с цифрой 3 внутри".
  @FindBy(how = How.XPATH, using = "//*[@class='Home_StatusCircle__3_aTp' and text()='3']")
  public SelenideElement gfxCircleThree;

  // Элемент "Кружок с цифрой 4 внутри".
  @FindBy(how = How.CLASS_NAME, using = ".Home_StatusCircle__3_aTp.Home_Lineless__2-Rxp")
  public SelenideElement gfxCircleFoiur;

  // Шаг 1 "Заказываете самокат"
  @FindBy(how = How.XPATH, using = "//*[text()='Заказываете самокат']")
  public SelenideElement howItWorksStepOneTitle;

  // Описание Шага 1 "Выбираете, когда и куда привезти".
  @FindBy(how = How.XPATH, using = "//*[text()='Заказываете самокат']/following-sibling::div")
  public SelenideElement howItWorksStepOneDescription;

  // Шаг 2 "Курьер привозит самокат".
  @FindBy(how = How.XPATH, using = "//*[text()='Курьер привозит самокат']")
  public SelenideElement howItWorksStepTwoTitle;

  // Описание Шага 2 "А вы — оплачиваете аренду"
  @FindBy(how = How.XPATH, using = "//*[text()='Курьер привозит самокат']/following-sibling::div")
  public SelenideElement howItWorksStepTwoDescription;

  // Шаг 3 "Катаетесь".
  @FindBy(how = How.XPATH, using = "//*[text()='Катаетесь']")
  public SelenideElement howItWorksStepThreeTitle;

  // Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
  @FindBy(how = How.XPATH, using = "//*[text()='Катаетесь']/following-sibling::div")
  public SelenideElement howItWorksStepThreeDescription;

  // Шаг 4 "Курьер забирает самокат".
  @FindBy(how = How.XPATH, using = "//*[text()='Курьер забирает самокат']")
  public SelenideElement howItWorksStepFourTitle;

  // Описание Шага 4 "Когда аренда заканчивается".
  @FindBy(how = How.XPATH, using = "//*[text()='Курьер забирает самокат']/following-sibling::div")
  public SelenideElement howItWorksStepFourDescription;

  // Кнопка "Заказать" в нижней части страницы.
  @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Button_Middle__1CSJM")
  public SelenideElement orderButtonTwo;

  // Вопросы о важном
  @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E' and text()='Вопросы о важном']")
  public SelenideElement bodyTextImportantQuestions;

// Блок вопросов

  // массив вопросов блока "Вопросы о важном"
  @FindBy(how = How.XPATH, using = ".//*[@class='Home_FAQ__3uVm4']//*[@class='accordion__item']//*[@class='accordion__heading']/div")
  public List<SelenideElement> allElementsHeading;

  // массив ответов блока "Вопросы о важном"
  @FindBy(how = How.XPATH, using = ".//*[@class='Home_FAQ__3uVm4']//*[@class='accordion__item']//*[@class='accordion__panel']/p")
  public List<SelenideElement> allElementsPanel;

  // Вопрос №1 "Сколько это стоит и как оплатить"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-0']")
  public SelenideElement accordionHeading1;

  // Вопрос №2 "Хочу сразу несколько самокатов! Так можно?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-1']")
  public SelenideElement accordionHeading2;

  // Вопрос №3 "Как рассчитывается время аренды?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-2']")
  public SelenideElement accordionHeading3;

  // Вопрос №4 "Можно ли заказать самокат прямо на сегодня?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-3']")
  public SelenideElement accordionHeading4;

  // Вопрос №5 "Можно ли продлить заказ или вернуть самокат раньше?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-4']")
  public SelenideElement accordionHeading5;

  // Вопрос №6 "Вы привозите зарядку вместе с самокатом?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-5']")
  public SelenideElement accordionHeading6;

  // Вопрос №7 "Можно ли отменить заказ?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-6']")
  public SelenideElement accordionHeading7;

  // Вопрос №8 "Я жизу за МКАДом, привезёте?"
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__heading-7']")
  public SelenideElement accordionHeading8;

  // Ответ на вопрос №1 "Сутки — 400 рублей. Оплата курьеру — наличными или картой.".
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-0']")
  public SelenideElement accordionPanel1;

  // Ответ на вопрос №2. "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-1']")
  public SelenideElement accordionPanel2;

  // Ответ на вопрос №3. "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-2']")
  public SelenideElement accordionPanel3;

  // Ответ на вопрос №4. "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-3']")
  public SelenideElement accordionPanel4;

  // Ответ на вопрос №5. "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-4']")
  public SelenideElement accordionPanel5;

  // Ответ на вопрос №6. "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.""
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-5']")
  public SelenideElement accordionPanel6;

  // Ответ на вопрос №7. "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-6']")
  public SelenideElement accordionPanel7;

  // Ответ на вопрос №8. "Да, обязательно. Всем самокатов! И Москве, и Московской области."
  @FindBy(how = How.XPATH, using = "//*[@id='accordion__panel-7']")
  public SelenideElement accordionPanel8;

  public String getParentUrl(SelenideElement linkObject) {
    return linkObject.getAttribute("href");
  }

  public static void closeCookieNotification() {
    if (appCookieConsent.isDisplayed()) {
      appCookieConsentButton.shouldBe(visible).click();
    }
  }

  public static void fillOrderFormFirstScreen (MainPageSamokat mainPage) {
    mainPage.orderFirstName.setValue("тестовое имя");
    mainPage.orderLastName.setValue("фамилия");
    mainPage.orderAddress.setValue("Москва, Кремль-9");
    mainPage.orderUnderground.click();
    mainPage.orderMetroStations.get(SprintOneSteps.getRandomNumber(0, mainPage.orderMetroStations.size())).click();
    mainPage.orderPhone.setValue("8" + SprintOneSteps.getRandomNumber(901, 999) + SprintOneSteps.getRandomNumber(1000000, 9999999));
    mainPage.orderNextButton.click();
  }


  public static void fillOrderFormSecondScreen (MainPageSamokat mainPage) {
    {
      mainPage.orderDate.click();
      mainPage.datePickerSelected.click();
      mainPage.orderDuration.click();
      mainPage.durationPickerItems.get(SprintOneSteps.getRandomNumber(0, mainPage.durationPickerItems.size())).click();
      switch (SprintOneSteps.getRandomNumber(0, 2)) {
        case 0: {
          mainPage.scooterColourBlack.click();
          break;
        }
        case 1: {
          mainPage.scooterColourGrey.click();
          break;
        }
        case 2: {
          mainPage.scooterColourBlack.click();
          mainPage.scooterColourGrey.click();
          break;
        }
      }
      mainPage.orderComment.setValue("В работу не брать, работает автотест");
      mainPage.orderButtonFinal.click();
    }
  }
}