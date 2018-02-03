/**
*  Requires Variable Changes....
*  Pings IP address (miner) to see if online.
*  Else Core.java to parse next ip address in list to Ping.java
*  Ping.java to return True or False if ip address is online.
**/


import java.io.IOException;
import java.net.InetAddress;
 
public class IPTest {
  
    public static void main(String[] args) {
         try {
            InetAddress adr = InetAddress.getByName(ipaddress);
            System.out.println("Host is reachable: "+adr.isReachable(3000));
        }catch (IOException e) {
            e.printStackTrace();
        }         
    }
}
