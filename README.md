# Java_Banking_System
This Java project demonstrates multilevel inheritance with classes: Bank_Data, Customer_Registration, and Bank_Transaction. It allows user registration, login with ID &amp; password, and basic banking operations like deposit, withdraw, loan, and balance check using console input.



This is a basic Java-based Banking Application using Object-Oriented Programming (OOP) concepts such as Inheritance, Encapsulation, and Class Hierarchies. The project simulates real-life banking functionalities like:

✨ Features:
-Customer Registration
Collects user details: name, user ID, password, address, phone, Gmail, Aadhar, PAN.
Stores data using class-level variables.

-Login Authentication
Validates account number and PIN before performing transactions.

-Transactions
Withdraw money
Deposit money
Apply for a Loan
Check account balance

-Code Structure
Bank_Data: Base class containing user details, account information, and scanner.
Customer_Registration: Inherits from Bank_Data, handles registration and login.
Bank_Transaction: Inherits from Customer_Registration, manages transactions.
main() method inside Bank_Data executes the flow.

🛠️ Technologies Used:
Java (Core)
Scanner for input
Console-based interaction

📌 How to Run:
Clone the repository.
Compile and run the Bank_Data class containing the main() method.
Follow on-screen instructions for registration and transactions
