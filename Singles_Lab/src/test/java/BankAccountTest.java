
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

//   Test First Name Getter

    @Test
    public void canGetFirstName() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        String expected = "Joe";
        String actual = bankaccount.getFirstName();
        assertThat(actual).isEqualTo(expected);
    }

    //    Test First Name Setter
    @Test
    public void canSetFirstName() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        bankaccount.setFirstName("Joe");
        String actual = bankaccount.getFirstName();
        assertThat(actual).isEqualTo("Joe");
    }

    //   Test Last Name Getter
    @Test
    public void canGetLastName() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        String expected = "Lang";
        String actual = bankaccount.getLastName();
        assertThat(actual).isEqualTo(expected);
    }

    //    Test Last Name Setter
    @Test
    public void canSetLastName() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        bankaccount.setLastName("Lang");
        String actual = bankaccount.getLastName();
        assertThat(actual).isEqualTo("Lang");
    }

    //   Test Date of Birth Getter
    @Test
    public void canGetDateOfBirth() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        String expected = "19/05/1966";
        String actual = bankaccount.getDateOfBirth();
        assertThat(actual).isEqualTo("19/05/1966");
    }

    //    Test Date of Birth Setter
    @Test
    public void canSetDateOfBirth() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        bankaccount.setDateOfBirth("19/05/1966");
        String actual = bankaccount.getDateOfBirth();
        assertThat(actual).isEqualTo("19/05/1966");
    }

    //   Test Account Number Getter
    @Test
    public void canGetAccountNumber() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        int expected = 1234567890;
        int actual = bankaccount.getAccountNumber();
        assertThat(actual).isEqualTo(1234567890);
    }

    //    Test Account Number Setter
    @Test
    public void canSetAccountNumber() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        bankaccount.setAccountNumber(1234567890);
        int actual = bankaccount.getAccountNumber();
        assertThat(actual).isEqualTo(1234567890);

    }

    // Test Balance Getter
    @Test
    public void canGetBalance() {
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        double expected = 0;
        double actual = bankaccount.getBalance();
        assertThat(actual).isEqualTo(0);

    }

//    Test Balance Setter
    @Test
    public void canSetBalance(){
        BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        bankaccount.setBalance(0);
        double actual = bankaccount.getBalance();
        assertThat(actual).isEqualTo(0);
    }

//    Test Deposit
@Test
public void didAmountdeposit(){
    BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
        bankaccount.setDeposit(1000);
        double actual = bankaccount.getDeposit();
        assertThat(actual).isEqualTo(1000);
}

//Test Withdrawal
@Test
public void didAmountwithdraw(){
    BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);
    bankaccount.setWithdraw(1000);
    double actual = bankaccount.getWithdraw();
    assertThat(actual).isEqualTo(1000);
}

//Interest Payment
  @Test
    public void Interestpayable(){
      BankAccount bankaccount = new BankAccount("Joe", "Lang", "19/05/1966", 1234567890);

      bankaccount.setInterestRate(0.03);
      double actual = bankaccount.getInterestRate();
      assertThat(actual).isEqualTo(0.03);

}



}
