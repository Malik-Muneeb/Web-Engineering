import java.io.*;
import java.net.*;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(9876);
			byte[] incomingData = new byte[1024];

			while (true) {
				DatagramPacket incomingPacket = new DatagramPacket(incomingData, incomingData.length);
				socket.receive(incomingPacket);
				String message = new String(incomingPacket.getData());
				System.out.println("Received message from client: " + message);
				InetAddress IPAddress = incomingPacket.getAddress();
				int port = incomingPacket.getPort();
				String reply = "Thank you for the message";
				byte[] data = reply.getBytes();
				DatagramPacket replyPacket = new DatagramPacket(data, data.length, IPAddress, port);
				socket.send(replyPacket);
				Thread.sleep(2000);
				//socket.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}