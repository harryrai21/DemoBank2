package demobank;

import java.util.Scanner;
import logo.logoScr;

public class wlc {
   
    public void grt(){
    
    logoScr pd = new logoScr();
    pd.x();
    nusr xx = new nusr();
        
        
         System.out.println("Welcome to Demo Bank. Please choose the appropriate option");
         
         Scanner x = new Scanner(System.in);
         System.out.println("[1]Exesting User"+" "+" "+" "+" "+" "+"[2]New User");
         int a = x.nextInt();

         if (a==1){System.out.println("Comming Soon");}
         else if(a==2){xx.a();}
         else if (a==0){System.exit(0);}
         else{System.out.println("Invalid Input Selected");}
 }

}
