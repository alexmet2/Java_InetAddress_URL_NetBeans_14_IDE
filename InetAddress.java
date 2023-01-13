import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddress{
    public static void main(String[] args){
        InetAddress address = InetAddress.getLocalHost();
        URL web = new URL("https://el-gr.facebook.com/");
        System.out.println("Protocol " + web.getProtocol());
        System.out.println("Host " + web.getHost());
        System.out.println("Port " + web.getPort());
        System.out.println("Authority " + web.getAuthority());
        System.out.println("Query " + web.getAuthority());
        System.out.println(address.getHostAddress());
    }
}