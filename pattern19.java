import java.util.Scanner;
public class pattern19
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("  ");
            }

            for(int k=1; k<=(n+1-i); k++)
            {
                System.out.print(k+" ");
            }

            System.out.println();
        }
        sc.close();
    }

}