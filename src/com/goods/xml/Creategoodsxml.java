package com.goods.xml;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Creategoodsxml {

	
	public void creat() throws Exception{

	Document document = DocumentHelper.createDocument();
	
	Element goods = document.addElement("goods");
	Element good = goods.addElement("good");
	
	good.addAttribute("goodsname", "000");
	good.addAttribute("goodsprice", "12");	
	   
	good =goods.addElement("good");
	
	good.addAttribute("goodsname", "111");
	good.addAttribute("goodsprice", "13");	
	
	
	  
	  XMLWriter writer = new XMLWriter(new FileOutputStream(new File("src/com/file/goods.xml"))); 

        writer.write(document); 

		     writer.close(); 
	}
	public static void main(String[] args) {
		try {
			new Creategoodsxml().creat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
