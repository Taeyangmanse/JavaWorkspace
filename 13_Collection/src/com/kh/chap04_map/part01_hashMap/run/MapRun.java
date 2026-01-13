package com.kh.chap04_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class MapRun
{
	public static void main(String[] args)
	{
		
		/*
		 * HashMap
		 * - 많은 양의 데이터를 "빠르게 저장하고 관리"하기 위하여 사용하는 클래스로,
		 *   key 값과 value 값을 함께 저장한다.
		 * - 계층 구조 상 List, Set 계열과 다른 Map 계열 인터페이스를 상속한 클래스로,
		 *   사용하는 메서드가 다르다.
		 * - 데이터를 저장할 때 key값과 value를 한 쌍으로 저장하고, key를 통해 value가 저장된 위치에 접근한다.
		 * - key값의 중복을 허용하지 않는다.
		 * - 동일한 key값에 데이터를 저장하면, 마지막으로 추가된 value값이 저장된다.  
		 *   
		 */
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		// 1. put(K key, V value) : map 공간에 key, value를 세트로 추가하는 메서드
		hm.put("다이제", new Snack("초코맛", 1000));
		hm.put("칸초", new Snack("초코맛", 400));
		hm.put("두쫀쿠", new Snack("자본주의맛", 1200));
		hm.put("포카칩", new Snack("어니언맛", 600));
		
		hm.put("다이제", new Snack("오리지널맛", 800));
		
		System.out.println(hm);
		
		
		// 2. get(K key) : V -> HashMap에서 key와 일치하는 value값을 찾는 메서드
		System.out.println(hm.get("두쫀쿠"));
		
		
		// 3. size() : 초기화된 데이터 수 반환
		System.out.println(hm.size());
		
		
		// 4. replace(K key, V value)
		// : hashMap에서 key값과 일치하는 값을 찾아, 새로 전달된 value로 "교체"하는 메서드
		// put은 중복값이 있으면 교체, 없으면 추가이지만,
		// replace는 반드시 해당 key값이 존재해야만 한다.
		hm.replace("칸초", new Snack("슈크림맛", 500));
		System.out.println(hm);
		
		
		// 5. remove(K key) : key값과 일치하는 값을 찾아서 제거해주는 메서드
		// key와 value를 함께 제거한다.
		hm.remove("다이제");
		System.out.println(hm.get("다이제"));
		
		System.out.println("=============================================");
		
		
		// Map 계열 데이터 반복문 돌리기
		// 방법 1. keySet()을 활용한 반복
		// - keySet() : 맵의 키 값들을 따로 Set에 담아 반환해주는 메서드
		Set<String> set = hm.keySet();
		for (String key : set)
		{
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		
		// 방법 2. entrySet()을 활용한 반복
		// - 맵의 key와 value 값이 담긴 entry를 set에 담아 반환해주는 메서드.
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		for (Entry<String, Snack> entry : entrySet)
		{
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
	}
}









