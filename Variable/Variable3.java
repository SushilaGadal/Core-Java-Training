class Account{
int amount;
Double rate; 
static String bank;
} 
class AccountInfo{
public static void main(String args[]){
Account sushila = new Account();
sushila.amount = 20000;
sushila.rate = 12.32;
Account.bank = "ACB";
System.out.println("amount = " +sushila.amount);
System.out.println("rate = " + sushila.rate);
System.out.println("bank = " + Account.bank);
}
}