public class pattern10
 {
    public static void main(String[] args) 
    {
        int n=9;
        for(int i=1; i<=n; i=i+2)
        {
            for(int j=1; j<=i; j=j+2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
