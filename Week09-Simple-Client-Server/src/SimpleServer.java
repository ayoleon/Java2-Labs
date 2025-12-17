import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Create a server socket on port 5000
            //global if passing with constrictors
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server waiting for client...");

            // Wait for a client to connect
            Socket socket = server.accept();
            System.out.println("Client connected!");

            // Send a message to the client
            //streaming when dealing with networks
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from the server!");

            // Read a message from the client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine();
            System.out.println("Client says: " + message);

            // Close everything
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}