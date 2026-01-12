package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController 
{
	private List list = new ArrayList();
	
	public int addList(Music music)
	{
		try
		{
			list.add(music);
			
			return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	public int addAtZero(Music music)
	{
		try
		{
			list.add(0, music);
			
			return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}
	
	public List printAll()
	{
		return list;
	}
	
	public Music searchMusic(String title)
	{
		Music m = null;
		
		for (Object o : list)
		{
			// 제네릭이 없으면 이렇게 써야 함(다운 캐스팅 필요)
			Music music = (Music) o;
			
			if (music.getTitle().equals(title))
			{
				m = music;
				break;
			}
		}
		
		return m;
	}
	
	public Music removeMusic(String title)
	{
		Music m = null;
		
		// 방법 1.
		for (int i = 0; i < list.size(); i++)
		{
			Music music = (Music) list.get(i);
			
			if (music.getTitle().equals(title))
			{
				m = music; // 사실 할 필요 없이 기본적으로 remove() 메서드는 삭제하려는 객체를 한번 반환해주고 삭제한다
				list.remove(i);
			}
		}
		
		// 방법 2.
//		Object o = searchMusic(title);
//		m = (Music)o;
//		list.remove(o);
		
		return m;
	}
	
	public Music setMusic(String title, Music music)
	{
		try 
		{
			Music result = null;
			int index = -1;
			
			for (int i = 0; i < list.size(); i++)
			{
				Music m = (Music) list.get(i);
				if (m.getTitle().equals(title))
				{
					index = i;
					result = m;
					break;
				}
			}
			list.set(index, music);
			
			return result;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public int ascTitle()
	{
		Collections.sort(list, new AscTitle());
		
		return 1;
	}
	
	public int descSinger()
	{
		Collections.sort(list);
		
		return 1;
	}
	
	
	
	
	
	
}








