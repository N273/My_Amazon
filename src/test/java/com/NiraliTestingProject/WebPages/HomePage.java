package com.NiraliTestingProject.WebPages;


import com.NiraliTestingProject.Driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage extends DriverManager {
public void clickOnMenu() {
    //driver.findElement(By.className("hm-icon nav-sprite")).click(); // to click on account symbol
    driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[1]/a[1]/i[1]")).click();
}
public void clickSiginMenu() {
    driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

}

}
