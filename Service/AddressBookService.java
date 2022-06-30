package com.blz.profile.Service;

import com.blz.profile.dto.Contacts;

public interface AddressBookService {
    public Contacts addPersonDetail();
    public Contacts editPersonDetail();
    public Contacts deletePersonDetails();
}
