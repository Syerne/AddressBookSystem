package com.blz.profile;

import com.blz.profile.Service.AddressBookService;
import com.blz.profile.Service.Serviceprovider.AddressBookServiceProvider;
import com.blz.profile.dto.Contacts;
import com.blz.profile.utils.Inputs;

public class EmpAddressBook {
    public static void main(String[] args) {
        displayMessage();
        Contacts contacts = new Contacts();
        addressBookDetail();
        //System.out.println(contacts.toString());
    }
    public static int addressBookDetail() {
        AddressBookService callMethod = new AddressBookServiceProvider();
        int choice = 0;
        choice = menuCard();
        switch (choice) {
            case 1:
                System.out.println("welcome to the Person Details : " + callMethod.addPersonDetail());
                break;
            case 2:
                System.out.println("Welcome to the Edit Person Detail " + callMethod.editPersonDetail());
            default:
                System.out.println("Enter Vaild Input");
                break;
        }
        return choice;
    }
    public static void displayMessage(){
        System.out.println("Welcome to Bridge Employee Address Book");
    }
    public static int menuCard(){
        System.out.println("1.AddPersonDetail\n2.editPersonDetail");
        System.out.println("Enter choice from menuCard");
        return Inputs.getIntValue();
    }
}


