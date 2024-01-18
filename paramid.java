
public class paramid {

    public static void main(String[] args) {
        
        int n=5;
	   
	  //outer loop
	  for(int line=1; line<=n; line++)
	  {
	      //space
	      for(int space=1; space<=n-line; space++)
	      {
	          System.out.print(" ");
	          
	      }
	      //desc Number
	      for(int num=line; num>=1; num--)
	      {
	          System.out.print(num);
	      }
	      //asec Number
	      for(int number=2; number<=line; number++)
	      {
	          System.out.print(number);
	      }
	  
	  
	   
		System.out.println();
	  }
	  
    }
    
}
