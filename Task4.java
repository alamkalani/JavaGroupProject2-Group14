package JavaGroupProject2;

public class Task4 {
    /*
    Provide Implementation for the diagram below. Then
    create a test class in which you need to create Objects of
    ChromeDriver, FirefoxDrive and SafariDriver classes and
    see which methods available to them
     */
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver{
void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    public void open(){
        System.out.println("Open the Chrome driver");
    }
    public void close(){
        System.out.println("close the Chrome driver");
    }
    public String getTitle(){
        String getTitle="Amazon";
        return getTitle;
    }
    public void navigate(){
        System.out.println("Go to Chrome driver");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    public void open(){
        System.out.println("Open the Firefox driver");
    }
    public void close(){
        System.out.println("Close the Firefox driver");
    }
    public String getTitle(){
        String getTitle="Facebook";
        return getTitle;
    }
    public void navigate(){
        System.out.println("Go to Firefox driver");
    }
}
class SafariDriver implements RemoteWebDriver{
    public void open(){
        System.out.println("Open the Safari driver");
    }
    public void close(){
        System.out.println("Close the Safari driver");
    }
    public String getTitle(){
        String getTitle="Google";
        return getTitle;
    }
    public void navigate(){
        System.out.println("Go to Safari driver");
    }
}
class TestWebDriver{
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(WebDriver obj:arr){
            obj.open();
            obj.close();
            System.out.println("Title: "+obj.getTitle());
            //obj.navigate(); We don't access to this method. Because it is not in the WebDriver interface.
            //obj.getScreenshot(); We don't access to this method. Because it is not in the WebDriver interface.
        }
    }
}