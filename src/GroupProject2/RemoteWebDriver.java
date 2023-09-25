package GroupProject2;

public class RemoteWebDriver implements WebDriver, TakesScreenshot{
    String browser;
    String url;

    void navigate(String url) {
        this.url = url;
        System.out.println("Loading web browser to website " + url);
    }
    public String getTitle() {
        int begin = url.indexOf('.') + 1;
        int end = url.lastIndexOf('.');
        String title = url.substring(begin,end);
        return title;
    }

    public void open(String browser) {
        System.out.println("Opening a tab using " + browser + " web browser");

    }

    public void close(String browser) {
        System.out.println("Closing the current tab from " + browser + " web browser");
        System.out.println();
    }

    public void getScreenshot(String browser) {
        System.out.print("Initiating a screenshot of what is currently on the screen of Device ");
        System.out.println("and opening tab displaying that picture in the " + browser + " web browser");
    }

}
