package new1;

import java.util.Scanner;

public class Coins {

        double value;
        int v1;
        int v2;
        int v3;
        int v4;
        
           Scanner sc = new Scanner(System.in);
         System.out.println("Enter value: ");
         value = sc.nextDouble();
            
            if(value>=10)
                v1 = (int) (value/10);
            else
                v1=0;
             System.out.println("10="+(int)v1);
             
            if(value>=5);
            v2= (int)(value%10)/5;
            System.out.println("5="+(int)v2);
                
            if(value>=1);
            v3=(int)(value%5);
            System.out.println("1="+(int)v3);
            
            if(value>=0.25);
            v4=(int)(value%1/0.25);
            System.out.println("0.25="+(int)v4);
