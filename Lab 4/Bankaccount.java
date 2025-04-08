bclass BankAccount{
String accountNumber;
int balance;
BankAccount(int bal){
balance=bal;
}
void checkBalance(){
System.out.println("Balance  : "+balance);
}
void deposit(int amount){
balance+=amount;
}
void withdraw(int amount){
if(amount<=balance){
balance-=amount;
}
else{
System.out.println("Insufficient balance : " );
}
}
public static void main(String args[]){
BankAccount acc1= new BankAccount(1000);
BankAccount acc2= new BankAccount(500);

acc1.checkBalance();
acc2.checkBalance();

acc1.deposit(1500);
acc1.checkBalance();

acc1.withdraw(400);
acc1.checkBalance();
}
}