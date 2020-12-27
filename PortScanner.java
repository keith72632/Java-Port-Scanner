import java.net.*;

public class PortScanner {

    public static void main(String[] args) {
        for (int port = 0; port <= 65535; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(args[0], port), 1000);
                socket.close();
                System.out.println("Port: " + port + " is open");
            } catch (Exception ex) {

            }

        }
    }
}