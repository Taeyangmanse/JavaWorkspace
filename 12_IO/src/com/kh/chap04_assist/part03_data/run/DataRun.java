package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun 
{
	public static void main(String[] args) 
	{
		DataRun dr = new DataRun();
		dr.fileSave();
		dr.fileRead();
	}

	public void fileSave()
	{
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Sample.txt"));)
		{
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('민');
			dos.writeUTF("자바");
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
	
	public void fileRead()
	{
		try(DataInputStream dis = new DataInputStream(new FileInputStream("Sample.txt"));)
		{
			// 저장한 자료형 순서대로 읽어오기
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
			System.out.println(dis.readUTF()); 	// EOF
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (EOFException e) 
		{
			System.out.println("더 이상 읽을게 없습니다.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
