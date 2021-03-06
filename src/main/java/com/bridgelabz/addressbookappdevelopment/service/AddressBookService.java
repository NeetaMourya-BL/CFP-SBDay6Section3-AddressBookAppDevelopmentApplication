package com.bridgelabz.addressbookappdevelopment.service;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDTO;
import com.bridgelabz.addressbookappdevelopment.model.AddressBookData;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {
    private List <AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return addressBookDataList.get(personId);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        addressBookDataList.add(personData);
        return personData;
    }

    @Override
    public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData personData = this.getAddressBookDataById(personId);
        personData.setFirstName(addressBookDTO.firstName);
        personData.setLastName(addressBookDTO.lastName);
        personData.setAddress(addressBookDTO.address);
        personData.setCity(addressBookDTO.city);
        personData.setState(addressBookDTO.state);
        personData.setZip(addressBookDTO.zip);
        personData.setPhoneNumber(addressBookDTO.phoneNumber);
        personData.setEmail(addressBookDTO.email);
        addressBookDataList.set(personId-1, personData);
        return personData;
    }

    @Override
    public void deleteAddressBookData(int personId) {
        addressBookDataList.remove(personId-1);
    }

}