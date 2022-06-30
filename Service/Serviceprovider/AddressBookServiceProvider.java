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

    @Override
    public Contacts editPersonDetail() {
        Contacts contacts = editDetail();
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
    private Contacts editDetail(){
            System.out.println("Enter a name you want to edit...");
            String editName = Inputs.getStringValue();
            Contacts contacts = new Contacts();
            boolean found = false;
                if (contacts.getFirstName().equals(editName)) {
                    found = true;

                    System.out.println("What do you want to edit \n" +
                            "1. First Name / 2. Last Name / 3. Address / 4. City / " +
                            "5. State / 6. Zip code / 7. Phone Number / 8. Email");
                    int choice = Inputs.getIntValue();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter new First Name");
                            String newFirstName = Inputs.getStringValue();
                            contacts.setFirstName(newFirstName);
                            break;

                        case 2:
                            System.out.println("Enter new Last Name");
                            String newLastName = Inputs.getStringValue();
                            contacts.setLastName(newLastName);
                            break;

                        case 3:
                            System.out.println("Enter new Address");
                            String newAddress = Inputs.getStringValue();
                            contacts.setAddress(newAddress);
                            break;

                        case 4:
                            System.out.println("Enter new City");
                            String newCity = Inputs.getStringValue();
                            contacts.setCity(newCity);
                            break;

                        case 5:
                            System.out.println("Enter new State");
                            String newState = Inputs.getStringValue();
                            contacts.setState(newState);
                            break;

                        case 6:
                            System.out.println("Enter new Zip code");
                            int newZip = Inputs.getIntValue();
                            contacts.setZipCode(newZip);
                            break;

                        case 7:
                            System.out.println("Enter new Phone Number");
                            long newPhoneNo = Inputs.getLongValue();
                            contacts.setPhoneNum(newPhoneNo);
                            break;

                        case 8:
                            System.out.println("Enter new Email");
                            String newEmail = Inputs.getStringValue();
                            contacts.setEmail(newEmail);
                            break;
                    }
                }
            if (found)
                System.out.println("SUCCESSFUL");
            else
                System.out.println("Name not found");
        return contacts;
    }

}
