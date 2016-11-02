package strassens;

import java.util.*;

public class Strassens {

  
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5,m6,m7;
        int a00, a01, a10, a11, b00, b01, b11, b10;
        int c00, c01,c10,c11;
        Scanner sc = new Scanner(System.in);
        a00 = sc.nextInt();
        a01 = sc.nextInt();
        a10 = sc.nextInt();
        a11 = sc.nextInt();
        b00 = sc.nextInt();
        b01 = sc.nextInt();
        b10 = sc.nextInt();
        b11 = sc.nextInt();
        
        
        
        
        
        
 m1 = (a00 + a11) * (b00 + b11);
m2 = (a10 + a11) * b00;
m3 = a00 * (b01 - b11);
m4 = a11 * (b10 - b00);
m5 = (a00 + a01) * b11;
m6 = (a10 - a00) * (b00 + b01);
m7 = (a01 - a11) * (b10 + b11) ;

        
       c00 = m1 + m4  - m5 + m7;
        c01 =   m3 + m5;    
         c10 = m2 + m4;
         c11  = m1 + m3- m2 + m6;
         
         System.out.println(c00+" "+c01);
         System.out.println(c10+" "+c11);

        
        
    }
    
}
