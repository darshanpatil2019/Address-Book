import java.util.Scanner;

public class AddresssBook {
    //Scanner object for user input
    Scanner sc = new Scanner(System.in);

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
        contacts.seteMailID(sc.next());
    }
    // Method to show contact details
    public void displayContact() {
        System.out.println("Contact Details -");
        System.out.println("FirstName : "+contacts.getFirstName());
        System.out.println("LastName : "+contacts.getLastName());
        System.out.println("Address : "+contacts.getAddress());
        System.out.println("City : "+contacts.getCity());
        System.out.println("State : "+contacts.getState());
        System.out.println("Zip Code : "+contacts.getZip());
        System.out.println("Phone Number : "+contacts.getPhoneNo());
        System.out.println("EmailID : "+contacts.geteMailID());
    }

}
