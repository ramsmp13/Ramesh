
public class AccountBalance {

	static int accountbal=10000;
	 int checkbal()
	{
		accountbal=accountbal-2000;
		return accountbal;
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBalance ab=new AccountBalance();
		//System.out.println("ICICI" + accountbal);
		
		int ICICI = ab.checkbal();
		System.out.println("ICICI balance is" + ICICI);
		int HDFC = ab.checkbal();
		System.out.println("HDFC balance is" + HDFC);
		int SBI = ab.checkbal();
		System.out.println("HDFC balance is" + SBI);
			}

}