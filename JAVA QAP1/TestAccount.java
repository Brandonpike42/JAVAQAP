public class TestAccount {
    public static void main(String[] args) {
        // a. Create two accounts
        Account acc1 = new Account("A001", "Alice", 5000);
        Account acc2 = new Account("A002", "Bob", 4000);

        // b. Display initial balances
        System.out.println("Initial Balances:");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());

        // c. Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // d. Display balances after transfer
        System.out.println("\nBalances After Transfer:");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());
    }
}
