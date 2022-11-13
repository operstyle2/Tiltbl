import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try {
            driver.get("https://google.com");
            Thread.sleep(2000);
            WebElement element1 = driver.findElement(By.xpath("//input[@name='q']"));
            element1.sendKeys("калькулятор" , Keys.ENTER);
            Thread.sleep(2000);
            WebElement element2 = driver.findElement(By.xpath("//div[.='(']"));
            WebElement element3 = driver.findElement(By.xpath("//div[.='1']"));
            WebElement element4 = driver.findElement(By.xpath("//div[.='+']"));
            WebElement element5 = driver.findElement(By.xpath("//div[.='2']"));
            WebElement element6 = driver.findElement(By.xpath("//div[.=')']"));
            WebElement element7 = driver.findElement(By.xpath("//div[.='×']"));
            WebElement element8 = driver.findElement(By.xpath("//div[.='3']"));
            WebElement element9 = driver.findElement(By.xpath("//div[.='-']"));
            WebElement element10 = driver.findElement(By.xpath("//div[.='4']"));
            WebElement element11 = driver.findElement(By.xpath("//div[.='0']"));
            WebElement element12 = driver.findElement(By.xpath("//div[.='÷']"));
            WebElement element13 = driver.findElement(By.xpath("//div[.='5']"));


            Actions actions = new Actions(driver);

            actions.click(element2);
            Thread.sleep(2000);

            actions.click(element3);
            Thread.sleep(2000);

            actions.click(element4);
            Thread.sleep(2000);

            actions.click(element5);
            Thread.sleep(2000);

            actions.click(element6);
            Thread.sleep(2000);

            actions.click(element7);
            Thread.sleep(2000);

            actions.click(element8);
            Thread.sleep(2000);

            actions.click(element9);
            Thread.sleep(2000);

            actions.click(element10);
            Thread.sleep(2000);

            actions.click(element11);
            Thread.sleep(2000);

            actions.click(element12);
            Thread.sleep(2000);

            actions.click(element13);
            Thread.sleep(2000);

            LoginPage lp = new LoginPage();

            lp.login("admin", "admin");



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            driver.quit();
            Thread.sleep(20000);
        }




    }

}