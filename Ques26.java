/*
       1
      121
     12321
    1234321
   123454321

 */
import java.util.Scanner;
 public class Ques26
 {
     public static void main(String[] args) 
     {    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
 
            for(int i=1; i<=n; i++)
         {   
            int num=i;
             for(int j=1; j<=n-i; j++)
             {
                 System.out.print(" ");
             } 
 
             for(int k=1; k<=2*i-1; k++)
             {
                if(k<=i)
				{
					System.out.print(k);
				}
				else
				{
					num--;
					System.out.print(num);
				}
             }
             System.out.println( );
         }
         sc.close();
         
     }
 }
 