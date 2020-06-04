package appium.Test;

import org.testng.annotations.*;
import appium.Config.SetUp;
import appium.Pages.CalculatorPage;

public class CalculatorTest extends SetUp{
	private CalculatorPage calculatorPage;

	@Test (description = "Init Calculator")
	public void startCalculator() {
		this.calculatorPage = new CalculatorPage(driver);
		this.calculatorPage.convertColonestoDollars(1000000);
	}
}
