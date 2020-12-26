package com.NiraliTestingProject.WebPages;

import com.NiraliTestingProject.Driver.DriverManager;
import org.openqa.selenium.By;

public class LoginPage extends DriverManager {
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void enterEmail(){
        driver.findElement(By.id("ap_email")).submit();
    }
    public void clickContinue(){
        driver.findElement(By.id("continue")).click();
    }
}
