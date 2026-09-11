interface Payment {
 void payment();
}

class UPI implements Payment {
    public void payment() {
        System.out.println("Payment using UPI");
    }
}

class CreditCard implements Payment {
    public void payment() {
        System.out.println("Payment using Credit Card");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.payment();
        p2.payment();
    }
}