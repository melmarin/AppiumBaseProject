package appium.Pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorPage {
	private AppiumDriver<MobileElement> driver;
	private By zero;
	private By one;
	private By two;
	private By three;
	private By four;
	private By five;
	private By six;
	private By seven;
	private By eight;
	private By nine;
	private By agreeBtn;
	private By equals;
	private By plus;
	private By mul;
	private By div;
	private By less;
	private By ac;
	private int colonesPerDolar;

	public CalculatorPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		this.agreeBtn = By.id("android:id/button1");
		this.zero = By.id("com.miui.calculator:id/btn_0_s");
		this.one = By.id("com.miui.calculator:id/btn_1_s");
		this.two = By.id("com.miui.calculator:id/btn_2_s");
		this.three = By.id("com.miui.calculator:id/btn_3_s");
		this.four = By.id("com.miui.calculator:id/btn_4_s");
		this.five = By.id("com.miui.calculator:id/btn_5_s");
		this.six = By.id("com.miui.calculator:id/btn_6_s");
		this.seven = By.id("com.miui.calculator:id/btn_7_s");
		this.eight = By.id("com.miui.calculator:id/btn_8_s");
		this.nine = By.id("com.miui.calculator:id/btn_9_s");
		this.equals = By.id("com.miui.calculator:id/btn_equal_s");
		this.plus = By.id("com.miui.calculator:id/btn_plus_s");
		this.mul = By.id("com.miui.calculator:id/btn_2_s com.miui.calculator:id/btn_mul_s");
		this.div = By.id("com.miui.calculator:id/btn_div_s");
		this.less = By.id("com.miui.calculator:id/btn_minus_s");
		this.ac = By.id("com.miui.calculator:id/btn_equal_s com.miui.calculator:id/btn_c_s");
		this.colonesPerDolar = 580;
	}

	public void convertColonestoDollars(int number) {
		MobileElement agreeME = driver.findElement(this.agreeBtn);
		agreeME.click();
		//get numbers
		getNumbersFromNumber(number);
		//operations
		MobileElement divME = driver.findElement(this.div);
		divME.click();
		getNumbersFromNumber(colonesPerDolar);
		MobileElement equalsME = driver.findElement(this.equals);
		equalsME.click();
	}
	
	private void getNumbersFromNumber(int inputNumber) {
		String number = String.valueOf(inputNumber);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    clickNumbers(j);
		}
	}
	
	private void clickNumbers(int number) {
		switch (number) {
		case 0:
			  MobileElement zeroME = driver.findElement(this.zero);
				zeroME.click();
		    break;  
		case 1:
			  MobileElement oneME = driver.findElement(this.one);
				oneME.click();
		    break;
		  case 2:
			  MobileElement twoME = driver.findElement(this.two);
				twoME.click();
		    break;
		  case 3:
			  MobileElement threeME = driver.findElement(this.three);
				threeME.click();
		    break;
		  case 4:
			  MobileElement fourME = driver.findElement(this.four);
				fourME.click();
		    break;
		  case 5:
			  MobileElement fiveME = driver.findElement(this.five);
				fiveME.click();
		    break;
		  case 6:
			  MobileElement sixME = driver.findElement(this.six);
				sixME.click();
		    break;
		  case 7:
			  MobileElement sevenME = driver.findElement(this.seven);
				sevenME.click();
		    break;
		  case 8:
			  MobileElement eightME = driver.findElement(this.eight);
				eightME.click();
		    break;
		  case 9:
			  MobileElement nineME = driver.findElement(this.nine);
				nineME.click();
		    break;
		}
	}
}
