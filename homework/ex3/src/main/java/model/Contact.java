package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

    private String lastName;
    private String firstName;
    private String homeAddress;
    private String phoneNumber;

    private Pattern phoneNumberTemplate = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d\\d[-]\\d\\d\\d");

    @Override
    public String toString() {
        return super.toString();
    }

    public Contact(String lastName, String firstName, String homeAddress, String phoneNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.homeAddress = homeAddress;

        Matcher matcher = phoneNumberTemplate.matcher(phoneNumber);

        if (matcher.find()) {
            this.phoneNumber = phoneNumber;
        } else {
            try {
                throw new IncorrectFormatException("Number is invalid. Please insert a valid number with the XXXX-XXX-XXX format");
            } catch (IncorrectFormatException e) {
                e.printStackTrace();
            }
        }
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.length() == 12) {
            this.phoneNumber = phoneNumber;
        } else {
            try {
                throw new IncorrectFormatException("Number is invalid. Please insert a valid number with the XXXX.XXX.XXX format");
            } catch (IncorrectFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
