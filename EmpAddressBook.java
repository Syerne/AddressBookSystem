package com.blz.profile;

import com.blz.profile.dto.Contacts;

public class EmpAddressBook {
    public static void main(String[] args) {
        displayMessage();
        Contacts contacts = new Contacts();
        System.out.println(contacts.toString());
    }
    public static void displayMessage(){
        System.out.println("Welcome to Bridge Employee Address Book");
    }
}
