public class Bank_Transaction extends Customer_Registration {

    public void Transaction() {
        do {
            System.out.println("\n=== Transaction Menu ===");
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Apply for Loan");
            System.out.println("4: Check Balance");
            System.out.println("5: Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int wd = sc.nextInt();
                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println(" Withdrawal Successful. Current Balance: ₹" + balance);
                    } else {
                        System.out.println(" Insufficient Balance!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int dp = sc.nextInt();
                    balance += dp;
                    System.out.println(" Deposit Successful. Current Balance: ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter loan amount: ");
                    int loan = sc.nextInt();
                    System.out.println("Loan of ₹" + loan + " applied successfully. Bank will contact you soon.");
                    break;

                case 4:
                    System.out.println(" Current Balance: ₹" + balance);
                    break;

                case 5:
                    System.out.println(" Exiting Transaction Menu...");
                    user_choice = false;
                    break;

                default:
                    System.out.println(" Invalid Choice.");
            }
        } while (user_choice);
    }
}
