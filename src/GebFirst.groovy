import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.*

def browser = new Browser(driver : new ChromeDriver())
            //new Browser(driver : new FirefoxDriver())

browser.go("http://udemy.com")
