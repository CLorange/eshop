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
		//����һ�������ʵ�� ͨ�������ø�������
		View getview=new View();
		//����������
		
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
			  System.out.println(" �Ѿ��˳�ϵͳ�������� ");
			    System.exit(0);
			    break;
		  }
		
		 
		
		}

	}

}
