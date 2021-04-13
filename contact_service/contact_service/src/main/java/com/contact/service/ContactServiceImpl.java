package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list contact
    List<Contact> list=List.of(
            new Contact(1L,"sunil@gmail.com","Sunil",1L),
            new Contact(2L,"amit@gmail.com","Amit",1L),
            new Contact(3L,"anul@gmail.com","Anil",2L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
