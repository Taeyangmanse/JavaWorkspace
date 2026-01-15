package com.kh.practice.network.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//키보드로 호스트명 또는 도메인명을 입력받는다.  
		//입력받은 호스트명을 가지고, 모든 ip 주소를 조회해서 출력한다.   
		//출력시 호스트명과 ip 주소를 분리해서, ip 주소만 출력되게 한다. 
		//조회한 ip 갯수가 1개 이상이면 루프문으로 모두 출력하고,  
		//예외처리는 try~catch로 직접 처리한다.
		
		/*
		 * 호스트명 : www.naver.com 
		 * www.naver.com는 2개의 IP주소를 가지고 있습니다.
		 * 1번 IP = 202.179.177.21
		 * 2번 IP = 125.209.222.142 
		 */
		
		System.out.print("호스트명 : ");
		String hostName = sc.next();
		
		URL url= null;
		try 
		{
			url = new URL(hostName);
			URLConnection conn = url.openConnection();
			
			InetAddress[] hostIP = InetAddress.getAllByName(hostName);
			
			System.out.println(String.format("%s는 %d개의 IP주소를 가지고 있습니다.", hostName, hostIP.length));
			
			int count = 0;
			for (InetAddress ia : hostIP)
			{
				count++;
				System.out.println(String.format("%d번 IP = %s", count, ia));
				
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}














