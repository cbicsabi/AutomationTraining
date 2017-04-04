package model;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    ArrayList<Contact> list = new ArrayList();

    int x;

    private StringBuilder stringBuilderMethod(Contact e){
        StringBuilder sb = new StringBuilder();

        //x = list.indexOf(e)+1;
        if (x!=0) {
            sb.append("\t" + x + "   ");
        } else
            sb.append("\t" + "    ");
        sb.append(e.getFirstName().toUpperCase() + " ");
        sb.append(e.getLastName().substring(0, 1).toUpperCase() + e.getLastName().substring(1) + " ");
        sb.append("+4" + e.getPhoneNumber());
        sb.append("\n\t\t");
        sb.append(e.getHomeAddress()+"\n");

        return sb;
    }

    public void addContact(Contact e){
        if (list.contains(e)){
            System.out.println("--Sorry, this contact...\n\n" + stringBuilderMethod(e) + "\n...already exists. Try another one.\n");
        } else
            list.add(e);
    }

    public void displayAllContacts(){

        StringBuilder sb = new StringBuilder();


        sb.append("The following Contacts are available:\n");

        for (Contact e: list){

            x = list.indexOf(e)+1;
            sb.append(stringBuilderMethod(e));

        }

        System.out.println(sb);
    }

    public void searchContact(String string){

        StringBuilder sb = new StringBuilder();


        sb.append("Following contact(s) matches your search:\n");

        for (Contact e: list){

            x = list.indexOf(e)+1;
            if (e.getFirstName().toLowerCase().equals(string.toLowerCase())){
                sb.append(stringBuilderMethod(e));
            }
            if (e.getLastName().toLowerCase().equals(string.toLowerCase())){
                sb.append(stringBuilderMethod(e));
            }
            if (e.getPhoneNumber().startsWith(string) || e.getPhoneNumber().contains(string)) {
                sb.append(stringBuilderMethod(e));
            }
        }

        System.out.println(sb);
    }

    public void deleteContact(String string){
        ArrayList<Contact> tempList = new ArrayList();

        for (Contact e: list){
            if (e.getFirstName().toLowerCase().equals(string.toLowerCase())){
                tempList.add(e);
            }
            if (e.getLastName().toLowerCase().equals(string.toLowerCase())){
                tempList.add(e);
            }
            if (e.getPhoneNumber().startsWith(string) || e.getPhoneNumber().contains(string)) {
                tempList.add(e);
            }
        }

        if (tempList.size()>1){
            searchContact(string);
            System.out.println("Please make a query to restrain your search for a single match.");
        } else {
            System.out.println("The following contact will be deleted:\n");
            System.out.println(stringBuilderMethod(tempList.get(0)));
            System.out.println("Are you sure? (Y/N)");

            Scanner input = new Scanner(System.in);

            if (input.next().equals("Y".toLowerCase())){
                list.remove(list.indexOf(tempList.get(0)));
            }

            displayAllContacts();
        }
    }
}
