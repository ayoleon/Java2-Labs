import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost (same computer)
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            // Read message from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine();
            System.out.println("Server says: " + message);

            // Send message back to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Thanks, server!");

            // Close connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}