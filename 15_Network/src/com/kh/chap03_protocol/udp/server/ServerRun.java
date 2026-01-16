package com.kh.chap03_protocol.udp.server;

import java.awt.Point;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerRun 
{
	/*
	 * UDP
	 * - User Datagram Protocol
	 * - 비연결 지향 프로토콜( 비연결형 프로토콜 )로 클라이언트가 데이터를 받았는지 아닌지 알빠노하는 방식의 프로토콜
	 * - 데이터 전송의 신뢰도가 낮으며, 데이터 손실이 발생할 수 있다.
	 * - 번거로운 확인 절차를 없앰으로서, 신속하게 데이터를 전달할 수 있다.
	 * - 빠른 데이터 전송이 중요한 실시간 스트리밍, 게임 등에서 사용된다.
	 * (보통 영상을 볼 때, 화면의 일부가 깨져도 전송되는 데이터의 양이 어마어마하게 많으니 그리 크게 치명적이지 않은 것처럼,
	 * 어느정도의 손실이 발생해도 큰 문제가 되지 않는 곳에서 주로 사용한다.
	 * 이런 경우 데이터의 손실보다 전송 지연이 발생하는 게 더 치명적인 경우가 많기 때문에 UDP는 속도가 빠른게 중요하다.
	 * UDP의 약자를 Unreliable Damn Protocol(신뢰할 수 없는 빌어먹을 프로토콜)이라고 부르기도 한다.)
	 * 
	 * DatagramSocket
	 * - UDP 통신에서 DatagramPacket을 보내고 받는데 사용하는 클래스
	 * - UDP는 DatagramPacket 단위로 데이터를 송수신 할 수 있다.
	 * 
	 * DatagramPacket
	 * - UDP 통신 시 데이터를 포장하는 클래스
	 * - 전송할 데이터(byte[])와 호스트의 IP주소 및 포트번호를 함께 전송한다.
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{	
		// 서버 포트 번호
		int serverPort = 30001;
		
		try 
		{
			DatagramSocket socket = new DatagramSocket(30001);
			
			
			byte[] data = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			
			// 클라이언트가 연결 요청을 보낼 때까지 대기
			socket.receive(packet);
			
			
			// 데이터를 전홍한 클라이언트의 IP 주소와 포트번호 확인
			InetAddress clientAddress = packet.getAddress();
			System.out.println("ClientAddress : " + clientAddress.getHostAddress() + " : " + packet.getPort());
			
			String str = "UDP Server에서 전송하는 데이터";
			
			byte[] serverData = str.getBytes();
			DatagramPacket packet2 = new DatagramPacket(serverData, serverData.length, clientAddress, packet.getPort());
			
			
			// 클라이언트로 데이터 전송
			socket.send(packet2);
			
			socket.close();
			
		} 
		catch (SocketException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
}










