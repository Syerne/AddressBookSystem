package com.blz.profile.Service.Serviceprovider;

import com.blz.profile.Service.AddressBookService;
import com.blz.profile.dto.Contacts;
import com.blz.profile.utils.Inputs;

public class AddressBookServiceProvider implements AddressBookService {
    @Override
    public Contacts addPersonDetail() {
        Contacts contacts = addDetail();
        return contacts;
    }
    private Contacts addDetail(){
        Contacts contacts = new Contacts();
        System.out.println("Enter the following Details");
        System.out.println("Enter First Name ");
        contacts.setFirstName(Inputs.getStringValue());
        System.out.println("Enter Last Name");
        contacts.setLastName(Inputs.getStringValue());
        System.out.println("Enter Address");
        contacts.setAddress(Inputs.getStringValue());
        System.out.println("Enter City Name");
        contacts.setCity(Inputs.getStringValue());
        System.out.println("Enter State Name");
        contacts.setState(Inputs.getStringValue());
        System.out.println("Enter email ");
        contacts.setEmail(Inputs.getStringValue());
        System.out.println("Enter ZipCode");
        contacts.setZipCode(Inputs.getIntValue());
        System.out.println("Enter PhoneNumber");
        contacts.setPhoneNum(Inputs.getLongValue());
        return contacts;
    }

}
