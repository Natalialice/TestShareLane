package org.exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DiscountTest {
    WebDriver driver;
    String email;
    String password;


    @BeforeClass
    public void SetPathToWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

//    @BeforeMethod
//    public void setUp(String url) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.sharelane.com/cgi-bin/register.py");
   // }
    @Test
    public void DiscountZero(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("00000");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.cssSelector("input[value='Register']"));
        driver.findElement(By.name("first_name")).sendKeys("Woddy");
        driver.findElement(By.name("last_name")).sendKeys("Makar");
        driver.findElement(By.name("email")).sendKeys("Makar@vu.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        String Email = driver.findElement(By.xpath("//td[text()='Email']/following::b")).getText();
        String Password = driver.findElement(By.xpath("//td[text()='Password']/following::td")).getText();
        driver.findElement(By.cssSelector("img[src='../images/logo.jpg']")).click();
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        driver.findElement(By.xpath("//img[@src ='../images/add_to_cart.gif']")).click();
        driver.findElement(By.xpath("//a[@href='./shopping_cart.py']")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.xpath("//input [@value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='0']"));

        //Assert.assertEquals(driver.findElement(By.xpath("//tr[5]//td[5]//p//b")).getText(),discount);
    }
    @Test
    public void Discount21(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("00000");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.cssSelector("input[value='Register']"));
        driver.findElement(By.name("first_name")).sendKeys("Woddy");
        driver.findElement(By.name("last_name")).sendKeys("Makar");
        driver.findElement(By.name("email")).sendKeys("Makar@vu.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        String Email = driver.findElement(By.xpath("//td[text()='Email']/following::b")).getText();
        String Password = driver.findElement(By.xpath("//td[text()='Password']/following::td")).getText();
        driver.findElement(By.cssSelector("img[src='../images/logo.jpg']")).click();
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        driver.findElement(By.xpath("//img[@src ='../images/add_to_cart.gif']")).click();
        driver.findElement(By.xpath("//a[@href='./shopping_cart.py']")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("21");
        driver.findElement(By.xpath("//input [@value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='2']"));

        //Assert.assertEquals(driver.findElement(By.xpath("//tr[5]//td[5]//p//b")).getText(),discount);
    }
    @Test
    public void Discount3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("00000");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.cssSelector("input[value='Register']"));
        driver.findElement(By.name("first_name")).sendKeys("Woddy");
        driver.findElement(By.name("last_name")).sendKeys("Makar");
        driver.findElement(By.name("email")).sendKeys("Makar@vu.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        String Email = driver.findElement(By.xpath("//td[text()='Email']/following::b")).getText();
        String Password = driver.findElement(By.xpath("//td[text()='Password']/following::td")).getText();
        driver.findElement(By.cssSelector("img[src='../images/logo.jpg']")).click();
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        driver.findElement(By.xpath("//img[@src ='../images/add_to_cart.gif']")).click();
        driver.findElement(By.xpath("//a[@href='./shopping_cart.py']")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.xpath("//input [@value='Update']")).click();
        WebElement discount = driver.findElement(By.xpath("//b[normalize-space()='3']"));
    }
   // public void discountOneBook(){
    //    Login();
    //    driver.get("https:");
 //   }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
