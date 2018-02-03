/**
*  Requires Variable Changes....
*  Pings IP address (miner) to see if online.
*  Else Core.java to Ping Next in list.
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
