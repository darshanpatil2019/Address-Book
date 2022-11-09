import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class AddressBookRepo {
    static Map<String, AddresssBook> addresssBookMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void addNewAddressBook() {
        System.out.println("Enter the Address Book Name :");
        String addressBookName = sc.next();
        if (addresssBookMap.containsKey(addressBookName)) {
            System.out.println("Entered AddressBook is Already Available");
        } else {
            AddresssBook addresssBook = new AddresssBook();
            addresssBookMap.put(addressBookName, addresssBook);
        }
    }

    public static void displayAddressBook() {
        for (String key : addresssBookMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void selectAddressBook() {
        displayAddressBook();
        System.out.println("Enter the Address Book Name :");
        String addressBookName = sc.next();
        if (addresssBookMap.containsKey(addressBookName)) {
            addresssBookMap.get(addressBookName).contactOptions(addresssBookMap.get(addressBookName));
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public static void editAddressBook() {
        displayAddressBook();
        System.out.println("Enter the Address Book Name :");
        String addressBookName = sc.next();
        if (addresssBookMap.containsKey(addressBookName)) {
            System.out.println("Enter the new Name for AddressBook :");
            String newName = sc.next();
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public static void deleteAddressBook() {
        displayAddressBook();
        System.out.println("Enter the Address Book Name :");
        String addressBookName = sc.next();
        if (addresssBookMap.containsKey(addressBookName)) {
            addresssBookMap.remove(addressBookName);
            System.out.println("Address Book is Deleted.");
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public static final int userInput() {
        return sc.nextInt();
    }
}
