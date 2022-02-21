package com.company;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    //Able to store, modify, remove and query contact names.

    public void storeContact(String name, String phoneNumber){
        Contact newContact = new Contact(name, phoneNumber);

        if(!contacts.contains(newContact)){
            contacts.add(newContact);
        }
    }

    public void modifyContact(String name, String phoneNumber){
       int contactPos = findContact(name);
       if(contactPos >= 0){
           Contact updatedContact = new Contact(name, phoneNumber);
           contacts.set(contactPos, updatedContact);
       }
    }

    public void removeContact(String name){
        int contactPos = findContact(name);
        if(contactPos >= 0){
            contacts.remove(contactPos);
        }
    }

    public String getContactName(String phoneNumber){
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getPhoneNumber() == phoneNumber){
                return  contacts.get(i).getName();
            }
        }
        return "Contact not found";
    }

    public void printContacts(){
        for (int i=0; i < contacts.size(); i++){
            System.out.println("Contact " + i + ": " + "Name: " + contacts.get(i).getName() + " Phone Number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public boolean hasContact(String name){
       int contactIdx = findContact(name);
        System.out.println("Contact position: " + contactIdx);
       return contactIdx >= 0 ? true : false;
    }

    public int findContact(String name){
         int pos = -1;
        for(int i = 0; i < contacts.size(); i++){

            if(contacts.get(i).getName().equals(name)){
                pos = i;
            }
        }
        return pos;
    }
}
