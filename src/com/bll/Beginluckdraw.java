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
		    	  System.out.println("抽奖结束~~~~~~恭喜      "+luckdraw.getnumber()+"号会员中奖");
       	          System.out.println("请选择操作：");
       	            view.Luckdraw();
		    }
   
	}

}
