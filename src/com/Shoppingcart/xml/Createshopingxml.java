package com.Shoppingcart.xml;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Createshopingxml {

	
	public void creat() throws Exception{

		Document document = DocumentHelper.createDocument();
		
		Element cart = document.addElement("cart");
		Element goods = cart.addElement("goods");
	
		goods.addAttribute("goodsname", "orange");
		goods.addAttribute("goodsprice", "3");
		goods.addAttribute("goodsnumber", "12");
		   
		goods =cart.addElement("goods");
		
		goods.addAttribute("goodsname", "œ„Ω∂");
		goods.addAttribute("goodsprice", "30");
		goods.addAttribute("goodsnumber", "12");
		
		
		  
		  XMLWriter writer = new XMLWriter(new FileOutputStream(new File("src/com/file/shoppingcart.xml"))); 

	        writer.write(document); 

			     writer.close(); 
		}
	public static void main(String[] args) {
		try {
			new Createshopingxml().creat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
