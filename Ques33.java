/*
 
 543212345
  5432345
   54345
    545
     5

 */

 import java.util.Scanner;
 public class Ques33
 {
     public static void main(String[] args) 
     {    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
 
            for(int i=1; i<=n; i++)
         {
           int  num = n;
           int num1 = i;

            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*(n-i)+1); k++)
            {
                if(k<=n-i)
				{
					System.out.print(num);
					num--;
				}
				else
				{
					System.out.print(num1);
					num1++;
				}
            } 
            
             System.out.println( );
         }
         sc.close();
         
     }
 }