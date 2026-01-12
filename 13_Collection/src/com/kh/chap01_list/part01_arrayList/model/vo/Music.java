package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music implements Comparable<Music>
{

	private String title;
	private String artist;
	
	public Music() {}

	public Music(String title, String artist)
	{
		this.title = title;
		this.artist = artist;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	@Override
	public String toString() 
	{
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		/*
		 * compareTo() 메서드
		 * - 현재(this) 객체와 매개변수로 전달된 객체 간의 비교를 수행하는 메서드
		 * - 반환값으로 양수, 0, 음수의 값들이 반환되도록 설정해야 한다.
		 * - sort() 메서드에서 호출한다.
		 * - 양수 -> 자리 유지
		 * - 음수 -> 자리 교체
		 * - 0 -> 자리 유지 
		 * 
		 * 
		 *  내가 구현하고자 하는 정렬 조건
		 *  1. 제목 기준 오름차순 정렬
		 *  - 현재 객체.비교메서드(다른 객체)
		 *  
		 *  2. 제목 기준 내림차순 정렬
		 *  - 다른 객체.비교메서드(현재객체)
		 *  
		 * 
		 */
		// 제목기준 오름차순 정렬
		this.title.compareTo(o.title);
		
		// 제목기준 내림차순 정렬
		o.title.compareTo(this.title);
		
		// 3. 제목, 아티스트 기준 오름차순 정렬
		// 제목기준 오름차순 정렬 결과가 0인 경우
		if (this.title.compareTo(o.title) == 0)	
		{
			this.artist.compareTo(o.artist);	// 아티스트 기준 오름차순 정렬 사용
		}
		
		// 타이틀 기준 오름차순 정렬
		return this.title.compareTo(o.title);
	}
	
	
	
}











