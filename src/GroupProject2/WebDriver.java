package GroupProject2;

public interface WebDriver {
    void open(String browser);
    void close(String browser);
    String getTitle();
}
