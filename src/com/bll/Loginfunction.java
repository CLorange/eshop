package com.bll;

import java.io.File;

import com.user.xml.*;
public class Loginfunction {          
     public boolean login(String username,String password)
      {
    	             boolean flag=false;
     	             Login loginf = new Login();
			try {
				
				flag = loginf.login(username,password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	
          return flag;
     }
		
}

