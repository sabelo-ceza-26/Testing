package za.ac.cput.service;

import za.ac.cput.domain.Contact;

import java.util.List;

public interface IContactService extends IService<Contact, String>{

    boolean delete(Contact id);
    List<Contact> getAll();

}
