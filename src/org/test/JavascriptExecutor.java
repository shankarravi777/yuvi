package org.test;

import org.openqa.selenium.WebElement;

public interface JavascriptExecutor {

	Object executeScript(String string, WebElement pass);

	void executeScript(String string, WebElement user, WebElement pass);

}
