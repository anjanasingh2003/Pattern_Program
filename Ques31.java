/*

 987654321
  7654321
   54321
    321
     1

 */

 import java.util.Scanner;
 public class Ques31
 {
     public static void main(String[] args) 
     {    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
 
            for(int i=1; i<=n; i++)
         {
           int  num = 2*(n-i)+1;
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*(n-i)+1); k++)
            {
                System.out.print(num);
                num--;
            } 
            
             System.out.println( );
         }
         sc.close();
         
     }
 }