package belajarforloop;
import java.util.Scanner;
public class segitigakebalik {
   public static void main(String[]args){
       
       System.out.print("MASUKAN PILIHAN MU ");
       Scanner inputmasukanpilihanmu = new Scanner(System.in);
       String masukanpilihanmu = inputmasukanpilihanmu.nextLine();
       
             for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("* ");
           }
           System.out.print("\n");
       }
             System.out.print("\n");
             
           for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("* ");
                if(i == j){
                break;
                }
                   
               }
            System.out.print("\n");
          }
           System.out.print("\n");
           
            for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
               System.out.print("* ");
                if((i + j)==4){
                break;
                }
                   
               }
            System.out.print("\n");
          }
            System.out.print("\n");
            
              for (int i = 0; i < 9; i++) {
           for (int j = 0; j < 9; j++) {
               System.out.print("* ");
                if(i == j){
                break;
                } else if ((i+j)==8){
                break;
                } 
                   
               }
            System.out.print("\n");
          }
              System.out.print("\n");
              
                  for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print(" ");
                if ((i+j)==40) {
                   break;
               }
              
                }
                      System.out.print("\n");
          }
                   System.out.println("\n");
                   
             for (int i = 0; i < 5; i++) {                                
           for (int j = 0; j < 5; j++) {
               System.out.print("* ");
                if ((i+j)==4) {
                   break;
               }
              
                }
                      System.out.print("\n");
             }
             System.out.print("\n");
             for (int i = 0;  i< 10; i++) {
           int x = 0;
                 for (int j = x; j <= i; j++) {
                     System.out.print (" ");
                     x = j;
                 }
                 for (int k = 10; k >= x+1; k--) {
                     System.out.print("*");   
                 }
                 System.out.print("\n");
       }
         System.out.print("\n");
             for (int i = 0;  i< 10; i++) {
           int x = 0;
                 for (int j = x; j <= i; j++) {
                     System.out.print (" ");
                     x = j;
                     if ((j+i)== 9) {
                         break;
                     }
                 }
                 for (int k = 10; k >= x+1; k--) {
                     System.out.print("*");   
                 }
                 System.out.print("\n");
       }
        }
    }
  

