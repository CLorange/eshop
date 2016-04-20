package com.prize.xml;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Createprizexml {

	
	public void creat() throws Exception{

	Document document = DocumentHelper.createDocument();
	
	Element prizes = document.addElement("prizes");
	Element prize = prizes.addElement("prize");
	 
	prize.addAttribute("ID", "01");
	prize.addAttribute("prizename", "998´óÀñ°ü");
	   
	prize =prizes.addElement("prize");
	prize.addAttribute("ID", "02");
	prize.addAttribute("prizename", "º£¶û±ùÏä");
	
	  XMLWriter writer = new XMLWriter(new FileOutputStream(new File("src/com/file/prize.xml"))); 

        writer.write(document); 

		     writer.close(); 
	}
	
	}
	

	
