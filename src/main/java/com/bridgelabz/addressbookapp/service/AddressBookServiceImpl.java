package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressBookServiceImpl implements AddressBookService{


    public List<AddressBookData> getAddressBookData(){
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookDTO("Arun Kumar", "R", "male", "7/G", "Chennai", "TN", 123456, 9876543210l, "arun@gmail.com")));
        return addressBookDataList;
    }

    public AddressBookData getAddressBookDataById(int personId){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new AddressBookDTO("Arun Kumar", "R", "male", "7/G", "Chennai", "TN", 123456, 9876543210l, "arun@gmail.com"));
        return addressBookData;
    }

    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    public void deleteAddressBookData(int personId){

    }
}
