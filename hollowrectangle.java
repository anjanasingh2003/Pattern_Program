public class hollowrectangle
 {
    public static void main(String[] args) 
    {
        int n=4;
        int m=5;

        //outer loop
        for(int i=0; i<n; i++)
        {
            //inner loop
            for(int j=0; j<m; j++)
            {  
                if(i==0 || i==n-1 || j==0 || j==m-1)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
}
