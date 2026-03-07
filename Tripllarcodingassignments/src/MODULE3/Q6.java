package MODULE3;

    public class BankAccount {
        String accountNumber;
        double balance;
        BankAccount(String accNo, double initialBalance) {
            accountNumber = accNo;
            balance = initialBalance;
        }
        void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
        void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance!");
            }
        }
        void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        public static void main(String[] args) {
            BankAccount acc1 = new BankAccount("12345ABC", 1000);
            acc1.display();
            acc1.deposit(500);
            acc1.withdraw(300);
            acc1.withdraw(1500);
            acc1.display();
        }
    }
