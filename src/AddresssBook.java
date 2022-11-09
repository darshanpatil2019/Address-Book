import java.util.ArrayList;
import java.util.Scanner;

public class AddresssBook {
    //Scanner object for user input
    Scanner sc = new Scanner(System.in);
    int choice;

    ArrayList<Contacts> contactList = new ArrayList<>();

    //created Contacts object for getter and setter methods

    Contacts contacts = new Contacts();

    //Method to Add new Contact to AddressBook

    public void addNewContact() {
        System.out.println("Enter the Contact Details -");
        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.next());
        System.out.println("Enter the Email ID :");
        contacts.setEMailID(sc.next());
    }

    // Method to show contact details
    public void displayContact() {
        for (Contacts contact : contactList) {
            if (contact.getFirstName() == null) {
                System.out.println("Contact details not Available");
            } else {
                System.out.println("Contact Details -");
                System.out.println("FirstName : " + contacts.getFirstName());
                System.out.println("LastName : " + contacts.getLastName());
                System.out.println("Address : " + contacts.getAddress());
                System.out.println("City : " + contacts.getCity());
                System.out.println("State : " + contacts.getState());
                System.out.println("Zip Code : " + contacts.getZip());
                System.out.println("Phone Number : " + contacts.getPhoneNo());
                System.out.println("EmailID : " + contacts.getEMailID());
            }
        }
    }

    //Method to Edit Existing Contact
    public void editContact() {
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //Check if the given User with First Name
        boolean isAvailable = false;
        for (Contacts contact : contactList) {
            if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;

                System.out.println("Enter the Last Name :");
                contacts.setLastName(sc.next());
                System.out.println("Enter the Address :");
                contacts.setAddress(sc.next());
                System.out.println("Enter the City :");
                contacts.setCity(sc.next());
                System.out.println("Enter the State :");
                contacts.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contacts.setZip(sc.next());
                System.out.println("Enter the Phone Number :");
                contacts.setPhoneNo(sc.next());
                System.out.println("Enter the Email ID :");
                contacts.setEMailID(sc.next());
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found");
        }
    }
    //Method to Delete Existing Contact

    public void deleteContact() {
        //Get first Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //Check if the Given User with First Name
        boolean isAvailable = false;
        for (Contacts contact : contactList) {
            if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
                isAvailable = true;
                contactList.remove(contact);
                System.out.println("Contact Deleted.");
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found");
        }
    }

    public void contactOptions(AddresssBook addresssBook) {
        //Show menu for user to Select Operation on AddressBook
        do {
            System.out.println("***ADDRESS BOOK MANAGEMENT***");
            System.out.println("1. ADD NEW CONTACT 2. EDIT CONTACT 3. DELETE CONTACT 4. DISPLAY CONTACT 5. EXIT");
            System.out.println("Please select the Operation Number");
            choice = addresssBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addresssBook.addNewContact(); //Adding New Contact Details
                    break;
                case 2:
                    addresssBook.editContact(); //Edit Contact Details
                    break;
                case 3:
                    addresssBook.deleteContact(); //Delete contact Details
                    break;
                case 4:
                    addresssBook.displayContact(); //Show Contact Details
                case 5:
                    System.out.println("Thank you For Using Address Book");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        } while (choice != 5);
    }
}
