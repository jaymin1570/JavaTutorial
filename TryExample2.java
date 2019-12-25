public class TryExample2 {
    public static void main(String args[]) {
        int balance = 5000;
        int withdrawlAmount = 6000;
        try {
            if (balance < withdrawlAmount) {
                throw new ArithmeticException("Insufficientbalance");
            }
            balance = balance - withdrawlAmount;
            System.out.println("Transaction Successfully completed..");
        } catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Program continue....");
    }
}