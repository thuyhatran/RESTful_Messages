/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.rest_messenger.service;

import com.mc.rest_messenger.model.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MessageService {
    public List<Message>getAllMessages(){
        Message m1 = new Message((int) 1L,"Hello World","Thuya");
        Message m2 = new Message((int) 2L,"Chao World","Tran");
        Message m3 = new Message((int) 3L,"Beautifull day","An");
        
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        
        return list;
        
    }
    
}
