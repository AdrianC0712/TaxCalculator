
public class Main {
    public static void main(String[] args) {
        double price = 3.56;
        double tax = 5.45;
        int quantity = 5;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt!";

        System.out.println(message);
        total= price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);

    }
}