public class Customer_Registration extends Bank_Data {

    public void newRegistration() {
        System.out.println("\n=== User Registration ===");
        System.out.print("Enter Name: ");
        c_name = sc.nextLine();

        System.out.print("Create User ID: ");
        c_ID = sc.nextLine();

        System.out.print("Create Password: ");
        c_pass = sc.nextLine();

        System.out.print("Enter Address: ");
        c_add = sc.nextLine();

        System.out.print("Enter Phone: ");
        c_phone = sc.nextLine();

        System.out.print("Enter Gmail: ");
        c_gmail = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        c_aadhar = sc.nextLine();

        System.out.print("Enter PAN Number: ");
        c_pan = sc.nextLine();

        System.out.println(" User Registered Successfully!\n");
    }

    public boolean existingUser() {
        System.out.println("\n=== Existing User Login ===");
        System.out.print("Enter Account No.: ");
        int inputAcNo = sc.nextInt();

        System.out.print("Enter Pin number: ");
        int inputPin = sc.nextInt();
        sc.nextLine(); // consume newline

        if (Acno == inputAcNo && Pinno == inputPin) {
            System.out.println(" Welcome, " + c_name + "!\n");
            return true;
        } else {
            System.out.println(" Invalid account number or PIN!\n");
            return false;
        }
    }
}
