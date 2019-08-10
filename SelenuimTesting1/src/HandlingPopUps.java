import org.openqa.selenium.By;

public class HandlingPopUps extends SeleniumUtil{

public void handleAlertPopUps(){

/*pass the desired browser and app url*/

setUp("firefox", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

/*switch to frame to click on Try it button*/

driver.switchTo().frame("iframeResult");

driver.findElement(By.xpath("//button[text()='Try it']")).click();

/*get the text from Alert popup*/

System.out.println(driver.switchTo().alert().getText());

setSleepTime(2000);

/*Click on OK button*/

driver.switchTo().alert().accept();

/*close the browser instance*/

tearDown();

}

public void handleConfirmationPopUps(){

/*pass the desired browser and app url*/

setUp("firefox", "https://www.w3schools.com/js/tryit.asp…");

/*switch to frame to click on Try it button*/

driver.switchTo().frame("iframeResult");

driver.findElement(By.xpath("//button[text()='Try it']")).click();

/*get the text from Alert popup*/

System.out.println(driver.switchTo().alert().getText());

setSleepTime(2000);

/*Click on Cancel button*/

driver.switchTo().alert().dismiss();

/*close the browser instance*/

tearDown();

}

public void handlePromptPopUps(){

/*pass the desired browser and app url*/

setUp("firefox", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

/*switch to frame to click on Try it button*/

driver.switchTo().frame("iframeResult");

driver.findElement(By.xpath("//button[text()='Try it']")).click();

/*get the text from Alert popup*/

System.out.println(driver.switchTo().alert().getText());

/*Type the required text on the popup*/

driver.switchTo().alert().sendKeys("Qspiders Deccan Pune");

setSleepTime(2000);

/*Click on OK button*/

driver.switchTo().alert().accept();

/*close the browser instance*/

tearDown();

}

public static void main(String[] args) {

HandlingPopUps getHandlingPopUps=new HandlingPopUps();

getHandlingPopUps.handleAlertPopUps();

getHandlingPopUps.handleConfirmationPopUps();

getHandlingPopUps.handlePromptPopUps();

}

}