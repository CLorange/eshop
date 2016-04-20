package com.bll;

import java.io.File;
import com.view.*;

public class Mainfunction {
   /**
	 * @param write by orange at 2016-03-07 
	 */
	public static void main(String args[]) throws Exception
	{
		int choice;
		//创建一界面对象实例 通过它调用各个界面
		View getview=new View();
		//进入主界面
		
		choice=getview.mainview();
		switch(choice)
		{
		  case 1:
		 {
			    getview.Loginview();
			       break;
		} 
		  case 0:
		  {
			  System.out.println(" 已经退出系统！！！！ ");
			    System.exit(0);
			    break;
		  }
		
		 
		
		}

	}

}
