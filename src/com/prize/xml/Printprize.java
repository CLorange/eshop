package com.prize.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Printprize {
	
	public void print()throws Exception
	{
		int count=0;
		SAXReader reader = new SAXReader(); 
		
		Document document = reader.read(new File("src/com/file/prize.xml"));
	    List list =document.selectNodes("//prizes/prize/@prizename");
		Iterator iter = list.iterator();
		
		 System.out.println("所有奖品信息为：");
					while(iter.hasNext())
					{
						 count++;
						 Attribute attribute = (Attribute) iter.next();   
						 System.out.println("奖品"+count+":"+attribute.getValue()); 
			    	 }	
	}
	
}
