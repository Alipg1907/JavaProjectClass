package Class21;

abstract public class WebDriver {
    abstract void openBrowser();

    abstract void loadURL(String url);

    abstract void performTesting();

    abstract void close();


}

class ChromeDriver extends WebDriver {

    @Override
    void openBrowser() {
        System.out.println("Opening the Google Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL " + url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing ");

    }

    @Override
    void close() {
        System.out.println("Closing the Chrome browser");
    }
}

class FirefoxDriver extends WebDriver {

    @Override
    void openBrowser() {
        System.out.println("Opening the Firefox Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url in Firefox " + url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing on Firefox ");
    }

    @Override
    void close() {
        System.out.println("Closing the browser");
    }
}