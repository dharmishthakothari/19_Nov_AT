package pkgFirst;

import java.util.Scanner;

public class Pattern3 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter no of rows ");
			Scanner scan=new Scanner(System.in);
			int k=1;
			int num=scan.nextInt();
			for(int i=0;i<num*2;i++)
			
				if(i<=num)
				{
					for(int j=num;j>i;j--)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				else
				{
					for(int j=0;j<=i-num;j++)
					{
						System.out.print("* ");
						
					}
					System.out.println();
				}
				
			}
		
}

