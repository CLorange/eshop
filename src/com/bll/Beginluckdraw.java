package com.bll;

import com.view.View;

public class Beginluckdraw {
	
	int number2=0;
	public void begin() throws Exception
	{
    
		Luckdraw2 luckdraw = new Luckdraw2();
		  View view = new View();
		
		      luckdraw.lucky();
     
		    if(luckdraw.getnumber()!=0)
		    {
		    	  System.out.println("�齱����~~~~~~��ϲ      "+luckdraw.getnumber()+"�Ż�Ա�н�");
       	          System.out.println("��ѡ�������");
       	            view.Luckdraw();
		    }
   
	}

}
