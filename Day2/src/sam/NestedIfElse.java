package sam;

public class NestedIfElse 
{

	public static void main(String[] args)
	{
	     int x=80;
	     int y=50;
	     int z=30;
	     System.out.print("The largest number is: ");
	     
	     if(x>y)
	    	 {
	    	 if(x>z)
	    	 
	    		 System.out.print(x);
	    	 else
	    		 System.out.print(z);
	    	 }
	     else
	         {
	         if(z>y)
	        	 System.out.print(z);
	         else
	        	 System.out.print(y);
	         }

	}

}
