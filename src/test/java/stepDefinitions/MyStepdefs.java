package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyStepdefs {

    @Given("{string} is printed")
    public void printString(String str) {
        System.out.println(str);
//        WebDriver driver = new ChromeDriver();
//        driver.get("www.google.com");
    }

    @Given("{string} is {string}")
    public void usernameIs(String arg0, String arg1) {
        System.out.println(arg0 + " : " + arg1);
    }

    @Given("print all below")
    public void printAllBelow(io.cucumber.datatable.DataTable data) {
        List<String> d = data.asList(String.class);
        for (String value : d) {
            System.out.println(value);
        }
//        WebDriver driver = new ChromeDriver();
//        driver.get("www.google.com");
    }
}
