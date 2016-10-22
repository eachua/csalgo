package new1;

import java.util.Scanner;

public class New1 {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
           double value;
           double v1;
           double v2;
           double v3;
           double v4;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter value: ");
         value = sc.nextDouble();
         v1 = value / 10;
         v2 = (value % 10)/5;
         v3= value %5;
         v4 = (value %1) / 0.25;
         
         System.out.println("10="+(int)v1);
         System.out.println("5="+(int)v2);
         System.out.println("1="+(int)v3);
         System.out.println("0.25="+(int)v4);
         
