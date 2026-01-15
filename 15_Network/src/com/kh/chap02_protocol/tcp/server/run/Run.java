package com.kh.chap02_protocol.tcp.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Run 
{
	/*
	 * TCP
	 * - 서버와 클라이언트 간의 연결 지향형 통신 프로토콜
	 * - 서버와 클라이언트 모두 연결이 되어 있어야 데이터를 교환한다.
	 * - 신뢰성 있고 안전한 데이터 전달이 가능
	 * - 클라이언트와 서버 간에 연결이 되어 있으므로 실시간으로 데이터 송수신이 가능
	 * - OSI 7계층 중 전송 계층의 대표적인 프로토콜이다.
	 * - TCP는 'Transmission Control Protocol'의 약자이다.
	 * 
	 * 
	 * Socket
	 * - 클라이언트와 서버 간에 실시간 "통신"에 사용되는 객체
	 * - 소켓이 소유한 IP 번호와 포트 번호를 통해 소켓을 식별할 수 있다.
	 * - 입/출력을 위한 input / output 스트림을 소유하고 있다.
	 * 
	 * 
	 * ServerSocket
	 * - 서버에서 생성하는 소켓으로
	 *   클라이언트의 요텅을 대기한다.
	 * - 연결 요청이 들어오면 Socket을 생성하여 클라이언트에게 전달한다.
	 * 
	 * 
	 * ClientSocket(사실 그냥 Socket)
	 * - 서버와 통신에 사용되는 클라이언트 소켓
	 * - 서버의 IP 주소, 포트 번호를 통해 서버에게 연결 요청을 보낸다.
	 * 
	 */
	
	public static void main(String[] args) 
	{
		// 1) 서버 소켓의 포트 번호 지정
		// - 0 ~ 1023 : 시스템 포트 번호로 사용 불가
		// - 1024 ~ 65535 사이의 포트 번호 사용
		int port = 30000;
		
		// 2) 서버 소켓 객체 생성
		// - 현재 PC의 IP 주소와 포트 번호를 통해 소켓 생성
		ServerSocket server = null;
		
		try 
		{
			server = new ServerSocket(port);
			
			System.out.println("### 서버 시작 ###");
			
			// 3) 클라이언트의 접속 요청이 들어오기 전까지 대기
			while (true)
			{
				System.out.println(" ### 클라이언트의 요청 대기 중 ### ");
				
				// 클라이언트의 요청이 들어오기까지 대기 후,
				// 요청이 들어오면 클래이언트와 통신이 가능한 Socket을 생성
				Socket client = server.accept();
				System.out.println("### 클라이언트와 연결됨 ###");
				System.out.println("클라이언트의 IP 주소 : " + client.getInetAddress().getHostAddress());
				
				
				// 4) 연결된 클라이언트와 통신할 수 있는 입출력 스트림 생성
				try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream())); PrintWriter pw = new PrintWriter(client.getOutputStream(), true);)
				{
					
					while (true)
					{
						String message = br.readLine();
						
						if (message.equals("exit"))
						{
							System.out.println("접속 종료");
							break;
						}
						
						System.out.println("메세지 : " + message);
						pw.println("메세지 받기 성공");
						
					}
					
				}
				
			}
			
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}

























