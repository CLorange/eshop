package com.bll;

import java.util.Scanner;

public class Luckdraw2 implements Runnable
{
	 boolean die=true;
	 int chioce=1;
	 int number2=0;
	 Scanner in = new Scanner(System.in);
	 Thread number,stop;
	 
	 public Luckdraw2() 
	 {
		 System.out.println("³é½±¿ªÊ¼............");
		 number = new Thread(this);
		  stop = new Thread(this);
		 
	  }
	public void lucky()
	{
		number.setDaemon(true);
          number.start();
	       stop.start();
	    while(number.isAlive())
	    {
	    	
	    }
		  
	}
	public int getnumber()
	 {
	 
		 return number2;
	 }

	@Override
	public void run() 
	{
		  
	 while(die)
	   {
		if(Thread.currentThread()==number&&die)
		{
			  number2++;
		   System.out.println("³é½±ÖÐ.......   "+number2+"ºÅ");
			try {

					number.sleep(500);
				} catch (InterruptedException e) {
					
				}
		        if(number2==10)
			        number2=0;
          	}

		else if(Thread.currentThread()==stop)
		{
			while(die)
			{
		         chioce=in.nextInt();
		         if(chioce==2)		         
		              die=false;
		      
				
			}
	
		}
      }	
	}

	}

