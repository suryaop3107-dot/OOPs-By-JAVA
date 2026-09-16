class Account {
    int balance = 500;

    void withdraw() {
        if (balance >= 700) {
            balance = balance - 700;
            System.out.println("Withdraw: 700");
        } else {
            System.out.println("Not enough balance");
        }
    }

    void deposit() {
        balance = balance + 500;
        System.out.println("Deposit: 500");
    }
}

class Withdrawal extends Thread {
    Account a;

    Withdrawal(Account x) {
        a = x;
    }

    public void run() {
        a.withdraw();
    }
}

class Deposit extends Thread {
    Account a;

    Deposit(Account x) {
        a = x;
    }

    public void run() {
        a.deposit();
    }
}

public class InterThread {
    public static void main(String[] args) {

        Account a = new Account();

        Withdrawal w = new Withdrawal(a);
        Deposit d = new Deposit(a);

        w.start();
        d.start();
    }
}
