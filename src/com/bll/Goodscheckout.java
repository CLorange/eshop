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
		//��ӹ����Ʒ
		case 1:
		{
			boolean flag=false;
			Addcommodity addgoods = new Addcommodity();
			
			 System.out.println("�������Ʒ���ƣ�");
			 goodsname = in.next();
			 System.out.println("�����빺��������");
			 goodsprice = in.next();
			try {
				
				flag=addgoods.add(goodsname, goodsprice);
				if(flag)
					System.out.println("��Ʒ����ɹ���������");
				else 
					System.out.println("������Ʒʧ�ܣ���");
			     //�û����������������
 
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�����ѡ�������");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
			break;
		}
		//�޸Ĺ����Ʒ����
		case 2:
		{
			boolean flag = false;
			System.out.println("�������޸Ĳ�Ʒ���ƣ�");
			 goodsname = in.next();
			 System.out.println("���������빺��������");
			 goodsprice = in.next();
			
			Updatecommodity updategoods = new Updatecommodity();
			 try {
				 
				flag=updategoods.update(goodsname, goodsprice);
				if(flag)
					System.out.println("�޸���Ʒ�ɹ�����");
				else 
					System.out.println("�޸���Ʒʧ�ܣ���");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�����ѡ�������");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
	
			break;
		}
		//ɾ�������Ʒ
		case 3:
		{
			boolean flag = false;
			System.out.println("������Ҫɾ���Ĳ�Ʒ���ƣ�");
			 goodsname = in.next();
			 Deletgoods deletgoods= new Deletgoods();
			 try {
				 
				//flag=deletgoods.delet(goodsname);
				if(flag)
					System.out.println("ɾ����Ʒ�ɹ�����");
				else 
					System.out.println("ɾ����Ʒʧ�ܣ���");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�����ѡ�������");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
			break;
		}
		   //���㲢��ӡ
		case 4:
		{
			boolean flag=false;
			Printticket printchekout = new Printticket();
			 flag=printchekout.printfingtickte(Currentuser);
			 if(flag)
					System.out.println("ɾ����Ʒ�ɹ�����");
				else 
					System.out.println("ɾ����Ʒʧ�ܣ���");
			
			System.out.println("�����ѡ�������");
			  chioce2 = in.nextInt();
			  checkout(chioce2,Currentuser);
			 break;
		}
		//�����ϼ�----ϵͳ���˵�
		case 0:
		{
			View getview = new View();
			 getview.SystemMenuview();
			
			 break;
		}
		
	}
	
  }
}
