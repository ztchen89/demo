package POJ_ACM;

import java.util.Scanner;

public class Main
{
	public static long f(int n)
	{
		long n1 = 0, n2 = 1;
		long temp = 0;
		
		for(int i = 1; i < n; i++)
		{
			temp = n1;
			n1 = n2;
			n2 += temp;
		}
		return n2;
	}
	
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       while(n>=0 && n<=70)
        {                   
              System.out.println(f(n));
              n=in.nextInt();
         }
    }
}
