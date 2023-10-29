package threeD;
import java.util.*;

public class AverageArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0;
		 
		System.out.println("enter the no of items to enter");
		int n=sc.nextInt();
		System.out.println("enter the items");
		double a[]=new double[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();  
		
		}
		for(int i=0;i<n;i++)
			
		{
			 total=total+a[i];
		
		}
		double max=a[0];
		double secondMax=0;
		for(int i=0;i<n;i++)
		{
			if (a[i]>max)
			{
				secondMax=max;
				max=a[i];
			}
			
		}
		
		System.out.println("second maximum is: "+secondMax);
		
	
		System.out.println("average is "+total/n);
		
	}
}
