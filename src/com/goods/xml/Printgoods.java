package com.goods.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Printgoods {
	
	public void print()throws Exception
	{
		SAXReader reader = new SAXReader(); 
		
		Document document = reader.read(new File("src/com/file/goods.xml"));
	    List list =document.selectNodes("//goods/good/@goodsname");
	    List list2 =document.selectNodes("//goods/good/@goodsprice");
	    
		Iterator iter = list.iterator();
		Iterator iter2 = list2.iterator();
		
		 System.out.println("所有商品信息为：");
					while(iter.hasNext())
					{
						Attribute attribute = (Attribute) iter.next();
						Attribute attribute2 = (Attribute) iter2.next();
						
						System.out.println("商品名称："+attribute.getValue()+"    商品价格"+attribute2.getValue()+"元/kg"); 
			    	  }	
	}
	public static void main(String[] args) {
		try {
			new Printgoods().print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
