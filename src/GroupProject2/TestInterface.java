package GroupProject2;

public class TestInterface extends RemoteWebDriver {
    public static void main(String[] args) {
        RemoteWebDriver chrome = new ChromeDriver();
        RemoteWebDriver firefox = new FireFoxDriver();
        RemoteWebDriver microsoftEdge = new MicrosoftEdgeDriver();


        chrome.open("Chrome");
        chrome.navigate("www.YouTube.com");
        System.out.println("Title of website is " + chrome.getTitle());
        chrome.getScreenshot("Chrome");
        chrome.close("Chrome");

        firefox.open("FireFox");
        firefox.navigate("www.Syntax.com");
        System.out.println("Title of website is " + firefox.getTitle());
        firefox.getScreenshot("FireFox");
        firefox.close("FireFox");

        microsoftEdge.open("microsoftEdge");
        microsoftEdge.navigate("www.GameFly.com");
        System.out.println("Title of website is " + microsoftEdge.getTitle());
        microsoftEdge.getScreenshot("Microsoft Edge");
        microsoftEdge.close("Microsoft Edge");
    }
}
