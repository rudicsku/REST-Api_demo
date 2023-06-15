package com.ltp.contacts.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Contact {

    private String id;
    private String name;
    private String phoneNumber;


    public Contact(){
        this.id = UUID.randomUUID().toString();
    } 

}
