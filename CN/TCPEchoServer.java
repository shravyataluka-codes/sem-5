import java.io.*;
import java.net.*;

public class TCPEchoServer {
    public static void main(String[] args) {
        try {
            // Create server socket listening on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("TCP Echo Server started... Waiting for client.");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Input stream from client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Output stream to client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received: " + message);

                // Echo back to client
                out.println(message);

                // Exit condition
                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Client requested to end connection.");
                    break;
                }
            }

            // Close resources
            in.close();
            out.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
