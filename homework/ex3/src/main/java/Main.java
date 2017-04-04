import model.Contact;
import model.IncorrectFormatException;
import model.PhoneBook;

public class Main {

    public static void main(String[] args) throws IncorrectFormatException {
        Contact Mirel = new Contact("Ghz", "Mirel", "demo","0725-025-263");
        Contact Mirel2 = new Contact("Gheorghitza", "Mirel", "str Palat, United Bussines Center 1, 3E, Iasi","0736-025-234");
        Contact Mirel3 = new Contact("Gheorghitza", "Mirutz", "str Palat, United Bussines Center 12, 3E, Iasi","0737-025-235");
        

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(Mirel);
        phoneBook.addContact(Mirel2);
        phoneBook.addContact(Mirel2);
        phoneBook.addContact(Mirel3);

        phoneBook.displayAllContacts();

        phoneBook.searchContact("0736");

        phoneBook.deleteContact("0737");
    }
}
