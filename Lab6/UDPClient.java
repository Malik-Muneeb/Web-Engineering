import java.io.IOException;

import java.net.*;

public class UDPClient {

	public static void main(String[] args) {
		try {

			DatagramSocket Socket = new DatagramSocket();
			InetAddress IPAddress = InetAddress.getByName("127.0.0.1");
			byte[] incomingData = new byte[1024];
			String sentence = "This is a message from client";
			byte[] data = sentence.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(data, data.length, IPAddress, 9876);
			Socket.send(sendPacket);
			System.out.println("Message sent from client");
			DatagramPacket incomingPacket = new DatagramPacket(incomingData, incomingData.length);
			Socket.receive(incomingPacket);
			String response = new String(incomingPacket.getData());
			System.out.println("Response from server:" + response);
			//Socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}