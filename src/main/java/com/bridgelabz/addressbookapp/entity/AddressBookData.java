package com.bridgelabz.addressbookapp.entity;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="address_book")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personId")
    private int personId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zipCode;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email_id")
    private String emailId;


    public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.gender = addressBookDTO.gender;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zipCode = addressBookDTO.zipCode;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.emailId = addressBookDTO.emailId;
    }

}
