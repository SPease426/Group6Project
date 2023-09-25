package GroupProject2;

public class FireFoxDriver extends RemoteWebDriver{
    public static void main(String[] args) {

        FireFoxDriver firefox = new FireFoxDriver();

        firefox.open("FireFox");
        firefox.navigate("www.GameFly.com");
        System.out.println("Title of website is " + firefox.getTitle());
        firefox.getScreenshot("FireFox");
        firefox.close("FireFox");
    }
}
