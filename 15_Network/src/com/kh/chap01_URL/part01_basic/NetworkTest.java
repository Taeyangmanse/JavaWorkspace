package com.kh.chap01_URL.part01_basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

import javax.management.openmbean.OpenDataException;

public class NetworkTest 
{
	public static void main(String[] args) {
		NetworkTest nt = new NetworkTest();
		nt.test1();
		nt.test2();
		nt.test3();
	}
	
	/*
	 * IP 
	 * - INetAddress (자바에서 IP 주소를 가지고 있는 클래스
	 * - 10. 10. 10. 10 형태의 4바이트로 이루어진 주소값 
	 * - Hostname = naver.com, iei.or.kr = 도메인 명'
	 * 
	 */
	
	public void test1()
	{
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress google = InetAddress.getByName("Google.com");
			System.out.println(google.getHostAddress());
			
			
			
			InetAddress[] arr = InetAddress.getAllByName("google.com");
			System.out.println(Arrays.toString(arr));
			
			
			
			// 내 컴퓨터의 ip 주소를 얻어오는 법
			// InetAddress.getLocalHost();
			
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void test2()
	{
		/*
		 * URL
		 * - 인터넷 상에 존재하는 서버들의 자원에 저근할 수 있는 주소 
		 * - 자바에서는 URL클래스를 통행 URL자원을 다둘 수 있다.
		 * - 실제 URL지워네 대한 객체를 생성하여 자원에 연결하고 데이터를 읽어올 수 ㅇ싿
		 * 
		 * URL 주소
		 * - https: 
		 *  통신 프로토콜 ( 통신 규약) 
		 *  - http, https, smtp, ....
		 * - hostname : 도메인 이름(ip주소) : khedu.co.kr
		 * - 자원 경로 (Path) : 호스트 이름과 포트번호 내부에 자원이 존재하는 세부 경로 
		 * - 포트(port) : 기본 포트 번호는 생략 가능
		 * 서비스 번호ㅡ 호스트 내의 특정 서비스를 가리키는 논리적인 번호
		 * 포트ㅡ번호 멸로 더양한 서비스를 제공할 수 있다.
		 * 
		 * querystring : 자원을 덛기 위해 쇼ㅓ버에 전달해야 하ㅡㄴ 값들
		 * ? no = xxx&cpage = 1;
		 * 
		 * 
		 * 
		 */
		
		
		try {
			URL url = new URL("https://kh-academy.co.kr/login/mypage.kh?dupinfo=0");
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort() + " ::" + url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void test3()
	{
		/*
		 * URLConnection
		 * - 네트워크 상의 원격 서버와 통신하여 자원을 입출력 할 수 있는 스트림을 제공하는 클래스
		 * - URL로 연결할 자원을 기술하고, URLConnection으로 입출력 스트림을 상요하여 입출력을 ㄹ할 수 있다.
		 * 
		 */
		
		String address = "https://khedu.co.kr/upload/project/2025062512331962_1.png";
		
		BufferedInputStream bis = null;
		
		BufferedOutputStream bos = null;
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			
			// 입력 스트릠 생성
			bos = new BufferedOutputStream(new FileOutputStream("Project.png"));
			
			
			int data = 0;
			
			while ((data = bis.read()) != -1)
			{
				bos.write(data);
			}
			
			System.out.println("저장 완료");
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
}





































