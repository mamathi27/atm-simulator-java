void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BankAccount user = new BankAccount( 164101000001234L,1234,"mamathi",10000);
    System.out.println("Welcome to canara bank");
    System.out.println("enter account holder name:");
    String accName = scan.nextLine();
    System.out.println("enter the account number (15 digit)");
    long accNumber = scan.nextLong();
    System.out.println("enter the pin");
    int pin = scan.nextInt();

    if(accNumber!=user.accountNo || pin != user.pin || !accName.equals(user.accountName)){
        System.out.println("invalid credentials");
        return;
    }
    while (true){
        System.out.println("\n1.Check balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.transaction history");
        System.out.println("5.Exit");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                user.checkBalance();
                break;
            case 2:
                System.out.println("enter the amt:");
                user.deposit(scan.nextDouble());
                break;
            case 3:
                System.out.println("enter the amount:");
                user.withdraw(scan.nextDouble());
                break;
            case 4:
                user.showTransactions();
                break;
            case 5:
                System.out.println("Thank you!");
                return;
            default:
                System.out.println("invalid choice");
        }
    }
}
