package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager 
{
	public static void main(String[] args) 
	{
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("댕댕이", "포메라니안", 3);
		arr[1] = new Dog("돌돌이", "진도", 4);
		arr[2] = new Cat("나비", "페르시안", "한국", "검정색");
		arr[3] = new Dog("땡구", "허스키", 5);
		arr[4] = new Cat("키티", "스핑크스", "이집트", "갈색");
		
		for(Animal a : arr)
		{
			a.speak();
		}
	}
}
