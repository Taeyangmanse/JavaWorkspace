package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.vo.ObjectDao;
import com.kh.chap04_assist.part02_object.model.vo.ObjectsDao;

public class Run 
{
	public static void main(String[] args)
	{
		ObjectDao dao = new ObjectDao();
//		dao.fileSave();
//		dao.fileRead();
		
		ObjectsDao dao2 = new ObjectsDao();
		dao2.fileSave();
		dao2.fileRead();
	}
}
