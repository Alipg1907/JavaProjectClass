package Class20;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Explorer {
    public static void main(String[] args) {
        InternetExplorerDriver explorerDriver=new InternetExplorerDriver();
        explorerDriver.manage().window().maximize();

    }
}
