/*

123454321
 1234321
  12321
   121
    1

 */

 import java.util.Scanner;
 public class Ques34
 {
     public static void main(String[] args) 
     {    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
 
            for(int i=1; i<=n; i++)
         {
           int  num = n-i+1;
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*(n-i)+1); k++)
            {
                if(k<=n-i)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print(num);
					num--;
				}
            } 
            
             System.out.println( );
         }
         sc.close();
         
     }
 }