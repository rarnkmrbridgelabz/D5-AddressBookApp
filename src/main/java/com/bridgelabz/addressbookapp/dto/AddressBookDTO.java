package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

public @Data class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String gender;
    public String address;
    public String city;
    public String state;
    public Integer zipCode;
    public Long phoneNumber;
    public String emailId;

}
