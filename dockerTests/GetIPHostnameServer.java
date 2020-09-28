import java.net.InetAddress;
import java.net.UnknownHostException;

 
public class GetIPHostnameServer{
 
    public static void main(String[] args){
 
        InetAddress ip;
        String hostname;

        try{
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your IP address : " + ip);
            System.out.println("Your Hostname : " + hostname);
 
        }catch(UnknownHostException e){
             e.printStackTrace();
        }
    }
}