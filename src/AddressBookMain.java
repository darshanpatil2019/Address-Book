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
            System.out.println("1. ADD NEW ADDRESS BOOK 2. EDIT ADDRESS BOOK 3. DELETE ADDRESS BOOK 4. DISPLAY ADDRESS BOOK 5. EXIT");
            System.out.println("Please select the Operation Number");

            Scanner scanner = new Scanner(System.in);
            choice = AddressBookRepo.userInput();

            switch (choice) {
                case 1:
                    // Adding New Address Book to system
                    AddressBookRepo.addNewAddressBook();
                    break;
                case 2:
                    //Edit Address Book Details
                    AddressBookRepo.editAddressBook();
                    break;
                case 3:
                    //Delete Address Book Details
                    AddressBookRepo.deleteAddressBook();
                    break;
                case 4:
                    //Display contact details
                    AddressBookRepo.displayAddressBook();
                    break;
                case 5:
                    AddressBookRepo.selectAddressBook();
                    break;
                case 6:
                    System.out.println("Thank you for using Address Book System");
                default:
                    System.out.println("Please select the operation between 1 to 6 only");
                    break;
            }
        } while (choice != 6);
    }
}


