package com.kh.chap01_innerClass.part02_static.model.dto;

import javax.xml.crypto.Data;

public class KaKaoUserInfoResponse 
{
	
	/*
	 * DTO
	 * - Data Transfer Object
	 * - 데이터(값)를 전송하기 위한 목적으로 사용하는 클래스
	 * - API 서버, DB 서버 등에서 데이터를 송수신하기 위한 용도의 객체들을 정의하는 클래스
	 * - VO 클래스와 다르게 데이터의 송수신이 주 목적이다.
	 * - 때문에 불필요한 메서드들이 존재하지 않는다. (equals, hashcode, setter, ...)
	 * - API 서버들에는 다양한 서비스들이 존재하며, 각 서비스마다 요구하는 데이터의 형식 및 반환되는 응답의 형식이 다양하기 때문에
	 * 이에 맞춰서 DTO 클래스를 설계 시 굉장히 많은 양의 클래스들이 나온다.
	 * - 이렇게 너무 많은 DTO 클래스가 파일로 존재하면 관리가 힘들어지므로,
	 * 필요한 클래스들을 하나의 파일로 모아서 관리하는게 일반적이다.
	 * 
	 * 
	 * VO
	 * - Value Object
	 * - 가치가 있는 클래스를 표현하기 위한 목적으로 사용하는 클래스
	 * - 객체 지향적으로 설계된 클래스
	 * - 어플리케이션의 핵심적인 역할을 수행하는 클래스를 정의하는 클래스이며, 
	 * 데이터의 불변성이 유지되어야 하기 때문에 데이터를 중간에 변경할 수 있는 setter 메서드는 정의하지 않는다.
	 * - 캡슐화 및 상속이 구현되어 있으며, equals & hashcode등 객체의 기능을 정의하는 메서드들이 있다.
	 * 
	 * 
	 */
	
	
	private long id;
	private Data synchedAt;
	private KaKaoAccount kaKaoAccount;
	
	
	public static class KaKaoAccount
	{
		// 프로필 제공 동의 항목
		private boolean profileNeedsAgreement;
		
		private Profile profile;
		
		
	}
	
	
	public static class Profile
	{
		private String nickName;
		private String thunmbnailImageUrl;
		
	}
	
	
}



















