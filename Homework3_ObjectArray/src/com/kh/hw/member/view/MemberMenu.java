package com.kh.hw.member.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu 
{
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	// 기본 생성자
	public MemberMenu()
	{
		
	}
	
	// 메인 메뉴 출력 메서드
	public void mainMenu()
	{
		main:
		while (true)
		{
			System.out.println(String.format("최대 등록 가능한 회원 수는 %d명 입니다.", mc.SIZE));
			System.out.println(String.format("\n현재 등록된 회원 수는 %d명 입니다.\n", mc.existMemberNum()));
			
			if (mc.existMemberNum() != 10)
			{
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int menuNum = sc.nextInt();	
				
				switch(menuNum)
				{
				case 1:
					this.insertMember();
					break;
					
				case 2:
					this.searchMember();
					break;
					
				case 3:
					this.updateMember();
					break;
					
				case 4:
					this.deleteMember();
					break;
					
				case 5:
					this.printAll();
					break;
					
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break main;
					
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
				}
			}
			else if (mc.existMemberNum() == 10)
			{
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int menuNum = sc.nextInt();	
				
				switch(menuNum)
				{
				case 2:
					this.searchMember();
					break;
					
				case 3:
					this.updateMember();
					break;
					
				case 4:
					this.deleteMember();
					break;
					
				case 5:
					this.printAll();
					break;
					
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break main;
					
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}
	}
	
	// 회원 등록 하기 위한 데이터를 사용자에게 입력받는 메서드
	public void insertMember()
	{
		System.out.println("새 회원을 등록합니다.");
		
		String id;
		while (true)
		{
			System.out.print("아이디 : ");
			id = sc.next();
			
			if (mc.checkId(id))
			{
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
			else
			{
				break;
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		System.out.print("이메일 : ");
		String emailString = sc.next();
		
		char gender;
		while (true)
		{
			System.out.print("성별 : ");
			gender = sc.next().charAt(0);
			
			if (gender == 'f' || gender == 'F' || gender == 'm' || gender == 'M')
			{
				break;
			}
			else
			{
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, emailString, gender, age);
		
	}
	
	// 검색 메뉴 출력 메서드
	public void searchMember()
	{
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch (num)
		{
		case 1:
			this.searchId();
			break;
			
		case 2:
			this.searchName();
			break;
			
		case 3:
			this.searchEmail();
			break;
			
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 아이디 검색을 위한 데이터를 사용자에게 입력받는 메서드
	public void searchId()
	{
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		
		System.out.println(mc.searchId(id));
	}
	
	// 이름 검색을 위한 데이터를 사용자에게 입력받는 메서드
	public void searchName()
	{
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		Member[] mArr = mc.searchName(name);
		
		if (mArr.length != 0)
		{
			for (int i = 0; i < mArr.length; i++)
			{
				System.out.println(mArr[i].inform());
			}
		}
	}
	
	// 이메일 검색을 위한 데이터를 사용자에게 입력받는 메서드
	public void searchEmail()
	{
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		
		Member[] mArr = mc.searchEmail(email);
		
		if (mArr.length != 0)
		{
			for (int i = 0; i < mArr.length; i++)
			{
				System.out.println(mArr[i].inform());
			}
		}
	}
	
	// 수정 메뉴 출력 메서드
	public void updateMember()
	{
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch (num)
		{
		case 1:
			this.updatePassword();
			break;
			
		case 2:
			this.updateName();
			break;
			
		case 3:
			this.updateEmail();
			break;
			
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 비밀번호 수정을 위한 데이터를 사용자에게 입력받는 메서드
	public void updatePassword()
	{
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		
		boolean update = mc.updatePassword(id, password);
		
		if (update)
		{
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else
		{
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	// 이름 수정을 위한 데이터를 사용자에게 입력받는 메서드
	public void updateName()
	{
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		
		boolean update = mc.updateName(id, name);
		
		if (update)
		{
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else
		{
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	// 이메일 수정을 위한 데이터를 사용자에게 입력받는 메서드
	public void updateEmail()
	{
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		boolean update = mc.updateEmail(id, email);
		
		if (update)
		{
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else
		{
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	// 삭제 메뉴 출력 메서드
	public void deleteMember()
	{
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch (num)
		{
		case 1:
			this.deleteOne();
			break;
			
		case 2:
			this.deleteAll();
			break;
			
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 하나의 회원 삭제 결과를 출력하는 메서드
	public void deleteOne()
	{
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하시겠습니까?(Y/N) : ");
		char youDid = sc.next().charAt(0);
		
		if (youDid == 'y' || youDid == 'Y')
		{
			boolean delete = mc.delete(id);
			
			if (delete)
			{
				System.out.println("성공적으로 삭제하였습니다.");
			}
			else
			{
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		else if (youDid == 'n' || youDid == 'N')
		{
			return;
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 전체 회원 삭제 결과를 출력하는 메서드
	public void deleteAll()
	{
		System.out.print("정말 삭제하시겠습니까?(Y/N) : ");
		char youDid = sc.next().charAt(0);
		
		if (youDid == 'y' || youDid == 'Y')
		{
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
		else if (youDid == 'n' || youDid == 'N')
		{
			return;
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 전체 회원을 출력하는 메서드
	public void printAll()
	{
		if (mc.existMemberNum() == 0)
		{
			System.out.println("저장된 회원이 없습니다.");
		}
		else
		{
			for (int i = 0; i < mc.existMemberNum(); i++)
			{
				if (mc.printAll()[i] != null)
				{
					System.out.println(mc.printAll()[i].inform());
				}
			}
		}
	}
}
