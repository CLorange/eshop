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
		  //���������Ʒ��Ϣ	
		 case 1:
		 {
			    
		     Printgoods print = new Printgoods();
		         print.print();

			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			  management(choice);
			
		    break;
		 }
		  //�����Ʒ
		 case 2:
		 {
			 boolean flag=false;
		   Addgoods addgoods = new Addgoods();
		   System.out.println("��������Ʒ���ƣ�");
		   goodsname = in.next();
		    System.out.println("��������Ʒ�۸�");
		    goodsprice = in.next();
		   
				flag=addgoods.add(goodsname, goodsprice);
				
			if(flag)
				System.out.println("�����Ʒ�ɹ�����");
			else
			 System.out.println("�����Ʒʧ�ܣ���");
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			   management(choice);
		    break;
		 }
		 //�޸���Ʒ��Ϣ	
		 case 3:
		 {
			 String newgoodsname;
			 String newgoodsprice;
			 boolean flag=false;
			 
		    Updategoods updategoods = new Updategoods();
		    System.out.println("������Ҫ�޸ĵ���Ʒ��");
		    goodsname = in.next();
		    System.out.println("������������Ʒ����");
		    newgoodsname=in.next();
		    System.out.println("������������Ʒ�۸�");
		    newgoodsprice = in.next();  
		    
				flag=updategoods.update(goodsname,newgoodsname,newgoodsprice);
				
			if(flag)
				System.out.println("�޸���Ʒ��Ϣ�ɹ�����");
			else
			 System.out.println("�޸���Ʒ��Ϣʧ�ܣ���");
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			  management(choice);
			
		    break;
		 }
		 //����Ʒ���Ʋ�ѯ��Ϣ
		 case 4:
		 {
			 boolean flag=false;
			 Querygoods quergoods = new Querygoods();
			  
			 System.out.println("������Ҫ��ѯ����Ʒ���ƣ�");
			   goodsname = in.next();		
			   
			    flag=quergoods.query(goodsname);
			    if(!flag)
					System.out.println("��ѯ��Ʒʧ�ܣ���");
			    
	
				System.out.println("�����ѡ�����-----");
				  choice=in.nextInt();
				  management(choice);
		    break;
		 }
		 //ɾ����Ʒ��Ϣ	
		 case 5:
		 {
			  boolean flag=false;
			  Scanner delet = new Scanner(System.in);
			  Deletgoods deletgoods = new Deletgoods();
			  
			 System.out.println("������Ҫɾ������Ʒ���ƣ�");
			 goodsname = delet.next();		
		     
			 deletgoods.delet(goodsname);
				
			if(flag)
				System.out.println("ɾ����Ʒ�ɹ�����");
			else
			 System.out.println("ɾ����Ʒ�ܣ���");
			System.out.println("�����ѡ�����-----");
			  choice=in.nextInt();
			   management(choice);
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
