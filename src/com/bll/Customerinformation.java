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
		  //������пͻ�	
		 case 1:
		 {
		   Printuser user = new Printuser();
		    
				user.print();
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			  customer(choice);
			
		    break;
		 }
		  //��ӿͻ���Ϣ
		 case 2:
		 {
			 boolean flag=false;
		   Adduser adduser = new Adduser();
		   System.out.println("�������û�����");
		    username = in.next();
		    System.out.println("�������û���¼���룺");
		    password = in.next();
		   
				flag=adduser.add(username, password);

			if(flag)
				System.out.println("����û��ɹ�����");
			else
			 System.out.println("����û�ʧ�ܣ���");
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			  customer(choice);
		    break;
		 }
		 //�޸Ŀͻ���Ϣ	
		 case 3:
		 {
			 boolean flag=false;
			 
		    Updateuser updateuser = new Updateuser();
		    System.out.println("������Ҫ�޸ĵ��û���");
		     username = in.next();
		    System.out.println("�����������û���");
		     newusername=in.next();
		    System.out.println("�����������û���¼���룺");
		    password = in.next();  
		   
				flag=updateuser.update(username,newusername,password);
				
			if(flag)
				System.out.println("�޸��û��ɹ�����");
			else
			 System.out.println("�޸��û�ʧ�ܣ���");
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			  customer(choice);
			
		    break;
		 }
		 //��������ѯ�ͻ���Ϣ
		 case 4:
		 {
			 boolean flag;
			 Queryuser queryuser = new Queryuser();
			  
			 System.out.println("������Ҫ��ѯ���û�����");
			    username = in.next();		
			    
					flag=queryuser.query(username);

					if(!flag)
						 System.out.println("��ѯʧ��  û�и��û�����");
				System.out.println("�����ѡ�����-----");
				  choice=in.nextInt();
				  customer(choice);
		    break;
		 }
		 //ɾ���ͻ���Ϣ	
		 case 5:
		 {
			  boolean flag=false;
			  Scanner delet = new Scanner(System.in);
			 Deletuser deletuser = new Deletuser();
			 
			 System.out.println("������Ҫɾ�����û���");
			     username = delet.next();		
		     
				deletuser.delet(username);
		
		
			if(flag)
				System.out.println("ɾ���û��ɹ�����");
			else
			 System.out.println("ɾ���û�ʧ�ܣ���");
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			   customer(choice);
		    break;
		 }
		 //�����ϼ��˵�----ϵͳ���˵�
		 case 0:
		 {
			 View getview = new View();
			  getview.SystemMenuview();
		
		         break;
		 } 

		}
	
}
	
	
	
	
	
	
	
	
	
	

}
