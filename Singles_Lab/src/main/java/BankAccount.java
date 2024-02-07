

public class BankAccount {

    //    Instance Variables
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;

    private double deposit;

    private double withdraw;

    private double interestRate;


    // Bank Details
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.interestRate = interestRate;

    }



//    Getters and Setters

    // First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //    Date of Birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    Account Number

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
//    Account Balance

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //    Deposit Method

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit){
        this.deposit=deposit;
    }

    public double deposit(double amount) {
        return deposit += amount;}

//    Withdrawal Method
public double getWithdraw() {
    return withdraw;
}
    public void setWithdraw(double withdraw){
        this.withdraw=withdraw;
    }

    public double withdraw(double amount) {
        return withdraw -= amount;}

    // Paying Interest Mehthod

    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public double interestRate(double interestRate){
        return balance + balance* interestRate;
    }


}




