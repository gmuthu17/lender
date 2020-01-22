public class loan {
    private int amount;
    private boolean isPaid;
    private String borrower;
    private double interestRate;

    public loan(int amount, String borrower, double interestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
    }
}
