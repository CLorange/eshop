package com.bll;

import java.io.File;
import java.util.Scanner;

import com.Shoppingcart.xml.Printcommodity;
import com.goods.xml.Printgoods;
import com.prize.xml.Printprize;
import com.view.*;
public class Systemmenu {
	
	Scanner in = new Scanner(System.in);
	int choice;
	 View getview = new View();
  public void menu(int choice,String Currentuser)throws Exception
	{
		
		switch (choice) 
		{
		    //�ͻ���Ϣ		
		  case 1:
		  {
			 
			  getview.Customerinformationmenuview();	
			break;
		  }
           //2����Ʒ����
		  case 2:
		  {
			  
			  getview.goodsmanagement();
	
			System.out.println("�����ѡ�����-----");
			    choice=in.nextInt();
			       menu(choice,Currentuser);
			break;
		  }
			
		  case 3:
		  {
			 //��Ʒ��Ϣ   
			  Printprize price = new Printprize();
			     price.print();
			
			System.out.println("�����ѡ�����-----");
		    choice=in.nextInt();
		       menu(choice,Currentuser);
				break;
		  }
		      //���ﳵ��Ʒ��Ϣ
		  case 4:
		  {
			    
			  Printcommodity commodity = new Printcommodity();
			   
				commodity.print();
				
			
			System.out.println("�����ѡ�����-----");
		    choice=in.nextInt();
		       menu(choice,Currentuser);
				break;
		  }
		      //�������
		  case 5:
		  {
			    
			     getview.checkout(Currentuser);
			  
				 break;
		  }
				
			//�������	
		  case 6:
		  {			 
			     getview.Luckdraw();
				     break;		
		  }	
		  //ע���˳�ϵͳ
		  case 0:
		  {
			  System.exit(0);
			  
			  
				break;
		  }
		  
		}
		
		
	}
	

}
