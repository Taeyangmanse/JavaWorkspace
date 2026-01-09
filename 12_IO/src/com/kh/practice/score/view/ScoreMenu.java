package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu 
{
	private Scanner sc = new Scanner(System.in);
	
	private ScoreController scr = new ScoreController();
	
	public void mainMenu()
	{
		while (true)
		{
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch (menuNum) 
			{
			case 1:
				saveScore();
				break;
				
			case 2: 
				readScore();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void saveScore()
	{
		int num = 0;
		
		while(true)
		{
			System.out.printf("%d번째 학생 정보 기록\n", num);
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum / 3;
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			num++;
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char key = sc.next().toUpperCase().charAt(0);
			
			if (key == 'N')
			{
				return;
			}
		}
	}
	
	public void readScore()
	{
		int count = 0;
		
		int sumAll = 0;
		
		double avgAll = 0.0;
		
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		try 
		{
			DataInputStream dis = scr.readScore();
			
			while(true)
			{
				try
				{
					String name = dis.readUTF();
					int kor = dis.readInt();
					int eng = dis.readInt();
					int math = dis.readInt();
					int sum = dis.readInt();
					double avg = dis.readDouble();
					
					
					System.out.println(String.format("%s \t %d \t %d \t %d \t %d \t %f\n", name, kor, eng, math, sum, avg));
					count++;
					sumAll += sum;
					avgAll += avg;
				}
				catch (EOFException e) 
				{
					System.out.println("읽은 횟수 \t 전체 합계 \t 전체 평균");
					System.out.printf("%d \t %d \t %f\n\n", count, sumAll, avgAll);
					break;
				}
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












