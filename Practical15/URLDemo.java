import java.net.*;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://answermyquestion.tk/");
        System.out.println(url.getProtocol());
        System.out.println(url.getFile());
    }
}
