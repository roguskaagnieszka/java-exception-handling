package exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Not enough funds for transfer of amount: " + amount);
        }
        balance -= amount;
        System.out.println("Transfer of " + amount + " completed successfully.");
    }
}

class ThrowOwnException {
    public static void main(String[] args) {
        Account myAccount = new Account("John Doe", 500, "123456789");
        System.out.println("owner: " + myAccount.getOwner());
        System.out.println("balance: " + myAccount.getBalance());
        System.out.println("account number: " + myAccount.getAccountNumber());

        try {
            System.out.println("\nAttempting a transfer...");
            myAccount.transfer(700);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Final account balance: " + myAccount.getBalance());
        }
    }
}
