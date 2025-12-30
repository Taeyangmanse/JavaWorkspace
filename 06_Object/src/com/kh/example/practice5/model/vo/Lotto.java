package com.kh.example.practice5.model.vo;

public class Lotto 
{
//	- lotto : int[]
//  초기화 블럭 사용, 중복하지 않는 1 ~ 45까지의 난수들로 6개 초기화
//	+ Lotto()
//	+ information() : void
	// 반복문을 이용하여 배열 출력
	private int lotto[];
	{
		lotto = new int[6];
		lotto[0] = (int)(Math.random() * 44 + 1);
		
		for (int i = 0; i < lotto.length; i++)
		{
			boolean isTrue = true;
			
			while(true)
			{
				int num = (int)(Math.random() * 45 + 1);
				for (int j = 0; j < i; j++)
				{
					if (num == lotto[j])
					{
						isTrue = false;
						break;
					}
					else
					{
						isTrue = true;
					}
				}
				if (isTrue)
				{
					lotto[i] = num;
					break;
				}
			}
		}
	}
	
	public Lotto()
	{
		
	}
	
	public void information()
	{
		for (int i = 0; i < lotto.length; i++)
		{
			System.out.print(lotto[i] + " ");
		}
	}
}
