public class Bank {
    public static void main(String[] args) {

        BankAcc b1 = new BankAcc();
        b1.setAcc(101111, "saving", 10000.00);
        b1.getAcc();
        b1.deposit();
        b1.withdraw();
    }

}

class BankAcc {
    private int accNo;
    private String acctype;
    private double balance;
    double withdraw1;
    double deposit;
    static double interestRate;

    public void setAcc(int accNo, String acctype, double balance) {
        this.accNo = accNo;
        this.acctype = acctype;
        this.balance = balance;

    }

    public void getAcc() {
        System.err.println("ACC No.:" + accNo + "acc type : " + acctype + " balance" + balance);
    }

    static {
        interestRate = 4.5;
    }

    public void withdraw() {
        System.err.println(2000 - balance);

    }

    public void deposit() {
        System.err.println(1000 + balance);

    }
}

// Static Variable: Create a class BankAccount with accno, accType, Balance
// and static variable interestRate.
// Initialize it using a static block. Implement
// methods to deposit and withdraw funds.
// Create objects and display details.