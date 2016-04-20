
package com.Shoppingcart.xml;

    import java.io.File;
	import java.util.Iterator;
	import java.util.List;

	import org.dom4j.Attribute;
	import org.dom4j.Document;
	import org.dom4j.Element;
	import org.dom4j.io.SAXReader;
public class Calculation {

		public int calculate()throws Exception
		{
			int summoney=0;
			SAXReader reader = new SAXReader(); 
			
			Document document = reader.read(new File("src/com/file/shoppingcart.xml"));
		   
		    List list2 =document.selectNodes("//cart/goods/@goodsprice");
		    List list3 =document.selectNodes("//cart/goods/@goodsnumber");

			Iterator iter2 = list2.iterator();
			Iterator iter3 = list3.iterator();
	
		    while(iter2.hasNext())
			{
							
				Attribute attribute2 = (Attribute) iter2.next();
				Attribute attribute3 = (Attribute) iter3.next();
							summoney = summoney+(Integer.parseInt(attribute2.getValue()))+(Integer.parseInt(attribute3.getValue()));
			}	
			
			return summoney;			
						
		}
	}
