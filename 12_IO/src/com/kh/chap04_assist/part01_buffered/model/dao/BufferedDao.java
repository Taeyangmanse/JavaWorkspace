package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao
{
	/*
	 * BufferedWriter/Reader
	 * 
	 */
	
	
	public void fileSave()
	{
		BufferedWriter bw = null;
		
		try 
		{
			// 보조 스트림이 Writer 계열이라면, 기반 스트림도 Writer로 생성해주어야 한다.
			bw = new BufferedWriter(new FileWriter(new File("C_Buffer.txt")));
			
			bw.write("안녕하세요.");
			
			bw.newLine();
			
			bw.write("반갑습니다.\n");
			
			// 버퍼 공간(8kb)을 비워주는 메서드
			// .close() 호출 시 자동 호출
			bw.flush();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				bw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	
	public void fileRead()
	{
		/*
		 * try - with - resource 구문(jdk7이상)
		 * 
		 * try(스트림 객체 생성; [...])
		 * {
		 * 		코드
		 * }
		 * catch(예외 클래스)
		 * {
		 *  	
		 * }
		 * 스트림 객체를 try에 붙여넣으면 
		 * 스트림 객체 생성 후 해당 블록의 구문이 실행 완료되며 알아서 자원을 반납(close)한다.
		 * 
		 * 
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("C_Buffer.txt"));)
		{
			System.out.println(br.readLine()); 	// 한 줄씩 값을 문자열로 반환
			
			String value = "";
			
			while ((value = br.readLine()) != null)
			{
				System.out.println(value);
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}














