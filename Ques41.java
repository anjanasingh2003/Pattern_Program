/*
 
     5
    54
   543
  5432
 54321
  5432
   543
    54
     5

 */
import java.util.Scanner;
 public class Ques41
 {
     public static void main(String[] args) 
     {    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for (int i=1;i<n;i++)
		{     
            int num = n;
			for (int j=1;j<=(n-i+1);j++)
			{    
				System.out.print(" ");
			}
            for(int k=1; k<=i; k++)
            {
                System.out.print(num);
                num--;
            }
			System.out.println();
		}
		for (int i=1;i<=n;i++)
		{    
            int num=n;
			for (int j=1;j<=i;j++)
			{   
				System.out.print(" ");
			}
            for(int k=1; k<=n-i+1; k++)
            {
                System.out.print(num);
                num--;
            }
			
			System.out.println();
		}     
       sc.close();
    }
 }