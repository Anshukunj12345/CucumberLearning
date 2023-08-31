package pageobjects;

import org.openqa.selenium.By;

public class NewRegisterOR {

	public static final By FIRSTNAME = By.id("firstName");
	public static final By LASTTNAME = By.id("lastName");
	public static final By USEREMAIL = By.id("userEmail");
	public static final By GENDER_MALE = By.id("gender-radio-1");
	public static final By USERMOBILENO = By.id("userNumber");
	public static final By DOB = By.className("react-datepicker-wrapper");
	public static final By DATE_MONTH = By.className("react-datepicker__month-select");
    public static final By DATE_YEAR = By.className("react-datepicker__year-select");
    public static final By DATE = By.className("react-datepicker__day");
	public static final By SUBJECT = By.id("subjectsContainer");
	public static final By AUTOSUGGESTION = By.cssSelector(".subjects-auto-complete__value-container input");
    public static final By AUTOSUGGESTION_OPTIONS = By.xpath("//div[@id='react-select-2-option-0']");
    public static final By HOBBIES = By.id("hobbies-checkbox-1");
	public static final By CHOOSEFILE = By.id("uploadPicture");
	public static final By CURRENTADDRESS = By.id("currentAddress");
	public static final By STATE = By.id("state");
    public static final By STATE_VALUE = By.id("react-select-3-option-1");
    public static final By CITY = By.id("city");
    public static final By CITY_VALUE = By.id("react-select-4-option-1");
    public static final By SUBMIT = By.id("submit");
    public static final By CONFIRMATION_POPUP = By.id("closeLargeModal");
}
