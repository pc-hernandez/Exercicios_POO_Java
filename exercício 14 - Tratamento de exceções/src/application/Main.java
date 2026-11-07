import entities.Account;
import exceptions.BusinessException;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Number: ");
    int number = sc.nextInt();
    System.out.print("Name: ");
    String name = sc.next();
    System.out.print("Balance: ");
    double inicialBalance = sc.nextDouble();
    System.out.print("Withdraw Limit: ");
    double withdrawLimit = sc.nextDouble();

    Account account = new Account(number, name, inicialBalance, withdrawLimit);

    System.out.print("amount for withdraw: ");
    double amount = sc.nextDouble();


    try {
        account.withdraw(amount);
        System.out.print("\n" + account);
    }
    catch (BusinessException e) {
        System.out.println(e.getMessage());
    }

}
