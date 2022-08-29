package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

@RequestMapping(value = {"","/","/get"})
public ResponseEntity<ResponseDTO> getAddressBookData(){
    AddressBookData addressBookData = null;
    addressBookData = new AddressBookData(1,new AddressBookDTO("Arun Kumar", "R", "male", "7/G", "Chennai", "TN", 123456, 9876543210l, "arun@gmail.com"));
    ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookData);
    return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
}
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId")int personId){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(personId,new AddressBookDTO("Arun Kumar", "R", "male", "7/G", "Chennai", "TN", 123456, 9876543210l, "arun@gmail.com"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call For Id Successful!!", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Address Book Data Successfully: ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId, @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(personId,addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Address Book Data Successfully:", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId")int personId){
        ResponseDTO responseDTO = new ResponseDTO("Address Book Data Deleted Successfully: ", "Delete Id:" +personId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
