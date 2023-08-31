package javamethod;

import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.timeout.TimeoutException;
import pageobjects.NewRegisterOR;
import pageobjects.PracticeFormOR;

public class NewRegisterMethod {
	
	public static String filePath = "TestData/userimage.jpg";

	public static void launchBrowser(WebDriver driver, String url)throws InterruptedException{
		
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void EnterFirstName(WebDriver driver, String fname) {
		
		try {
			driver.findElement(NewRegisterOR.FIRSTNAME).sendKeys(fname);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
	}
	
public static void EnterLastName(WebDriver driver, String lname) {
		
		try {
			driver.findElement(NewRegisterOR.LASTTNAME).sendKeys(lname);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
	}
public static void EnterEmail(WebDriver driver, String email) {
	
	try {
		driver.findElement(NewRegisterOR.USEREMAIL).sendKeys(email);
	} catch (NoSuchElementException e) {
		// TODO: handle exception
	}
}
public static void selectGender(WebDriver driver) {

    

    WebElement element = driver.findElement(NewRegisterOR.GENDER_MALE);

    Actions actions = new Actions(driver);

    actions.moveToElement(element).click().build().perform();

}
public static void EnterMobileNumber(WebDriver driver, String mobilenumber ) {
	
	try {
		driver.findElement(NewRegisterOR.USERMOBILENO).sendKeys(mobilenumber);
	} catch (NoSuchElementException e) {
		// TODO: handle exception
	}
}
public static void selectDOB(WebDriver driver) {

    try {

        WebElement element = driver.findElement(NewRegisterOR.DOB);

        Actions actions = new Actions(driver);

        actions.moveToElement(element).click().build().perform();



        Select month = new Select(driver.findElement(NewRegisterOR.DATE_MONTH));

        month.selectByIndex(0);



        Select year = new Select(driver.findElement(NewRegisterOR.DATE_YEAR));

        year.selectByValue("2023");



        List<WebElement> day = driver.findElements(NewRegisterOR.DATE);



        for (WebElement myday : day) {

            System.out.println(myday);

            myday.click();

            break;

        }



    } catch (NoSuchElementException e) {

        System.out.println("Unable to locate element" + e);

    } catch (TimeoutException e) {

        e.printStackTrace();
    }
}

public static void enterNewSubject(WebDriver driver, String subject) {
	
    try {        
        driver.findElement(NewRegisterOR.AUTOSUGGESTION).sendKeys(subject);

    } catch (NoSuchElementException e) {
        // TODO: handle exception
    } catch (TimeoutException e) {
        // TODO: handle exception
   }
}
public static void selectNewHobbies(WebDriver driver, String hob ) {

    try {

        System.out.println("Hobbies are selected");

        WebElement element = driver.findElement(NewRegisterOR.HOBBIES);

        Actions actions = new Actions(driver);

        actions.moveToElement(element).click().build().perform();

    } catch (NoSuchElementException e) {

        // TODO: handle exception

    } catch (TimeoutException e) {

       // TODO: handle exception
    	
    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();

    }

}
public static void SelectPicture(WebDriver driver) {
	
	try {
		WebElement uploadImg = driver.findElement(NewRegisterOR.CHOOSEFILE);
		
		uploadImg.sendKeys(new java.io.File(filePath).getAbsolutePath());
	} catch (NoSuchElementException e) {
		// TODO: handle exception
	}
}
public static void SelectAddress(WebDriver driver, String  address) {
	
	try {
		driver.findElement(NewRegisterOR.CURRENTADDRESS).sendKeys(address);
	} catch (NoSuchElementException e) {
		// TODO: handle exception
	}
}
public static void selectNewState(WebDriver driver, String state) {

    try {

        WebElement element = driver.findElement(NewRegisterOR.STATE);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        WebElement se = driver.findElement(NewRegisterOR.STATE_VALUE);
        se.click();
        System.out.println("Entered state as " + state);
    } catch (NoSuchElementException e) {

        System.out.println("Unable to locate element" + e);

    } catch (TimeoutException e) {

        e.printStackTrace();

    }

}

public static void selectNewCity(WebDriver driver, String city) {

    try {

        driver.findElement(NewRegisterOR.CITY).click();

        WebElement se = driver.findElement(NewRegisterOR.CITY_VALUE);

        se.click();

        System.out.println("Entered city as" + city);

    } catch (NoSuchElementException e) {

        System.out.println("Unable to locate element" + e);

    } catch (TimeoutException e) {

        e.printStackTrace();

    }

}
public static void Submit(WebDriver driver) throws InterruptedException {

    try {

        WebElement element = driver.findElement(NewRegisterOR.SUBMIT);

        Actions actions = new Actions(driver);

        Thread.sleep(1000);

        actions.moveToElement(element).click().build().perform();



    } catch (NoSuchElementException e) {

        System.out.println("Unable to locate Submit button on the Practice form" + e);

    } catch (TimeoutException e) {

        e.printStackTrace();



    }

}}