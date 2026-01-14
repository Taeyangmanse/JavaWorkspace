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
		this.capacity = capacity;
		this.table = new Entry[capacity];
	}
	
	public int getIndex(K key)
	{
		/* 
		 * 저장 공간이 10이라면?
		 * 122345 % 10 == 5 번 인덱스
		 * 12331456678 % 10 == 8 번 인덱스
		 * 7453985328 % 10 == 8번 인덱스
		 */
		int hash = key.hashCode();
		
		return Math.abs(hash) % capacity;
	}
	
	public void put(K key, V value)
	{
		// getIndex 함수 호출 후 반환값으로 table의 index에 접근
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
				return;
			}
			else
			{
				// 2. key는 다르지만, hash 값이 우연히 일치한 경우
//				table[index].next = new Entry<>(key, value, null);
				
				Entry<K, V> next = table[index];
				
				while(true)
				{
					// 다음으로 뽑은 Entry의 key값이 현재 전달받은 key값과 동일한 경우(중복)
					if (next.key.equals(key))
					{
						next.value = value;
						return;
					}
					
					// 현재 Entry가 마지막 Entry인 경우
					if (next.next == null)
					{
						next.next = new Entry<>(key, value, null);
						break;
					}
					
					next = next.next;
				}
			}
			
			size++;
			
		}
	}
	
	public V get(K key)
	{
		// getIndex함수 호출 후 반환 값으로 table의 index에 접근
		int index = getIndex(key);
		Entry<K, V> entry = table[index];
		
		if (entry == null)
		{
			return null;
		}
		
		while(true)
		{
			if (entry == null)
			{
				break;
			}
			
			if (entry.key.equals(key))
			{
				return entry.value;
			}
			
			entry = entry.next;
		}
		
		return null;
		
	}
	
	public boolean containsKey(K key)
	{
		int index = getIndex(key);
		
		Entry<K, V> entry = table[index];
		
		if (entry == null)
		{
			return false;
		}
		
		do
		{
			if (entry.key.equals(key))
			{
				return true;
			}
			
			entry = entry.next;
			
		}
		while(entry != null);
		
		return false;
	}
	
	public void remove(K key)
	{
		int index = getIndex(key);
		
		Entry<K, V> entry = table[index];
		
		if (entry == null)
		{
			return;
		}
		
		Entry<K, V> prev = null;
		
		do
		{
			if (entry.key.equals(key))
			{
				if (table[index] == entry)
				{
					table[index] = entry.next;
				}
				else
				{
					prev.next = entry.next;
				}
			prev = entry;	// 이전 값 보관하기
			entry = entry.next;
			}			
		}
		while(entry != null);
	}
	
	public int size()
	{
		return size;
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
//		HashMapRun<String, Snack> hm = new HashMapRun<>(10);
//		hm.put("새우깡", new Snack("소금맛", 500));
//		System.out.println(hm.get("새우깡"));
	}
}















