package com.bll;

import java.io.File;
import java.util.Scanner;

import com.user.xml.Adduser;
import com.user.xml.Deletuser;
import com.user.xml.Printuser;
import com.user.xml.Queryuser;
import com.user.xml.Updateuser;
import com.view.View;

public class Customerinformation {
	
	Scanner in = new Scanner(System.in);
	String username;
	String password;
	String newusername;
	int chioce;
	public void customer(int choice)throws Exception
	{
		switch(choice)
		{
		  //浏览所有客户	
		 case 1:
		 {
		   Printuser user = new Printuser();
		    
				user.print();
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			  customer(choice);
			
		    break;
		 }
		  //添加客户信息
		 case 2:
		 {
			 boolean flag=false;
		   Adduser adduser = new Adduser();
		   System.out.println("请输入用户名：");
		    username = in.next();
		    System.out.println("请输入用户登录密码：");
		    password = in.next();
		   
				flag=adduser.add(username, password);

			if(flag)
				System.out.println("添加用户成功！！");
			else
			 System.out.println("添加用户失败！！");
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			  customer(choice);
		    break;
		 }
		 //修改客户信息	
		 case 3:
		 {
			 boolean flag=false;
			 
		    Updateuser updateuser = new Updateuser();
		    System.out.println("请输入要修改的用户：");
		     username = in.next();
		    System.out.println("请重新输入用户名");
		     newusername=in.next();
		    System.out.println("请重新输入用户登录密码：");
		    password = in.next();  
		   
				flag=updateuser.update(username,newusername,password);
				
			if(flag)
				System.out.println("修改用户成功！！");
			else
			 System.out.println("修改用户失败！！");
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			  customer(choice);
			
		    break;
		 }
		 //按姓名查询客户信息
		 case 4:
		 {
			 boolean flag;
			 Queryuser queryuser = new Queryuser();
			  
			 System.out.println("请输入要查询的用户名：");
			    username = in.next();		
			    
					flag=queryuser.query(username);

					if(!flag)
						 System.out.println("查询失败  没有该用户！！");
				System.out.println("请继续选择操作-----");
				  choice=in.nextInt();
				  customer(choice);
		    break;
		 }
		 //删除客户信息	
		 case 5:
		 {
			  boolean flag=false;
			  Scanner delet = new Scanner(System.in);
			 Deletuser deletuser = new Deletuser();
			 
			 System.out.println("请输入要删除的用户：");
			     username = delet.next();		
		     
				deletuser.delet(username);
		
		
			if(flag)
				System.out.println("删除用户成功！！");
			else
			 System.out.println("删除用户失败！！");
			System.out.println("请继续选择操作-----");
			  choice=in.nextInt();
			   customer(choice);
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
