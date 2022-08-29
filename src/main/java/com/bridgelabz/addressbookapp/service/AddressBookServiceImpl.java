package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class AddressBookServiceImpl implements AddressBookService{
    @Autowired
    private AddressBookRepository addressBookRepository;

    private List<AddressBookData> addressBookDataList = new ArrayList<>();
    public List<AddressBookData> getAddressBookData(){
        return addressBookDataList;
    }

    public AddressBookData getAddressBookDataById(int personId){
        return addressBookDataList.get(personId-1);
    }

    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size()+1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setGender(addressBookDTO.gender);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setZipCode(addressBookDTO.zipCode);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setEmailId(addressBookDTO.emailId);
        return addressBookData;
    }

    public void deleteAddressBookData(int personId){
        addressBookDataList.remove(personId-1);
    }
}
