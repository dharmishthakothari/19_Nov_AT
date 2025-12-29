package pkgFirst;

abstract class Account
{
	abstract double calculateInterest();
}
class SavingAccount extends Account
{
	int amount;
	public SavingAccount(int amount1)
	{
		amount=amount1;
	}
	
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return amount*0.4;
	}
}
class CurrentAccount extends Account
{
	int amount;
	public CurrentAccount(int amount1)
	{
		amount=amount1;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return amount*0.2;
	}
}


public class Abs_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj[] =new Account[10];
		
		obj[0]=new SavingAccount(2000);
		System.out.println(obj[0].calculateInterest());
		obj[1]=new SavingAccount(3000);
		System.out.println(obj[1].calculateInterest());
		obj[2]=new CurrentAccount(2000);
		System.out.println(obj[2].calculateInterest());
		
		
		
		
		
		
		
	}

}
