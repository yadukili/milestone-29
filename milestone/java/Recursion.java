package threeD;
import java.util.*;


	class power
	{
		int display(int a,int b)
		{
			
			if (b == 0) 
			{
	            return 1;
	        }
			else
	        {
	            return a * display(a, b - 1);
	        }

			

			}
	}

	public class Recursion {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			power p=new power();
	        System.out.print("Enter a value");
	        int a = sc.nextInt();
	        System.out.print("Enter the powervalue ");
	        int b = sc.nextInt();
	       int result= p.display(a,b);
	       System.out.println(result);


}
	}
