package pkgFirst;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows ");
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		//Pattern 1
//		for(int i=0;i<num;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
		
//		//Pattern 2
//		for(int i=1;i<=num;i++)
//			{
//				for(int j=1;j<=i;j++)
//				{
//					System.out.print(j+" ");
//				}
//				System.out.println();
//				
//			}
		
		//Pattern 3
		for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
				
			}
		
		
		
		
	}

}
