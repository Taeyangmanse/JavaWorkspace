package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors 
{
	Scanner sc = new Scanner(System.in);
	
	public void rps()
	{
		/*
		 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
		 * 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
		 * 사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
		 * 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		 */
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		String ss = "가위";
		String pp = "보";
		String rc = "바위";
		
		int count = 0;
		int win = 0;
		int def = 0;
		int bb = 0;
		
		while (true)
		{
			int random = (int)(Math.random() * 3 + 1);
			String com = "";
			
			int num = 0;
			
			switch (random)
			{
			case 1:
				com = ss;
				break;
			case 2:
				com = rc;
				break;
			case 3:
				com = pp;
				break;
			}	
			
			System.out.print("가위바위보 : ");
			String rsp = sc.next();
			
			if (rsp.equals("exit"))
			{
				System.out.printf("%d전 %d승 %d무 %d패", count, win, bb, def);
				break;
			}
			else if (!(rsp.equals(rc) || rsp.equals(ss) || rsp.equals(pp)))
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			else
			{
				switch (rsp)
				{
				case "가위":
					num = 1;
					break;
				case "바위":
					num = 2;
					break;
				case "보":
					num = 3;
					break;
				}
				
				System.out.println("컴퓨터 : " + com);
				System.out.printf("%s : %s\n", name, rsp);
				
				if (num == random)
				{
					count++;
					bb++;
					System.out.println("비겼습니다.");
				}
				else if (num > random && num == random + 1)
				{
					count++;
					win++;
					System.out.println("이겼습니다!");
				}
				else if (num < random && num == random - 1)
				{
					count++;
					def++;
					System.out.println("졌습니다 ㅠㅠ");
				}
				else if (num > random && num == random + 2)
				{
					count++;
					def++;
					System.out.println("졌습니다 ㅠㅠ");
				}
				else
				{
					count++;
					win++;
					System.out.println("이겼습니다!");
				}
			}	
		}
	}
}
