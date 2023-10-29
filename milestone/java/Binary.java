package threeD;
import java.util.*;

class hello{
	int convert(long num)
	
	{
		 int decimalNumber = 0, i = 0;
		    long remainder;
		    
		    while (num != 0) {
		      remainder = num % 10;
		      num /= 10;
		      decimalNumber += remainder * Math.pow(2, i);
		      ++i;
	}
		    return decimalNumber;
	
	
	
	
}

public class Binary {
	public static void main(String args[])
	{
		  Scanner ob= new Scanner(System.in);
	        System.out.print("Enter a value");
	        long binary= ob.nextLong();
	        hello a=new hello();
	        long result=a.convert(binary);
	        System.out.println(result);
	       

	}

}
}
