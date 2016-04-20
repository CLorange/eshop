package com.goods.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Deletgoods {

	public boolean delet(String goodsname) throws Exception{
	
		boolean flag=false;
		SAXReader reader = new SAXReader(); 
	
         Document document = reader.read(new File("src/com/file/goods.xml"));
		
		List list =document.selectNodes("//goods");
		
		Iterator iterator =list.iterator();
	    while(iterator.hasNext())
		{
			Element element = (Element) iterator.next();
			
			Iterator userelement = element.elementIterator("goodsname");
			
			while(userelement.hasNext())
			{
				Element user = (Element) userelement.next();
	    		
	    	     if(goodsname.equalsIgnoreCase(user.attributeValue(goodsname)));
	    	     {
	    	         element.remove(user); 
	    	          flag=true;
	    	     }
	    }	
	    		
	    		
	    	XMLWriter writer = new XMLWriter(new FileOutputStream(new File("src/com/file/goods.xml"))); 

	        writer.write(document); 

			     writer.close(); 
	   
	 }
	    return flag;
  }
	  
}
