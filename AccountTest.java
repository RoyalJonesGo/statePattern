public class AccountTest {
	public static void main (String[] args){

    //Set the account
		Account myAccount = new Account("1234", 10000.0);
    myAccount.activate();

    //Suspend the account
		myAccount.suspend();

		//Activate the account
    myAccount.activate();
		
		//Deposit to the account
	  myAccount.deposit(1000.0);

    //Withdraw to the account
	  myAccount.withdraw(100.0);                             

		//Close the account()
		myAccount.close();

		//Activate the account
		myAccount.activate();

		//Suspend the account
		myAccount.suspend();

		//Withdraw to the account
    myAccount.withdraw(500.0);

		//Deposit to the account
    myAccount.deposit(1000.0);
    
    }
}
