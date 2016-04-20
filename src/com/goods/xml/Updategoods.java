package com.goods.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Updategoods {
	
	public boolean update(String goodsname,String newgoodsname,String newgoodsprice) throws Exception{
		    boolean flag=false;
		SAXReader reader = new SAXReader(); 
	
	    Document document = reader.read(new File("src/com/file/goods.xml"));
		
		List list = document.selectNodes("//goods//good//@goodsname");
		List list2 = document.selectNodes("//goods//good//@goodsprice");
		Iterator iterator = list.iterator();
		Iterator iterator2 = list2.iterator();
		
		while(iterator.hasNext()&&iterator2.hasNext())
	  {
			
		Attribute attribute = (Attribute) iterator.next(); 
		Attribute attribute2 = (Attribute) iterator2.next(); 
		
	    if(goodsname.equalsIgnoreCase(attribute.getValue()))
	    {
	    	     flag=true;
	    	 attribute.setValue(newgoodsname);
	         attribute2.setValue(newgoodsprice);
	             
	    }
	   }
		
		XMLWriter writer = new XMLWriter(new FileOutputStream(new File("src/com/file/goods.xml"))); 
  
        writer.write(document); 

		     writer.close(); 
		     return flag;	

  }
}