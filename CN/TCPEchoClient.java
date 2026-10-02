import java.io.*;
import java.net.*;

public class TCPEchoClient {
    public static void main(String[] args) {
        try {
            // Connect to server at localhost on port 5000
            Socket socket = new Socket("localhost", 5000);

            // Input from keyboard
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            // Input stream from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Output stream to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while (true) {
                System.out.println("Enter message: ");
                message = keyboard.readLine();

                if (message == null) {
                    break;
                }
                message = message.trim();

                // Send message to server
                out.println(message);

                // Receive echo from server
                String response = in.readLine();
                System.out.println("Server: " + response);

                // Exit condition
                if (message.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            // Close resources
            socket.close();
            in.close();
            out.close();
            keyboard.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    