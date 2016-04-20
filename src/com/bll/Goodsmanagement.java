package com.bll;

import java.util.Scanner;

import com.goods.xml.Addgoods;
import com.goods.xml.Deletgoods;
import com.goods.xml.Printgoods;
import com.goods.xml.Querygoods;
import com.goods.xml.Updategoods;
import com.view.View;

public class Goodsmanagement {

	Scanner in = new Scanner(System.in);

	public void management(int choice)throws Exception
	{
		String goodsname;
		String goodsprice;
		switch(choice)
		{
		  //浏览所有商品信息	
		 case 1:
		 {
			    
		     Printgoods print = new Printgoods();
		         print.print();

			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			  management(choice);
			
		    break;
		 }
		  //添加商品
		 case 2:
		 {
			 boolean flag=false;
		   Addgoods addgoods = new Addgoods();
		   System.out.println("请输入商品名称：");
		   goodsname = in.next();
		    System.out.println("请输入商品价格：");
		    goodsprice = in.next();
		   
				flag=addgoods.add(goodsname, goodsprice);
				
			if(flag)
				System.out.println("添加商品成功！！");
			else
			 System.out.println("添加商品失败！！");
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			   management(choice);
		    break;
		 }
		 //修改商品信息	
		 case 3:
		 {
			 String newgoodsname;
			 String newgoodsprice;
			 boolean flag=false;
			 
		    Updategoods updategoods = new Updategoods();
		    System.out.println("请输入要修改的商品：");
		    goodsname = in.next();
		    System.out.println("请重新输入商品名称");
		    newgoodsname=in.next();
		    System.out.println("请重新输入商品价格：");
		    newgoodsprice = in.next();  
		    
				flag=updategoods.update(goodsname,newgoodsname,newgoodsprice);
				
			if(flag)
				System.out.println("修改商品信息成功！！");
			else
			 System.out.println("修改商品信息失败！！");
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			  management(choice);
			
		    break;
		 }
		 //按商品名称查询信息
		 case 4:
		 {
			 boolean flag=false;
			 Querygoods quergoods = new Querygoods();
			  
			 System.out.println("请输入要查询的商品名称：");
			   goodsname = in.next();		
			   
			    flag=quergoods.query(goodsname);
			    if(!flag)
					System.out.println("查询商品失败！！");
			    
	
				System.out.println("请继续选择操作-----");
				  choice=in.nextInt();
				  management(choice);
		    break;
		 }
		 //删除商品信息	
		 case 5:
		 {
			  boolean flag=false;
			  Scanner delet = new Scanner(System.in);
			  Deletgoods deletgoods = new Deletgoods();
			  
			 System.out.println("请输入要删除的商品名称：");
			 goodsname = delet.next();		
		     
			 deletgoods.delet(goodsname);
				
			if(flag)
				System.out.println("删除商品成功！！");
			else
			 System.out.println("删除商品败！！");
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			   management(choice);
		    break;
		 }
		 //返回上级菜单----系统主菜单
		 case 0:
		 {
			 View getview = new View();
			   getview.SystemMenuview();
		
		         break;
		 } 

		}

	}

}
