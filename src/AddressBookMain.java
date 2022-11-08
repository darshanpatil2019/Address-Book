import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");


        //Variables for user choice

        int choice;

        //AddressBook class Object for contact management

        AddresssBook addresssBook = new AddresssBook();

        // Show menu for user to Select Operation on AddressBook
        do {
            System.out.println("***ADDRESS BOOK MANAGEMENT***");
            System.out.println("1. ADD NEW CONTACT 2. EDIT CONTACT 3. DELETE CONTACT 4. DISPLAY CONTACT 5. EXIT");
            System.out.println("Please select the Operation Number");

            Scanner scanner = new Scanner(System.in);
            choice = addresssBook.sc.nextInt();

            switch (choice) {
                case 1:
                    // Adding New Contact Details
                    addresssBook.addNewContact();
                    break;
                case 2:
                    //Edit Contact Details
                    addresssBook.editContact();
                    break;
                case 3:
                    break;
                case 4:
                    addresssBook.displayContact();
                    break;
                case 5:
                    System.out.println("Thank you for using Address Book.");
                    break;
                default:
                    System.out.println("Please select the operation between 1 to 5 only");
                    break;
            }
        } while (choice != 5);
    }
}


