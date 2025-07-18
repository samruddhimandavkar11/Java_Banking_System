import java.util.Scanner;

public class Bank_Data {

    String c_name, c_add, c_pan, c_aadhar, c_ID, c_gmail, c_pass, c_phone;
    int Pinno = 121, balance = 20000, Acno = 11, choice;
    boolean user_choice = true;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank_Transaction bank = new Bank_Transaction();

        System.out.println("-------WELCOME TO ABC BANK ------");
        System.out.println("1. New Registration");
        System.out.println("2. Existing User Login");
        System.out.print("Enter your choice: ");
        int option = bank.sc.nextInt();
        bank.sc.nextLine(); // consume newline

        switch (option) {
            case 1:
                bank.newRegistration();
                if (bank.existingUser()) {
                    bank.Transaction();
                }
                break;
            case 2:
                if (bank.existingUser()) {
                    bank.Transaction();
                }
                break;
            default:
                System.out.println(" Invalid Option.");
        }

        System.out.println("\n  Thank you for banking with us!");
    }
}
