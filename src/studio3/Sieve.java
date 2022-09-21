package studio3;
import java.util.Scanner;
public class Sieve 
{

	public static void main(String[] args) 
	{
		Scanner bob = new Scanner(System.in);
		System.out.println("Enter 'n': ");
		int upperLim = bob.nextInt();
		
		int[] list = new int[upperLim+1];
		for (int p = 0; p <= upperLim; p++) 
		{
			list[p] = p;
			//System.out.println(list[p]);
			
		}
		System.out.println("The prime numbers are: ");
		for (int i=0; i <= upperLim; i++)
		{
			if (((list[i]%2 !=0) && (list[i]%3 !=0)) && (list[i]%5 !=0) && (list[i]%7 !=0)|| ((list[i] ==2) || (list[i] ==3) || (list[i] ==5) || (list[i] ==7)))
			{
				System.out.println(list[i]);
			}
		}
	}
}
//((list[i]%2 !=0) && (list[i]%3 !=0)) || ((list[i] ==2) || (list[i] ==3))