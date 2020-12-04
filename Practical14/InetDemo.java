import java.io.*;
import java.net.*;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("answermyquestion.tk");
            System.out.println("Host Name : "+ ip.getHostName());
            System.out.println("IP Address : " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("ERR : " + e);
        }
    }    
}
