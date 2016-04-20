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
		    //客户信息		
		  case 1:
		  {
			 
			  getview.Customerinformationmenuview();	
			break;
		  }
           //2、商品管理
		  case 2:
		  {
			  
			  getview.goodsmanagement();
	
			System.out.println("请继续选择操作-----");
			    choice=in.nextInt();
			       menu(choice,Currentuser);
			break;
		  }
			
		  case 3:
		  {
			 //奖品信息   
			  Printprize price = new Printprize();
			     price.print();
			
			System.out.println("请继续选择操作-----");
		    choice=in.nextInt();
		       menu(choice,Currentuser);
				break;
		  }
		      //购物车商品信息
		  case 4:
		  {
			    
			  Printcommodity commodity = new Printcommodity();
			   
				commodity.print();
				
			
			System.out.println("请继续选择操作-----");
		    choice=in.nextInt();
		       menu(choice,Currentuser);
				break;
		  }
		      //购物结算
		  case 5:
		  {
			    
			     getview.checkout(Currentuser);
			  
				 break;
		  }
				
			//真情回馈	
		  case 6:
		  {			 
			     getview.Luckdraw();
				     break;		
		  }	
		  //注销退出系统
		  case 0:
		  {
			  System.exit(0);
			  
			  
				break;
		  }
		  
		}
		
		
	}
	

}
