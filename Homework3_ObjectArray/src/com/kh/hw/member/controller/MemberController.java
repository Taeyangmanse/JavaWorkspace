package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController 
{
	private Member[] m = new Member[SIZE];
	
	public static final int SIZE = 10;
	
	
	// 현재 존재하는 멤버 수 반환
	public int existMemberNum()
	{
		int count = 0;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null)
			{
				count++;
			}
		}
		return count;
	}
	
	// 아이디 중복 확인하는 메서드
	public boolean checkId(String inputId)
	{
		boolean isDup = false;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getId().equals(inputId))
			{
				isDup = true;
				break;
			}
		}
		return isDup;
	}
	
	// Member 객체를 객체 배열에 저장하는 메서드
	public void insertMember(String id, String name, String password, String email, char gender, int age)
	{
		if (existMemberNum() == 0)
		{
			m[0] = new Member(id, name, password, email, gender, age);
		}
		else
		{
			for (int i = 0; i <= existMemberNum(); i++)
			{
				if (i == existMemberNum())
				{
					m[i] = new Member(id, name, password, email, gender, age);
					break;
				}
			}
		}
	}
	
	// id로 회원을 조회하는 메서드
	public String searchId(String id)
	{
		boolean isSearched = false;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null)
			{
				if (m[i].getId().equals(id))
				{
					System.out.println("찾으신 회원 조회 결과입니다.");
					return m[i].inform();
				}
			}
		}
		return "검색 결과가 없습니다.";
	}
	
	// 이름으로 회원을 조회하는 메서드
	public Member[] searchName(String name)
	{
		int count = 0;
		
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getName().equals(name))
			{
				count++;
			}
		}
		
		if (count == 0)
		{
			System.out.println("검색 결과가 없습니다.");
			
			return null;
		}
		else 
		{
			Member[] mArr = new Member[count];
			
			int index = 0;
			
			for (int i = 0; i < m.length; i++)
			{
				if (m[i] != null && m[i].getName().equals(name))
				{
					mArr[index] = m[i];
					index++;
				}
			}
			
			return mArr;
		}
	}
	
	// 이메일로 회원을 조회하는 메서드
	public Member[] searchEmail(String email)
	{		
		int count = 0;
		
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getEmail().equals(email))
			{
				count++;
			}
		}
		
		if (count == 0)
		{
			System.out.println("검색 결과가 없습니다.");
			
			return null;
		}
		else
		{
			Member[] mArr = new Member[count];
			
			int index = 0;
			
			for (int i = 0; i < m.length; i++)
			{
				if (m[i] != null && m[i].getName().equals(email))
				{
					mArr[index] = m[i];
					index++;
				}
			}
			
			return mArr;
		}
	}
	
	// 비밀번호 변경 메서드
	public boolean updatePassword(String id, String password)
	{
		boolean isSearched = false;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getId().equals(id))
			{
				m[i].setPassword(password);
				isSearched = true;
				break;
			}
		}
		return isSearched;
	}
	
	// 이름 변경 메서드
	public boolean updateName(String id, String name)
	{
		boolean isSearched = false;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getId().equals(id))
			{
				m[i].setName(name);
				isSearched = true;
				break;
			}
		}
		return isSearched;
	}
	
	// 이메일 변경 메서드
	public boolean updateEmail(String id, String email)
	{
		boolean isSearched = false;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getId().equals(id))
			{
				m[i].setEmail(email);
				isSearched = true;
				break;
			}
		}
		return isSearched;
	}
	
	// 한 회원만 삭제하는 메서드
	public boolean delete(String id)
	{
		boolean isSearched = false;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null && m[i].getId().equals(id))
			{
				m[i] = null;
				isSearched = true;
				break;
			}
		}
		return isSearched;
	}
	
	// 전체 회원을 삭제하는 메서드
	public void delete()
	{
		for (int i = 0; i < m.length; i++)
		{
			m[i] = null;
		}
	}
	
	// Member 객체 반환 메서드
	public Member[] printAll()
	{
		return m;
	}
}
