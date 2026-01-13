package com.kh.practice1.run;

public class HashMapRun <K, V>
{
	private Entry <K, V>[] table;
	
	// 객체 배열의 크기로서 사용
	private int capacity;
	
	// 객체 배열 내부의 초기화된 객체의 수
	private int size;
	
	
	class Entry <K, V>
	{
		K key;
		V value;
		Entry<K, V> next;
		
		public Entry(K key, V value, Entry<K, V> next)
		{
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public HashMapRun(int capacity)
	{
		
	}
	
	public int getIndex(K key)
	{
		/* 
		 * 저장 공간이 10이라면?
		 * 122345 % 10 == 5 번 인덱스
		 * 12331456678 % 10 == 8 번 인덱스
		 */
		int hash = key.hashCode();
		
		return Math.abs(hash) % capacity;
	}
	
	public void put(K key, V value)
	{
		int index = getIndex(key);
		
		if (table[index] == null)
		{
			table[index] = new Entry<>(key, value, null);
		}
		else
		{
			// 이미 해당 위치에 값이 있는 경우
			// 1. 완전 같은 key값을 사용한 경우
			// - 키값 중복으로 현재 들어온 value로 인덱스 현재 위치에 값을 덮어 씌우기
			if (table[index].key.equals(key))
			{
				table[index].value = value;
			}
			
			// 2. key는 다르지만, hash 값이 우연히 일치한 경우
			table[index].next = new Entry<>(key, value, null);
		}
	}
	
	public V get(K key)
	{
		
	}
	
	public boolean containsKey(String key)
	{
		
	}
	
	public void remove(String key)
	{
		
	}
	
	public int size()
	{
		
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(Entry e : table) 
		{
			if(e == null) continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");	
			
			Entry next = e.next;
			do 
			{
				if(next != null)
				{
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");	
					next = next.next;
				}
			}
			while(next != null); //
		}
		//sb.append(Arrays.toString(table));
		
		sb.append('}');
		
		return sb.toString();
	}
	
	
	public static void main(String[] args)
	{
		
	}
}















