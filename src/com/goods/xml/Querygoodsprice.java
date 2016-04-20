package com.goods.xml;

import java.util.*;
import java.io.File;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class Querygoodsprice {

	public String query(String goodsname) throws Exception{
		String price = null;
		SAXReader reader = new SAXReader();
		
		Document document = reader.read(new File("src/com/file/goods.xml"));
		
		List list =document.selectNodes("//goods/good/@goodsname");
		List list2 =document.selectNodes("//goods/good/@goodsprice");
		
		Iterator iterator =list.iterator();
		Iterator iterator2=list2.iterator();
		
		while(iterator.hasNext())
		  {
			Attribute attribute = (Attribute) iterator.next(); 
			Attribute attribute2 = (Attribute) iterator2.next(); 
			
		    if(goodsname.equalsIgnoreCase(attribute.getValue()))
		    {
		    
		    	  price=attribute2.getValue();
		    	     break;
		    	
		    }	
		   }
		           return price;
		}

  }
