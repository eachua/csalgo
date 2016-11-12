package SieveOfEratosthenes;

import java.util.Scanner;

public class SieveOfEratosthenes{

   public void primes(int j){
       boolean[] primes = new boolean[j + 1];
       for (int i = 2; i < primes.length; i++){
           primes[i] = true;
       }
       int num = 2;
       while (true){
           for (int i = 2;; i++){
               int multiple = num * i;
               if (multiple > j){
                   break;
               } 
               else{
                   primes[multiple] = false;
               }
           }
           boolean nextnumFound = false;
           for (int i = num + 1; i < j + 1; i++) {
               if (primes[i]){
                   num = i;
                   nextnumFound = true;
                   break;
               }
           }
           if (!nextnumFound){
               break;
           }
       }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]){
               System.out.println(i);
           }
       }
   }
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter a number: ");
       int n = scanner.nextInt();
       SieveOfEratosthenes sieve = new SieveOfEratosthenes();
       sieve.primes(n);
   }

}
