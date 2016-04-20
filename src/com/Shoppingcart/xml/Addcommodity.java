package com.Shoppingcart.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.goods.xml.Querygoodsprice;

public class Addcommodity {
	
	public boolean add(String goodsname,String goodsnumber) throws Exception
	{
	     boolean flag=false;
	     String goodsprice;
	     Querygoodsprice price = new Querygoodsprice();
	     goodsprice = price.query(goodsname);
	 SAXReader reader = new SAXReader();
	 
	 Document document =reader.read(new File("src/com/file/shoppingcart.xml"));
	 
	 List list =document.selectNodes("//cart");
		
	 Iterator iterator =list.iterator();
	 
	 while(iterator.hasNext())
	 {
		 Element cart = (Element) iterator.next();
		 Element goods = cart.addElement("goods");
		 
		 if(!(goodsprice==null))
		 {
		   goods.addAttribute("goodsname", goodsname);
		   goods.addAttribute("goodsprice", goodsprice);
		   goods.addAttribute("goodsnumber", goodsnumber);
		        flag = true;
		 }
	 }
	 XMLWriter writer = new XMLWriter(new FileOutputStream(new File("src/com/file/shoppingcart.xml"))); 

     writer.write(document); 

		     writer.close(); 
	   return flag;
}

}
