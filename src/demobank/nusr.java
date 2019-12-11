package demobank;

import java.util.Scanner;

public class nusr {

   public void a() {
      
      String f_nm,l_nm,PAN,tmp;
      long m,acn;
      
      Scanner din =new Scanner(System.in);
      System.out.println("Welcome to Demo Bank, here you can create new user account to start banking with us.");
      System.out.println("Enter your First");
      f_nm = din.nextLine();
      System.out.println("Enter your last name");
      l_nm = din.nextLine();
      System.out.println("Enter your PAN");
      PAN = din.nextLine();
      System.out.println("Enter your Mobile");
      m = din.nextLong();
      tmp = f_nm + l_nm;
      acn = tmp.hashCode();
            
   sqlcon app = new sqlcon();
   app.insd(acn,f_nm,l_nm,m,PAN);
   //See later for condition
       System.out.println("Your Account is now created.");
      
       wlc bb = new wlc(); 
       bb.grt();
   } 
   
    
   
   
}
