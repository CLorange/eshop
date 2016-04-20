package com.bll;

import java.io.File;
import java.util.Scanner;

import com.Shoppingcart.xml.Addcommodity;
import com.Shoppingcart.xml.Updatecommodity;
import com.goods.xml.Addgoods;
import com.goods.xml.Deletgoods;
import com.goods.xml.Updategoods;
import com.view.Printticket;
import com.view.View;

public class Goodscheckout {
	
	
	public void checkout(int chioce,String Currentuser)throws Exception
	{
		Scanner in = new Scanner(System.in);
		String goodsname;
		String goodsprice;
		int chioce2;
		switch(chioce)
		{
		//添加购买产品
		case 1:
		{
			boolean flag=false;
			Addcommodity addgoods = new Addcommodity();
			
			 System.out.println("请输入产品名称：");
			 goodsname = in.next();
			 System.out.println("请输入购买数量：");
			 goodsprice = in.next();
			try {
				
				flag=addgoods.add(goodsname, goodsprice);
				if(flag)
					System.out.println("商品购买成功！！！！");
				else 
					System.out.println("购买商品失败！！");
			     //用户继续输入操作类型
 
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("请继续选择操作：");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
			break;
		}
		//修改购买产品数量
		case 2:
		{
			boolean flag = false;
			System.out.println("请输入修改产品名称：");
			 goodsname = in.next();
			 System.out.println("请重新输入购买数量：");
			 goodsprice = in.next();
			
			Updatecommodity updategoods = new Updatecommodity();
			 try {
				 
				flag=updategoods.update(goodsname, goodsprice);
				if(flag)
					System.out.println("修改商品成功！！");
				else 
					System.out.println("修改商品失败！！");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("请继续选择操作：");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
	
			break;
		}
		//删除购买产品
		case 3:
		{
			boolean flag = false;
			System.out.println("请输入要删除的产品名称：");
			 goodsname = in.next();
			 Deletgoods deletgoods= new Deletgoods();
			 try {
				 
				//flag=deletgoods.delet(goodsname);
				if(flag)
					System.out.println("删除商品成功！！");
				else 
					System.out.println("删除商品失败！！");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("请继续选择操作：");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
			break;
		}
		   //结算并打印
		case 4:
		{
			boolean flag=false;
			Printticket printchekout = new Printticket();
			 flag=printchekout.printfingtickte(Currentuser);
			 if(flag)
					System.out.println("删除商品成功！！");
				else 
					System.out.println("删除商品失败！！");
			
			System.out.println("请继续选择操作：");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
			 break;
		}
		//返回上级----系统主菜单
		case 0:
		{
			View getview = new View();
			 getview.SystemMenuview();
			
			 break;
		}
		
	}
	
  }
}
